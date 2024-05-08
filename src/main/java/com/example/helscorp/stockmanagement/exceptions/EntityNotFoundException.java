package com.example.helscorp.stockmanagement.exceptions;

import lombok.Getter;

@Getter
public class EntityNotFoundException extends RuntimeException{

    private ErrorCodes errorCodes;

    public EntityNotFoundException(String message){
        super(message);
    }

    public EntityNotFoundException(String message,Throwable cause){
        super(message, cause);
    }

    public EntityNotFoundException(String message,Throwable cause , ErrorCodes errorCodes){
        super(message,cause);
        this.errorCodes = errorCodes;
    }
}