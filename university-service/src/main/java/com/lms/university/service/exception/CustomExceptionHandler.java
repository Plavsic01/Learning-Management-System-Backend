package com.lms.university.service.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.sql.SQLIntegrityConstraintViolationException;

@ControllerAdvice
public class CustomExceptionHandler {

    @ExceptionHandler(SQLIntegrityConstraintViolationException.class)
    public ResponseEntity<String> handleConstraintViolationException(SQLIntegrityConstraintViolationException ex) {
        String msg = "Sorry, the operation could not be completed due to a constraint violation." +
                " Please check your input and try again.";
        return new ResponseEntity<>(msg,HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(DoesNotExistException.class)
    public ResponseEntity<String> handleNotFoundException(DoesNotExistException ex) {
        String msg = ex.getMessage();
        return new ResponseEntity<>(msg,HttpStatus.NOT_FOUND);
    }
}