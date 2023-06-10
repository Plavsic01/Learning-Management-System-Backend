package com.lms.university.service.repository;

import com.lms.university.service.model.UserPrivileges;
import com.lms.university.service.repository.base.BaseRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserPrivilegesRepository extends BaseRepository<UserPrivileges,Long> {
}
