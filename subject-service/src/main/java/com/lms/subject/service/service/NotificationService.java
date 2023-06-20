package com.lms.subject.service.service;

import com.lms.subject.service.dto.notificationDTO.NotificationDTO;
import com.lms.subject.service.dto.SubjectDTO;
import com.lms.subject.service.model.Notification;
import com.lms.subject.service.repository.NotificationRepository;
import com.lms.subject.service.service.base.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NotificationService extends BaseService<Notification,NotificationDTO,Long> {
    @Autowired
    private NotificationRepository repository;
    public NotificationService(NotificationRepository repository) {
        super(repository);
    }

    @Override
    public NotificationDTO convertToDTO(Notification object) {
        NotificationDTO notificationDTO = new NotificationDTO(object);
        notificationDTO.setSubject(new SubjectDTO(object.getSubject()));
        return notificationDTO;
    }

    public List<NotificationDTO> findAllBySubjectId(Long subjectId){
        return convertArrayToDTO(this.repository.findAllBySubjectId(subjectId));
    }
}
