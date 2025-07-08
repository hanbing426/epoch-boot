package com.epoch.service.impl;

import com.epoch.dao.BookDao;
import com.epoch.domain.BookInfo;
import com.epoch.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
public class BookServiceImpl implements BookService {
    @Autowired
    private BookDao bookDao;
    @Override
    @Transactional(readOnly = true)
    public List<BookInfo> findAll() {
        return bookDao.findAll();
    }

    @Override
    public BookInfo findById(Integer id) {
        return bookDao.findById(id);
    }

    @Override
    public Boolean addBookInfo(BookInfo bookInfo) {
        Boolean isTrue = bookDao.addBookInfo(bookInfo);
        return isTrue;
    }

    @Override
    public Boolean updateBookInfo(BookInfo bookInfo) {
        Boolean isTrue = bookDao.updateBookInfo(bookInfo);
        return isTrue;
    }

    @Override
    public Boolean deleteBookInfo(Integer id) {
        Boolean isTrue = bookDao.deleteBookInfo(id);
        return isTrue;
    }


}
