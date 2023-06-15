package com.lms.subject.service.dto;

import com.lms.subject.service.model.Subject;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@NoArgsConstructor
@AllArgsConstructor
@Data
public class SubjectDTO {
    private Long id;
    private String name;
    private String syllabus;
    private Long teacherId;
    private Long assistantId;
    private Integer ects;
    private Boolean mandatorySubject;
    private Integer numberOfSemesters;
    private Integer numberOfLectures;
    private Integer numberOfPracticalLectures;
    private YearOfStudyInSubjectDTO yearOfStudy;

    public SubjectDTO(Subject subject) {
        this.id = subject.getId();
        this.name = subject.getName();
        this.syllabus = subject.getSyllabus();
        this.teacherId = subject.getTeacherId();
        this.assistantId = subject.getAssistantId();
        this.ects = subject.getEcts();
        this.mandatorySubject = subject.getMandatorySubject();
        this.numberOfSemesters = subject.getNumberOfSemesters();
        this.numberOfLectures = subject.getNumberOfLectures();
        this.numberOfPracticalLectures = subject.getNumberOfPracticalLectures();
        this.yearOfStudy = new YearOfStudyInSubjectDTO(subject.getYearOfStudy());
    }

    public SubjectDTO(Long id, String name, String syllabus, Long teacherId, Long assistantId, Integer ects,
                      boolean mandatorySubject, Integer numberOfSemesters, Integer numberOfLectures, Integer numberOfPracticalLectures) {
        this.id = id;
        this.name = name;
        this.syllabus = syllabus;
        this.teacherId = teacherId;
        this.assistantId = assistantId;
        this.ects = ects;
        this.mandatorySubject = mandatorySubject;
        this.numberOfSemesters = numberOfSemesters;
        this.numberOfLectures = numberOfLectures;
        this.numberOfPracticalLectures = numberOfPracticalLectures;
    }


}
