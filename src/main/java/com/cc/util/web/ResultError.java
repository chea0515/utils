package com.cc.util.web;

public class ResultError {

    private Integer code;
    private String message;

    public ResultError() {}

    public ResultError(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    public static ResultError error(Integer code, String message) {
        return new ResultError(code, message);
    }

    public Integer getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
