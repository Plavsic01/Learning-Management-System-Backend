package com.lms.subject.service.service;

import com.lms.subject.service.dto.SubjectDTO;
import com.lms.subject.service.dto.YearOfStudyDTO;
import com.lms.subject.service.dto.studyProgramDTO.StudyProgramDTO;
import com.lms.subject.service.model.Subject;
import com.lms.subject.service.repository.SubjectRepository;
import com.lms.subject.service.service.base.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SubjectService extends BaseService<Subject,SubjectDTO,Long> {
    @Autowired
    private SubjectRepository repository;
    @Autowired
    private YearOfStudyService yearOfStudyService;

    public SubjectService(SubjectRepository repository) {
        super(repository);
    }

    public List<SubjectDTO> findAllByYearOfStudyId(Long yearOfStudyId){
        return convertArrayToDTO(repository.findAllByYearOfStudyId(yearOfStudyId));
    }

    @Override
    public SubjectDTO convertToDTO(Subject object) {
        SubjectDTO subjectDTO = new SubjectDTO(object);
        YearOfStudyDTO yearOfStudyDTO = yearOfStudyService.findOne(object.getYearOfStudy().getId());
        StudyProgramDTO studyProgramDTO = yearOfStudyService.findStudyProgram(yearOfStudyDTO.getStudyProgram().getId());
        subjectDTO.getYearOfStudy().setStudyProgram(studyProgramDTO);
        return subjectDTO;
    }


}
