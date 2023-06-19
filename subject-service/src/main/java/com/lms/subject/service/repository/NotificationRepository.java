package com.lms.subject.service.repository;

import com.lms.subject.service.model.Notification;
import com.lms.subject.service.repository.base.BaseRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NotificationRepository extends BaseRepository<Notification,Long> {
}
