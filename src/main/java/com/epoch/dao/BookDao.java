package com.epoch.dao;

import com.epoch.domain.BookInfo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface BookDao {
    List<BookInfo> findAll();
    BookInfo findById(int id);
    Boolean addBookInfo(BookInfo bookInfo);
    Boolean updateBookInfo(BookInfo bookInfo);
    Boolean deleteBookInfo(int id);
}
