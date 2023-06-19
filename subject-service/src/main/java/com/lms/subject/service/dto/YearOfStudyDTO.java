package com.lms.subject.service.dto;

import com.lms.subject.service.dto.studyProgramDTO.StudyProgramDTO;
import com.lms.subject.service.model.Subject;
import com.lms.subject.service.model.YearOfStudy;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class YearOfStudyDTO {
    private Long id;
    private Integer year;
    private List<SubjectDTO> subjects  = new ArrayList<>();
    private StudyProgramDTO studyProgram;
    public YearOfStudyDTO(YearOfStudy yearOfStudy) {
        this.id = yearOfStudy.getId();
        this.year = yearOfStudy.getYear();
        this.subjects = convertSubjectToDTO(yearOfStudy.getSubjects());
    }

    private List<SubjectDTO> convertSubjectToDTO(List<Subject> subjects){
        List<SubjectDTO> subjectsDTO = new ArrayList<>();
        for(Subject s:subjects){
            subjectsDTO.add(new SubjectDTO(s.getId(),s.getName(),s.getSyllabus(),
                    s.getEcts(),s.getMandatorySubject(),s.getNumberOfSemesters(),s.getNumberOfLectures(),s.getNumberOfPracticalLectures()));
        }
        return subjectsDTO;
    }
}
