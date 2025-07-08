package com.epoch.service;

import com.epoch.domain.BookInfo;

import java.util.List;

public interface BookService {
    public List<BookInfo> findAll();
    public BookInfo findById(Integer id);
    public Boolean addBookInfo(BookInfo bookInfo);
    public Boolean updateBookInfo(BookInfo bookInfo);
    public Boolean deleteBookInfo(Integer id);
}
