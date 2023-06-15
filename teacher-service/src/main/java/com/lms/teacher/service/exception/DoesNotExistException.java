package com.lms.teacher.service.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class DoesNotExistException extends RuntimeException{
    public DoesNotExistException() {
        super("Does Not Exist");
    }
}
