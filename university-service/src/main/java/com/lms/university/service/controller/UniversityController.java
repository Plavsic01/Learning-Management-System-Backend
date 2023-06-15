package com.lms.university.service.controller;

import com.lms.university.service.controller.base.BaseController;
import com.lms.university.service.dto.UniversityDTO;
import com.lms.university.service.model.University;
import com.lms.university.service.service.UniversityService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/university/university")
public class UniversityController extends BaseController<University,UniversityDTO,Long> {
    private UniversityService service;
    public UniversityController(UniversityService service) {
        super(service);
        this.service = service;
    }
}
