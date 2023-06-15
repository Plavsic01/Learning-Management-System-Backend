package com.lms.teacher.service.dto;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Data;
import java.time.LocalDate;
@NoArgsConstructor
@AllArgsConstructor
@Data
public class ProffesionsDTO {
    private Long id;
    private String name;
    private LocalDate startDate;
    private LocalDate endDate;
    private TeacherDTO teacher;
    private TypeOfScientificDisciplineDTO typeOfScientificDiscipline;
    private ScientificDisciplineDTO scientificDiscipline;
}
