package com.lms.subject.service.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data

/* ako student nema unesenu ocenu to znaci da i dalje pohadja ovaj predmet */

public class SubjectEnrollment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
//    @NotNull(message = "Final Grade is mandatory")
    private Integer finalGrade;
//    @NotNull(message = "Number Of Attempts is mandatory")
    private Integer numberOfAttempts;
//    @NotNull(message = "Points are mandatory")
    private Long points;
    @NotNull(message = "StudentId is mandatory")
    private Long studentId;
    @ManyToOne
    @NotNull(message = "Subject is mandatory")
    private Subject subject;

}
