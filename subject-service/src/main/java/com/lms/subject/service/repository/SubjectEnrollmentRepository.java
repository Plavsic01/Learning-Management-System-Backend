package com.lms.subject.service.repository;

import com.lms.subject.service.model.SubjectEnrollment;
import com.lms.subject.service.repository.base.BaseRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SubjectEnrollmentRepository extends BaseRepository<SubjectEnrollment,Long> {
}
