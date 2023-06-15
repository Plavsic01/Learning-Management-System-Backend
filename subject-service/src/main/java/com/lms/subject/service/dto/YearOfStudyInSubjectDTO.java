package com.lms.subject.service.dto;

import com.lms.subject.service.model.YearOfStudy;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@NoArgsConstructor
@AllArgsConstructor
@Data
public class YearOfStudyInSubjectDTO {
    private Long id;
    private Integer year;
    private Long studyProgramId;

    public YearOfStudyInSubjectDTO(YearOfStudy yearOfStudy) {
        this.id = yearOfStudy.getId();
        this.year = yearOfStudy.getYear();
        this.studyProgramId = yearOfStudy.getStudyProgramId();
    }
}
