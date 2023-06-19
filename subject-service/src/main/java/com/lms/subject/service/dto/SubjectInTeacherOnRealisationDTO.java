package com.lms.subject.service.dto;

import com.lms.subject.service.model.Subject;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@NoArgsConstructor
@AllArgsConstructor
@Data
public class SubjectInTeacherOnRealisationDTO {
    private Long id;
    private String name;
    private String syllabus;
    private Integer ects;
    private Boolean mandatorySubject;
    private Integer numberOfSemesters;
    private Integer numberOfLectures;
    private Integer numberOfPracticalLectures;

    public SubjectInTeacherOnRealisationDTO(Subject subject) {
        this.id = subject.getId();
        this.name = subject.getName();
        this.syllabus = subject.getSyllabus();
        this.ects = subject.getEcts();
        this.mandatorySubject = subject.getMandatorySubject();
        this.numberOfSemesters = subject.getNumberOfSemesters();
        this.numberOfLectures = subject.getNumberOfLectures();
        this.numberOfPracticalLectures = subject.getNumberOfPracticalLectures();
    }
}
