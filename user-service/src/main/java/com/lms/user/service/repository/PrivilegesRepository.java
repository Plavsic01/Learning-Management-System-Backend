package com.lms.user.service.repository;


import com.lms.user.service.model.Privileges;
import com.lms.user.service.repository.base.BaseRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PrivilegesRepository extends BaseRepository<Privileges,Long> {
}
