package com.lms.subject.service.controller;

import com.lms.subject.service.controller.base.BaseController;
import com.lms.subject.service.dto.SubjectDTO;
import com.lms.subject.service.model.Subject;
import com.lms.subject.service.service.SubjectService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/subject/subjects")
public class SubjectController extends BaseController<Subject,SubjectDTO,Long> {

    private SubjectService service;

    public SubjectController(SubjectService service) {
        super(service);
    }
}
