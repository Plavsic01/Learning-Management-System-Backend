package com.lms.subject.service.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data

public class Notification {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotNull(message = "Title is mandatory")
    private String title;
    @NotNull(message = "Date Of Notification is mandatory")
    private LocalDate dateOfNotification;
    @NotNull(message = "Description is mandatory")
    private String description;
    @ManyToOne
    @NotNull(message = "Subject is mandatory")
    private Subject subject;

}
