package com.lms.university.service.repository;


import com.lms.university.service.model.Notification;
import com.lms.university.service.repository.base.BaseRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface NotificationRepository extends BaseRepository<Notification,Long> {

    List<Notification> findAllByFacultyId(Long facultyId);

}
