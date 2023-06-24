package com.lms.subject.service.repository;

import com.lms.subject.service.model.SubjectMaterial;
import com.lms.subject.service.repository.base.BaseRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SubjectMaterialRepository extends BaseRepository<SubjectMaterial,Long> {
}
