package com.andrade.generator_qr_code.handlerException;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.andrade.generator_qr_code.exception.InvalidUrlException;

@ControllerAdvice
public class HandlerException {

    @ExceptionHandler(InvalidUrlException.class)
    public ResponseEntity<String> handleInvalidUrlException(InvalidUrlException ex) {
        
        return ResponseEntity
                .badRequest()
                .body("Invalid URL, please try another one");
    }

}
