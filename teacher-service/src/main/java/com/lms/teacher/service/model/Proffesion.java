package com.lms.teacher.service.model;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Proffesion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalDate startDate;
    private LocalDate endDate;

    @ManyToOne
    private Teacher teacher;

    @ManyToOne
    private TypeOfScientificDiscipline typeOfScientificDiscipline;

    @ManyToOne
    private ScientificDiscipline scientificDiscipline;


}
