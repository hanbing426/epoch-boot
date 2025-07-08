package com.epoch.controller;

import lombok.Data;

@Data
public class Result {
    private Integer code;
    private Object data;
    private String message;

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
