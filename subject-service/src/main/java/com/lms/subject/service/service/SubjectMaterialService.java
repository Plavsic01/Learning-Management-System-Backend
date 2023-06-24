package com.lms.subject.service.service;

import com.lms.subject.service.dto.SubjectMaterialDTO;
import com.lms.subject.service.model.SubjectMaterial;
import com.lms.subject.service.repository.SubjectMaterialRepository;
import com.lms.subject.service.service.base.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SubjectMaterialService extends BaseService<SubjectMaterial, SubjectMaterialDTO,Long> {
    @Autowired
    private SubjectMaterialRepository repository;
    public SubjectMaterialService(SubjectMaterialRepository repository) {
        super(repository);
    }

    @Override
    public SubjectMaterialDTO convertToDTO(SubjectMaterial object) {
        return new SubjectMaterialDTO(object);
    }
}
