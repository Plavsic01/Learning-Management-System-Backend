package com.lms.subject.service.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class DoesNotExistException extends RuntimeException{
    public DoesNotExistException() {
        super("Error: Item Not Found. The requested item could not be found in the system." +
                " Please check your input and try again.");
    }
}
