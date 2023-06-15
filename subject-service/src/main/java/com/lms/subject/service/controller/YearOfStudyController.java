package com.lms.subject.service.controller;

import com.lms.subject.service.controller.base.BaseController;
import com.lms.subject.service.dto.YearOfStudyDTO;
import com.lms.subject.service.model.YearOfStudy;
import com.lms.subject.service.service.YearOfStudyService;
import com.lms.subject.service.service.base.BaseService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/subject/year-of-study")
public class YearOfStudyController extends BaseController<YearOfStudy,YearOfStudyDTO,Long> {
    private YearOfStudyService service;
    public YearOfStudyController(YearOfStudyService service) {
        super(service);
    }
}
