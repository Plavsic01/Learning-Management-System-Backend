package com.lms.subject.service.repository;

import com.lms.subject.service.model.Subject;
import com.lms.subject.service.repository.base.BaseRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SubjectRepository extends BaseRepository<Subject,Long> {
    List<Subject> findAllByYearOfStudyId(Long yearOfStudyId);
}
