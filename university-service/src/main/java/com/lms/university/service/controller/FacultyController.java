package com.lms.university.service.controller;

import com.lms.university.service.controller.base.BaseController;
import com.lms.university.service.dto.FacultyDTO;
import com.lms.university.service.model.Faculty;
import com.lms.university.service.service.FacultyService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/university/faculty")
public class FacultyController extends BaseController<Faculty,FacultyDTO,Long> {
    private FacultyService service;
    public FacultyController(FacultyService service) {
        super(service);
        this.service = service;
    }
}
