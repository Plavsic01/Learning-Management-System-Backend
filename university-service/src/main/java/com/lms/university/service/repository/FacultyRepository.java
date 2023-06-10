package com.lms.university.service.repository;

import com.lms.university.service.model.Faculty;
import com.lms.university.service.repository.base.BaseRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FacultyRepository extends BaseRepository<Faculty,Long> {
}
