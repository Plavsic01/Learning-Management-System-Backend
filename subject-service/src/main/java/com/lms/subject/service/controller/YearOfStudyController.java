package com.lms.subject.service.controller;

import com.lms.subject.service.controller.base.BaseController;
import com.lms.subject.service.dto.YearOfStudyDTO;
import com.lms.subject.service.model.YearOfStudy;
import com.lms.subject.service.service.YearOfStudyService;
import com.lms.subject.service.service.base.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/api/subject/year-of-study")
public class YearOfStudyController extends BaseController<YearOfStudy,YearOfStudyDTO,Long> {
    @Autowired
    private YearOfStudyService service;
    public YearOfStudyController(YearOfStudyService service) {
        super(service);
    }

    @GetMapping("/studyProgramId/{id}")
    @ResponseStatus(HttpStatus.OK)
    public List<YearOfStudyDTO> getByStudyProgramId(@PathVariable("id") Long id){
        return service.findAllByStudyProgramId(id);
    }


}
