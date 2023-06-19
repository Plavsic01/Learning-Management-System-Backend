package com.lms.subject.service.repository;

import com.lms.subject.service.model.SubjectEnrollment;
import com.lms.subject.service.repository.base.BaseRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SubjectEnrollmentRepository extends BaseRepository<SubjectEnrollment,Long> {

    List<SubjectEnrollment> findAllByStudentIdAndFinalGradeIsNull(Long studentId);

    List<SubjectEnrollment> findAllByStudentIdAndFinalGradeIsNotNull(Long studentId);

}
