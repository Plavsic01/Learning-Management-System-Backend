package com.lms.university.service.model;

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
    @Lob
    @NotNull(message = "Description is mandatory")
    private String description;
    @ManyToOne
    @NotNull(message = "Faculty is mandatory")
    private Faculty faculty;

}
