package com.cc.util.web;

public class Result<T> {
    private Boolean success = true;
    private T result;

    public Boolean getSuccess() {
        return success;
    }

    public T getResult() {
        return result;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public void setResult(T result) {
        this.result = result;
    }
}
