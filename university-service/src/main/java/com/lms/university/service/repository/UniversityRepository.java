package com.lms.university.service.repository;

import com.lms.university.service.model.University;
import com.lms.university.service.repository.base.BaseRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UniversityRepository extends BaseRepository<University,Long> {
}
