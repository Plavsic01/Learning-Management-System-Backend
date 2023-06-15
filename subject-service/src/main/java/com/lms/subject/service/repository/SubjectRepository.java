package com.lms.subject.service.repository;

import com.lms.subject.service.model.Subject;
import com.lms.subject.service.repository.base.BaseRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SubjectRepository extends BaseRepository<Subject,Long> {
}
