package com.lms.subject.service.service;

import com.lms.subject.service.dto.SubjectInTeacherOnRealisationDTO;
import com.lms.subject.service.model.TeacherOnRealisation;
import com.lms.subject.service.dto.teacherOnRealisationDTO.TeacherOnRealisationDTO;
import com.lms.subject.service.repository.TeacherOnRealisationRepository;
import com.lms.subject.service.service.base.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TeacherOnRealisationService extends BaseService<TeacherOnRealisation,TeacherOnRealisationDTO,Long> {
    @Autowired
    private TeacherOnRealisationRepository repository;
    @Autowired
    private SubjectService subjectService;
    public TeacherOnRealisationService(TeacherOnRealisationRepository repository) {
        super(repository);
    }
    @Override
    public TeacherOnRealisationDTO convertToDTO(TeacherOnRealisation object) {
        TeacherOnRealisationDTO teacherOnRealisationDTO = new TeacherOnRealisationDTO(object);
        SubjectInTeacherOnRealisationDTO subject = new SubjectInTeacherOnRealisationDTO(subjectService.findOneWithoutDTO(object.getSubject().getId()).get());
        teacherOnRealisationDTO.setSubject(subject);
        return teacherOnRealisationDTO;
    }
}
