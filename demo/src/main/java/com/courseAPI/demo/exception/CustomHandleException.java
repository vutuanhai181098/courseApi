package com.courseAPI.demo.exception;

import com.courseAPI.demo.response.ErrorResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class CustomHandleException {
    @ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity<?> handleResourceNotFoundException(ResourceNotFoundException e){
        return new ResponseEntity<>(
            new ErrorResponse(HttpStatus.NOT_FOUND, e.getMessage()),
            HttpStatus.NOT_FOUND
        );
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<?> handleException(Exception e){
        return new ResponseEntity<>(
            new ErrorResponse(HttpStatus.BAD_REQUEST, e.getMessage()),
            HttpStatus.BAD_REQUEST
        );
    }
}
