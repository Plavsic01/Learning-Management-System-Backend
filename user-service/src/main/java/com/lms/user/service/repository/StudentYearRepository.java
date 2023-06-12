package com.lms.user.service.repository;

import com.lms.user.service.model.StudentYear;
import com.lms.user.service.repository.base.BaseRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentYearRepository extends BaseRepository<StudentYear,Long> {
}
