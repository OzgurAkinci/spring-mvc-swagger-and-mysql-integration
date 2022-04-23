package com.app.model.base;

import java.util.List;

public class BaseResponse<T> {
    private T data;
    private boolean success = true;
    private ExceptionInfo error;
    private List<ValidationInfo> validations;

    public BaseResponse() {}

    public BaseResponse(T data) {
        this.data = data;
    }

    public BaseResponse(T data, boolean success) {
        this.data = data;
        this.success = success;
    }

    public BaseResponse(boolean success, ExceptionInfo error) {
        super();
        this.success = success;
        this.error = error;
    }


    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public ExceptionInfo getError() {
        return error;
    }

    public void setError(ExceptionInfo error) {
        this.error = error;
    }

    public List<ValidationInfo> getValidations() {
        return validations;
    }

    public void setValidations(List<ValidationInfo> validations) {
        this.validations = validations;
    }
}
