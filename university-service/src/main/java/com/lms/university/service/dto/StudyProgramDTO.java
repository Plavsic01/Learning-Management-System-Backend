package com.lms.university.service.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class StudyProgramDTO {

    private Long id;
    private String name;
    private Long coordinatorId;
    private FacultyDTO faculty;

    public StudyProgramDTO(Long id, String name, Long coordinatorId) {
        this.id = id;
        this.name = name;
        this.coordinatorId = coordinatorId;
    }

}
