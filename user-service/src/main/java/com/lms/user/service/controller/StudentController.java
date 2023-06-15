package com.lms.user.service.controller;

import com.lms.user.service.controller.base.BaseController;
import com.lms.user.service.dto.StudentDTO;
import com.lms.user.service.dto.UserDTO;
import com.lms.user.service.model.Student;
import com.lms.user.service.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/api/user/students")
public class StudentController extends BaseController<Student,StudentDTO,Long> {
    @Autowired
    private StudentService service;

    public StudentController(StudentService service) {
        super(service);
    }


    @GetMapping("/all")
    @ResponseStatus(HttpStatus.OK)
    public List<StudentDTO> getAll(){
        return service.findAll();
    }

}
