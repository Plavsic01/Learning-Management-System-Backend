package com.lms.teacher.service.controller;

import com.lms.teacher.service.controller.base.BaseController;
import com.lms.teacher.service.dto.ScientificDisciplineDTO;
import com.lms.teacher.service.model.ScientificDiscipline;
import com.lms.teacher.service.service.base.ScientificDisciplineService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/teacher/scientificDiscipline")
public class ScientificDisciplineController extends BaseController<ScientificDiscipline, ScientificDisciplineDTO,Long> {

    private ScientificDisciplineService service;

    public ScientificDisciplineController(ScientificDisciplineService service) {
        super(service);
    }
}
