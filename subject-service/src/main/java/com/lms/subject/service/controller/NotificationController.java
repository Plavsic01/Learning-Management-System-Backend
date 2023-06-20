package com.lms.subject.service.controller;

import com.lms.subject.service.controller.base.BaseController;
import com.lms.subject.service.dto.notificationDTO.NotificationDTO;
import com.lms.subject.service.model.Notification;
import com.lms.subject.service.service.NotificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/api/subject/notification")
public class NotificationController extends BaseController<Notification,NotificationDTO,Long> {
    @Autowired
    private NotificationService service;
    public NotificationController(NotificationService service) {
        super(service);
    }

    @GetMapping("/subjectId/{id}")
    @ResponseStatus(HttpStatus.OK)
    public List<NotificationDTO> getBySubjectId(@PathVariable("id") Long id){
        return service.findAllBySubjectId(id);
    }
}
