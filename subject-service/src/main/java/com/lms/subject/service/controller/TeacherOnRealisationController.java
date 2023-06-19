package com.lms.subject.service.controller;

import com.lms.subject.service.controller.base.BaseController;
import com.lms.subject.service.dto.teacherOnRealisationDTO.TeacherOnRealisationDTO;
import com.lms.subject.service.model.TeacherOnRealisation;
import com.lms.subject.service.service.TeacherOnRealisationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/subject/teacher-on-realisation")
public class TeacherOnRealisationController extends BaseController<TeacherOnRealisation,TeacherOnRealisationDTO,Long> {
    @Autowired
    private TeacherOnRealisationService service;
    public TeacherOnRealisationController(TeacherOnRealisationService service) {
        super(service);
    }
}
