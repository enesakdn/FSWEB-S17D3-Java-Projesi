package com.workintech.s17g3.exceptions;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
@Slf4j
public class AnimalRestExceptionHandler {
    @ExceptionHandler
    public ResponseEntity<AnimalErrorResponse> handleException(AnimalException exception){
        AnimalErrorResponse response = new AnimalErrorResponse(exception.getStatus().value(),
                exception.getMessage(), System.currentTimeMillis());
        log.error(exception.getMessage());
        return new ResponseEntity<>(response, exception.getStatus());
    }

    @ExceptionHandler
    public ResponseEntity<AnimalErrorResponse> handleException(Exception exception){
        AnimalErrorResponse response = new AnimalErrorResponse(HttpStatus.BAD_REQUEST.value(),
                exception.getMessage(), System.currentTimeMillis());
        log.error(exception.getMessage());
        return new ResponseEntity<>(response, HttpStatus.BAD_REQUEST);
    }


}
