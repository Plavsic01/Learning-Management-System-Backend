package com.lms.teacher.service.dto;

import com.lms.teacher.service.model.ScientificDiscipline;
import com.lms.teacher.service.model.TypeOfScientificDiscipline;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data

public class ScientificDisciplineDTO {
    private Long id;
    private String name;
    List<ProffesionsDTO> proffesions = new ArrayList<>();
    TypeOfScientificDisciplineDTO typeOfScientificDisciplines;
}
