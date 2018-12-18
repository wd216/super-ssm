package com.nf147.ssms.controller.advice;


import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.io.IOException;

/**
 *  这里的异常对所有的 Controller 都会有效
 */

@Component
@ControllerAdvice
public class ExceptionAdvice {
    @ExceptionHandler(Exception.class)
    @ResponseStatus(value = HttpStatus.URI_TOO_LONG)
    @ResponseBody
    public Object handlerDbException (IOException ex) {
        return ex;
    }
}
