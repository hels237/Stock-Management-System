package com.example.helscorp.stockmanagement.handler;

import com.example.helscorp.stockmanagement.exceptions.EntityNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;


@RestControllerAdvice
public class RestGlobalExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(EntityNotFoundException.class)
    public ResponseEntity<ErrorDto> handlerException(EntityNotFoundException exception, WebRequest webRequest){

        final HttpStatus notFound = HttpStatus.NOT_FOUND;

        ErrorDto errorDto = ErrorDto.builder()
                .httpStatus(notFound.value())
                .errorCodes(exception.getErrorCodes())
                .message(exception.getMessage())
                .build();



        return new ResponseEntity<>(errorDto,notFound);
    }

}
