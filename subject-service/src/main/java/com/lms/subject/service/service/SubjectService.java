package com.lms.subject.service.service;

import com.lms.subject.service.dto.SubjectDTO;
import com.lms.subject.service.model.Subject;
import com.lms.subject.service.repository.SubjectRepository;
import com.lms.subject.service.service.base.BaseService;
import org.springframework.stereotype.Service;

@Service
public class SubjectService extends BaseService<Subject,SubjectDTO,Long> {

    private SubjectService service;

    public SubjectService(SubjectRepository repository) {
        super(repository);
    }

    @Override
    public SubjectDTO convertToDTO(Subject object) {
        return new SubjectDTO(object);
    }
}
