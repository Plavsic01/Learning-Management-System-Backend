package com.lms.university.service.dto;

import com.lms.university.service.model.Notification;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;


@NoArgsConstructor
@AllArgsConstructor
@Data
public class NotificationDTO {
    private Long id;
    private String title;
    private LocalDate dateOfNotification;
    private String description;
    private FacultyDTO faculty;

    public NotificationDTO(Notification notification) {
        this.id = notification.getId();
        this.title = notification.getTitle();
        this.dateOfNotification = notification.getDateOfNotification();
        this.description = notification.getDescription();
    }
}
