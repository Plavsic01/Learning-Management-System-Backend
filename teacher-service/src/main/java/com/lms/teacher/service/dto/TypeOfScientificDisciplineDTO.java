package com.lms.teacher.service.dto;

import com.lms.teacher.service.model.ScientificDiscipline;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;
@NoArgsConstructor
@AllArgsConstructor
@Data
public class TypeOfScientificDisciplineDTO {

    private Long id;
    private String name;
    List<ScientificDisciplineDTO> scientificDisciplines = new ArrayList<>();

}
