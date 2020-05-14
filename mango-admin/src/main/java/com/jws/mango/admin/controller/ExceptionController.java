package com.jws.mango.admin.controller;

import com.jws.mango.core.exception.MangoException;
import com.jws.mango.core.http.HttpResult;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class ExceptionController {

    @ExceptionHandler(MangoException.class)
    @ResponseBody
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public HttpResult handleMangoException(MangoException exception) {
        return HttpResult.error(exception.getMessage());
    }
}
