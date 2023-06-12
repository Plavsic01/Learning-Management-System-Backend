package com.lms.teacher.service.controller.base;

import com.lms.university.service.service.base.BaseService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


public abstract class BaseController<T,P,I> {

    private final BaseService<T, P, I> service;

    public BaseController(BaseService<T, P, I> service) {
        this.service = service;
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<P> getAll() {
        return service.findAll();
    }

    @GetMapping(path = "{id}")
    @ResponseStatus(HttpStatus.OK)
    public P getOne(@PathVariable("id") I id){
        return service.findOne(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public P create(@Valid @RequestBody T object){
        return service.save(object);
    }

    @PutMapping(path = "{id}")
    @ResponseStatus(HttpStatus.OK)
    public P update(@PathVariable("id") I id,@RequestBody T object){
        System.out.println(object);
        return service.update(id,object);
    }

    @DeleteMapping("{id}")
    @ResponseStatus(HttpStatus.OK)
    public void delete(@PathVariable("id") I id){
        service.delete(id);
    }

    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public Map<String, String> handleValidationExceptions(
            MethodArgumentNotValidException ex) {
        Map<String, String> errors = new HashMap<>();
        ex.getBindingResult().getAllErrors().forEach((error) -> {
            String fieldName = ((FieldError) error).getField();
            String errorMessage = error.getDefaultMessage();
            errors.put(fieldName, errorMessage);
        });
        return errors;
    }

}
