package com.lms.subject.service.controller;

import com.lms.subject.service.controller.base.BaseController;
import com.lms.subject.service.dto.SubjectDTO;
import com.lms.subject.service.dto.YearOfStudyDTO;
import com.lms.subject.service.model.Subject;
import com.lms.subject.service.service.SubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/api/subject/subjects")
public class SubjectController extends BaseController<Subject,SubjectDTO,Long> {
    @Autowired
    private SubjectService service;

    public SubjectController(SubjectService service) {
        super(service);
    }

    @GetMapping("/yearOfStudyId/{id}")
    @ResponseStatus(HttpStatus.OK)
    public List<SubjectDTO> getByYearOfStudyId(@PathVariable("id") Long id){
        return service.findAllByYearOfStudyId(id);
    }

}
