package com.lms.university.service.controller;

import com.lms.university.service.controller.base.BaseController;
import com.lms.university.service.dto.NotificationDTO;
import com.lms.university.service.model.Notification;
import com.lms.university.service.service.NotificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/api/university/notification")
public class NotificationController extends BaseController<Notification, NotificationDTO,Long> {
    @Autowired
    private NotificationService service;
    public NotificationController(NotificationService service) {
        super(service);
    }

    @GetMapping("/facultyId/{id}")
    @ResponseStatus(HttpStatus.OK)
    public List<NotificationDTO> getAllByFacId(@PathVariable("id") Long id){
        return service.findAllByFacultyId(id);
    }
}
