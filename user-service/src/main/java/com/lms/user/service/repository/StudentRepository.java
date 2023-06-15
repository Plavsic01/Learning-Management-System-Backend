package com.lms.user.service.repository;

import com.lms.user.service.model.Student;
import com.lms.user.service.repository.base.BaseRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface StudentRepository extends BaseRepository<Student,Long> {

}
