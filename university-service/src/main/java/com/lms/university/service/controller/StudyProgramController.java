package com.lms.university.service.controller;

import com.lms.university.service.controller.base.BaseController;
import com.lms.university.service.dto.StudyProgramDTO;
import com.lms.university.service.model.StudyProgram;
import com.lms.university.service.service.StudyProgramService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/study-programs")
public class StudyProgramController extends BaseController<StudyProgram,StudyProgramDTO,Long> {
    private StudyProgramService service;
    public StudyProgramController(StudyProgramService service) {
        super(service);
    }
}
