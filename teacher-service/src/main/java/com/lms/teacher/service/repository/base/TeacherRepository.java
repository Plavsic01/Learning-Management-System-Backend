package com.lms.teacher.service.repository.base;

import com.lms.teacher.service.model.Teacher;
import org.springframework.stereotype.Repository;

@Repository
public interface TeacherRepository extends BaseRepository<Teacher, Long> {
}
