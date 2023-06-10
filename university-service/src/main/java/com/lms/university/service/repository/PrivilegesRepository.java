package com.lms.university.service.repository;

import com.lms.university.service.model.Privileges;
import com.lms.university.service.repository.base.BaseRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PrivilegesRepository extends BaseRepository<Privileges,Long> {
}
