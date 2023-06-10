package com.lms.university.service.repository;

import com.lms.university.service.model.User;
import com.lms.university.service.repository.base.BaseRepository;
import org.springframework.stereotype.Repository;
import java.util.Optional;

@Repository
public interface UserRepository extends BaseRepository<User,Long> {
    Optional<User> findByUsername(String username);
}
