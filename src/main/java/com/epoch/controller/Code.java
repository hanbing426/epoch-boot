package com.epoch.controller;

public class Code {
    // 成功状态码
    public static final Integer SAVE_SUCCESS = 200;
    public static final Integer SUCCESS = 200;
    public static final Integer CREATE_SUCCESS = 201;
    public static final Integer UPDATE_SUCCESS = 204;
    public static final Integer DELETE_SUCCESS = 205;

    // 错误状态码
    public static final Integer ADD_ERROR = 206; // 添加操作失败
    public static final Integer SESYSTEMEXCEPTION_ERROR = 5001; // 添加操作失败
    public static final Integer SAVE_ERROR = 400; // 保存操作失败
    public static final Integer DELETE_ERROR = 401; // 删除操作失败
    public static final Integer SERVICE_ERROR = 500; // 服务端错误
    public static final Integer BUSINESS_EXCEPTION_ERROR = 501; // 业务异常错误
    public static final Integer SYSTEM_EXCEPTION_ERROR = 502; // 系统异常错误
    public static final Integer NOT_FOUND = 504; // 未找到资源
    public static final Integer INVALID_ID = 505; // 无效的ID
    public static final Integer INVALID_PARAM = 404; // 无效的参数
    public static final Integer UPDATE_FAILED = 405; // 更新操作失败
    public static final Integer LOGIN_ERROR = 406; // 登录失败
    public static final Integer CAPTCHA_EXPIRED = 408; // 验证码已过期
    public static final Integer PASSWORD_ERROR = 407; // 密码错误
    public static final Integer CAPTCHA_ERROR = 400; // 验证码错误
    public static final Integer LOGIN_FAILED = 408; // 用户名或密码错误


}