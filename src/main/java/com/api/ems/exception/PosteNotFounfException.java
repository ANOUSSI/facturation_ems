package com.api.ems.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class PosteNotFounfException extends  RuntimeException{
    public PosteNotFounfException(String message) {
        super(message);
    }
}
