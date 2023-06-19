package com.lms.teacher.service.controller;

import com.lms.teacher.service.controller.base.BaseController;
import com.lms.teacher.service.dto.TypeOfScientificDisciplineDTO;
import com.lms.teacher.service.model.TypeOfScientificDiscipline;
import com.lms.teacher.service.service.base.BaseService;
import com.lms.teacher.service.service.base.TypeOfScientificDisciplineService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/teacher/typeOfScientificDiscipline")
public class TypeOfScientificDisciplineController extends BaseController<TypeOfScientificDiscipline, TypeOfScientificDisciplineDTO, Long> {

    private TypeOfScientificDisciplineService service;
    public TypeOfScientificDisciplineController(BaseService<TypeOfScientificDiscipline, TypeOfScientificDisciplineDTO, Long> service) {
        super(service);
    }
}
