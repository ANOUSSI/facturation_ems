package com.api.ems.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NO_CONTENT)
public class VersementNotFountException  extends  RuntimeException{
    public VersementNotFountException(String message) {
        super(message);
    }
}
