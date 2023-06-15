package com.lms.user.service.repository;


import com.lms.user.service.model.User;
import com.lms.user.service.repository.base.BaseRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends BaseRepository<User,Long> {
    Optional<User> findByUsername(String username);
    Optional<User> findById(Long id);

}
