package com.example.wanted_market.global.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)

public class BadRequestException extends RuntimeException {

    private String errorCode;


    public BadRequestException(String errorCode, String message) {
        super(message);
        this.errorCode=errorCode;
    }

    public BadRequestException(String message, Throwable cause) {
        super(message, cause);
    }
}
