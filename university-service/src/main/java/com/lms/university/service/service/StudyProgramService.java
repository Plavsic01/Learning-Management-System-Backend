package com.lms.university.service.service;

import com.lms.university.service.dto.FacultyDTO;
import com.lms.university.service.dto.StudyProgramDTO;
import com.lms.university.service.model.StudyProgram;
import com.lms.university.service.repository.StudyProgramRepository;
import com.lms.university.service.service.base.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudyProgramService extends BaseService<StudyProgram,StudyProgramDTO,Long> {

    @Autowired
    private FacultyService facultyService;
    @Autowired
    private StudyProgramRepository repository;

    public StudyProgramService(StudyProgramRepository repository) {
        super(repository);
    }

    @Override
    public StudyProgramDTO convertToDTO(StudyProgram object) {

        FacultyDTO facultyDTO = facultyService.findOne(object.getFaculty().getId());

        return new StudyProgramDTO(object.getId(),object.getName(), object.getCoordinatorId(),
                new FacultyDTO(facultyDTO.getId(),facultyDTO.getName(),facultyDTO.getAddress(),facultyDTO.getDeanId()));
    }

    public List<StudyProgram> findAllByFacultyId(Long id){
        return repository.findAllByFacultyId(id);
    }
}
