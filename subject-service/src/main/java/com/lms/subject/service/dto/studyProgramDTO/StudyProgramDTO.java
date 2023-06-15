package com.lms.subject.service.dto.studyProgramDTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class StudyProgramDTO {
    private Long id;
    private String name;
    private Long coordinatorId;

}
