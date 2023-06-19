package com.lms.university.service.controller;

import com.lms.university.service.controller.base.BaseController;
import com.lms.university.service.dto.FacultyDTO;
import com.lms.university.service.dto.StudyProgramDTO;
import com.lms.university.service.model.StudyProgram;
import com.lms.university.service.service.StudyProgramService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/api/university/study-programs")
public class StudyProgramController extends BaseController<StudyProgram,StudyProgramDTO,Long> {
    @Autowired
    private StudyProgramService service;
    public StudyProgramController(StudyProgramService service) {
        super(service);
    }

    @GetMapping("/facultyId/{id}")
    @ResponseStatus(HttpStatus.OK)
    public List<StudyProgramDTO> getAllByFacId(@PathVariable("id") Long id){
        return service.convertArrayToDTO(service.findAllByFacultyId(id));
    }
}
