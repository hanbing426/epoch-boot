package com.epoch.controller;

import lombok.Data;

@Data
public class Result {
    private Integer code;
    private Object data;
    private String message;
    private Long total;  // 添加 total 字段，表示总记录数
    private int totalPages;
    private int pageNumber;
    private int pageSize;

    public Result(Integer code, Object data, String message, Long total, int totalPages, int pageNumber, int pageSize) {
        this.code = code;
        this.data = data;
        this.message = message;
        this.total = total;
        this.totalPages = totalPages;
        this.pageNumber = pageNumber;
        this.pageSize = pageSize;
    }

    public Result(Integer code, Object data, String message) {
        this.code = code;
        this.data = data;
        this.message = message;
    }

    public Result(Integer code, Object data) {
        this.code = code;
        this.data = data;
    }
}
