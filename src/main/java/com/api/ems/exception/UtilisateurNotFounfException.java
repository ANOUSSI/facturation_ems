package com.api.ems.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class UtilisateurNotFounfException extends  RuntimeException{
    public UtilisateurNotFounfException(String message) {
        super(message);
    }
}
