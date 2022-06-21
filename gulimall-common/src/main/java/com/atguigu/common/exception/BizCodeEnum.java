package com.atguigu.common.exception;

/**
 * @Description:
 * @Date Created in 19:58 2022/6/3
 * @Author: Chen_zhuo
 * @Modified By
 */

public enum BizCodeEnum {

    UNKNOWN_EXCEPTION(10000, "系统未知异常"),
    VALID_EXCEPTION(10001, "参数校验失败");

    private Integer code;
    private String msg;

    BizCodeEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public Integer getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }
}