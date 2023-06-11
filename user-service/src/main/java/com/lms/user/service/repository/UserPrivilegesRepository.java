package com.lms.user.service.repository;


import com.lms.user.service.model.UserPrivileges;
import com.lms.user.service.repository.base.BaseRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserPrivilegesRepository extends BaseRepository<UserPrivileges,Long> {
    List<UserPrivileges> findAllByUserId(Long userId);
}
