package com.wpp.cloud.bootdemo.handler;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.NoHandlerFoundException;

import javax.servlet.http.HttpServletRequest;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public ResponseData defaultErrorHandler(HttpServletRequest request, Exception e) {
        ResponseData responseData = new ResponseData();
        responseData.setMessage(e.getMessage());
        if (e instanceof NoHandlerFoundException) {
            responseData.setCode(404);
        } else {
            responseData.setCode(500);
        }
        responseData.setData(null);
        responseData.setStatus(false);
        return responseData;
    }
}

class ResponseData {
    String message;
    Integer code;
    Object data;
    Boolean status;

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }
}
