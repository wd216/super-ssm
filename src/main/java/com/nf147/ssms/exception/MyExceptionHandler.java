package com.nf147.ssms.exception;


import org.springframework.beans.TypeMismatchException;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.AbstractHandlerExceptionResolver;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyExceptionHandler extends AbstractHandlerExceptionResolver {
    @Override
    protected ModelAndView doResolveException(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) {
        if (ex instanceof ConnException) {
            return new ModelAndView("connerr");
        } else if (ex instanceof TypeMismatchException) {
            return new ModelAndView("typtmiss");
        }
        return null;
    }
}
