package com.lms.subject.service.controller;

import com.lms.subject.service.controller.base.BaseController;
import com.lms.subject.service.dto.SubjectMaterialDTO;
import com.lms.subject.service.model.SubjectMaterial;
import com.lms.subject.service.service.SubjectMaterialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/subject/subject-material")
public class SubjectMaterialController extends BaseController<SubjectMaterial, SubjectMaterialDTO,Long> {
    @Autowired
    private SubjectMaterialService service;
    public SubjectMaterialController(SubjectMaterialService service) {
        super(service);
    }
}
