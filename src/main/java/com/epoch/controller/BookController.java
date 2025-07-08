package com.epoch.controller;

import com.epoch.domain.BookInfo;
import com.epoch.exception.BusinessException;
import com.epoch.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/bookInfo")
public class BookController {

    @Autowired
    private BookService bookService;
    //    查询所有
    @GetMapping()
    public Result findAll() {
        List<BookInfo> allBookList = bookService.findAll();
        Integer code = allBookList != null ? Code.SUCCESS : Code.SERVICE_ERROR;
        return new Result(code, allBookList, "请求成功！");
    }

    //    根据ID查询
    @GetMapping("/{id}")
    public Result findById(@PathVariable Integer id) {
        System.out.println("删除的时候先执行这个");
        BookInfo bookInfo = bookService.findById(id);
        Integer code = bookInfo != null ? Code.SUCCESS : Code.SERVICE_ERROR;
        return new Result(code, bookInfo, "查询成功");
    }

    //    添加对象
    @PostMapping
    public Result addBookInfo(@RequestBody BookInfo bookInfo) {
        if (bookInfo == null) {
            // 如果传入的书籍对象为空，返回错误结果
            return new Result(Code.ADD_ERROR, null, "添加失败，书籍信息不能为空");
        }
        try {
            Boolean book = bookService.addBookInfo(bookInfo);
            if (book) {
                // 添加成功
                return new Result(Code.SAVE_SUCCESS, null, "添加成功");
            } else {
                // 添加失败（例如数据库操作失败）
                return new Result(Code.ADD_ERROR, null, "添加失败，数据库操作异常");
            }
        } catch (Exception e) {
            // 捕获异常，返回错误信息
            return new Result(Code.SESYSTEMEXCEPTION_ERROR, null, "添加失败，系统异常：" + e.getMessage());
        }
    }

    //    根据ID删除
    @DeleteMapping("/{id}")
    public Result deleteBookInfo(@PathVariable Integer id) {
        if (id == null || id <= 0) {
            // 如果ID无效，抛出BusinessException
//            throw new BusinessException(Code.INVALID_ID, "无效的ID");
            return new Result(Code.ADD_ERROR,null,"无效的ID,请重试！");
        }
        BookInfo bookInfo = bookService.findById(id); //
        System.out.println("接收的id="+id);
        if (bookInfo == null) {
            return new Result(Code.NOT_FOUND, null, "未找到该ID对应的书籍");
        }
        boolean deleted = bookService.deleteBookInfo(id);
        if (!deleted) {
            return new Result(Code.DELETE_ERROR, null, "删除失败，数据库操作异常");
        }

        return new Result(Code.SAVE_SUCCESS, null, bookInfo.getTitle()+"删除成功");
    }
}
