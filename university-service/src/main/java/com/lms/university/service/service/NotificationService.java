package com.lms.university.service.service;


import com.lms.university.service.dto.FacultyDTO;
import com.lms.university.service.dto.NotificationDTO;
import com.lms.university.service.model.Notification;
import com.lms.university.service.repository.NotificationRepository;
import com.lms.university.service.service.base.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NotificationService extends BaseService<Notification, NotificationDTO,Long> {
    @Autowired
    private NotificationRepository repository;
    public NotificationService(NotificationRepository repository) {
        super(repository);
    }

    @Override
    public NotificationDTO convertToDTO(Notification object) {
        NotificationDTO notificationDTO = new NotificationDTO(object);
        notificationDTO.setFaculty(new FacultyDTO(object.getFaculty()));
        return notificationDTO;
    }

    public List<NotificationDTO> findAllByFacultyId(Long facultyId){
        return convertArrayToDTO(repository.findAllByFacultyId(facultyId));
    }
}
