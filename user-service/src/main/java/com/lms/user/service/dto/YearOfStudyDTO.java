package com.lms.user.service.dto;


import com.lms.user.service.dto.studentDTO.StudyProgramDTO;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@NoArgsConstructor
@AllArgsConstructor
@Data
public class YearOfStudyDTO {
    private Long id;
    private Integer year;
    private StudyProgramDTO studyProgram;

}
