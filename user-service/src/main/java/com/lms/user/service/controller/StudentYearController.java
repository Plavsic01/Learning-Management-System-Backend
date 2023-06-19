package com.lms.user.service.controller;

import com.lms.user.service.controller.base.BaseController;
import com.lms.user.service.dto.studentDTO.StudentYearDTO;
import com.lms.user.service.model.StudentYear;
import com.lms.user.service.service.StudentYearService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/api/user/student-year")
public class StudentYearController extends BaseController<StudentYear,StudentYearDTO,Long> {
    @Autowired
    private StudentYearService service;
    public StudentYearController(StudentYearService service) {
        super(service);
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<StudentYearDTO> getAllByStudentId(@RequestParam("studentId") Long studentId){
        return service.findAllByStudentId(studentId);
    }

    @GetMapping("/all")
    @ResponseStatus(HttpStatus.OK)
    public List<StudentYearDTO> getAll(){
        return service.findAll();
    }
}
