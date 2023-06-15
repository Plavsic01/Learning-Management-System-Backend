package com.lms.subject.service.controller;

import com.lms.subject.service.controller.base.BaseController;
import com.lms.subject.service.dto.SubjectEnrollmentDTO;
import com.lms.subject.service.dto.studentDTO.StudentDTO;
import com.lms.subject.service.model.SubjectEnrollment;
import com.lms.subject.service.service.SubjectEnrollmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/api/subject/subject-enrollment")
public class SubjectEnrollmentController extends BaseController<SubjectEnrollment,SubjectEnrollmentDTO,Long> {
    @Autowired
    private SubjectEnrollmentService service;
    public SubjectEnrollmentController(SubjectEnrollmentService service) {
        super(service);
    }


    @GetMapping("/test")
    @ResponseStatus(HttpStatus.OK)
    public StudentDTO test(){
        return service.findStudent(1L);
    }
}
