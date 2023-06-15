package com.lms.user.service.model;

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
public class StudentYear {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotNull(message = "DateOfEnrollment is mandatory")
    private LocalDate dateOfEnrollment;
    @Column(nullable = false)
    @NotNull(message = "Index is mandatory")
    private String indexNo;
    @ManyToOne
    @NotNull(message = "Student is mandatory")
    private Student student;
    @NotNull(message = "Year Of Study is mandatory")
    private Long yearOfStudyId;

}
