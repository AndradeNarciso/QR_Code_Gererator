package com.andrade.generator_qr_code.exceptionHandler;

import org.springframework.messaging.handler.annotation.support.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.andrade.generator_qr_code.exception.InvalidUrlException;

@ControllerAdvice
public class HandlerException {
    
    @ExceptionHandler(InvalidUrlException.class)
    public String handlerInvalidUrlException(InvalidUrlException ex) {
        return "error";
    }

    @ExceptionHandler(MethodArgumentNotValidException.class )
    public String handlerMethodArgumentNotValidException(MethodArgumentNotValidException mx){
        return "error";
    }
}
