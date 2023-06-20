package com.lms.subject.service.repository;

import com.lms.subject.service.model.Notification;
import com.lms.subject.service.repository.base.BaseRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface NotificationRepository extends BaseRepository<Notification,Long> {
    List<Notification> findAllBySubjectId(Long subjectId);
}
