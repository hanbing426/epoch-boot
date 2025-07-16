package com.epoch.domain;

import lombok.Data;

@Data
public class BookInfo {
    private Integer id;
    private String title;
    private String sex;
    private String publicationDate;
    private String description;
    private String author;
    private String publishingHouse;
    private String bookId;
}
