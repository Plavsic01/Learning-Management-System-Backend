package com.lms.subject.service.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;


@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Subject {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String name;
    @Lob
    @Column(nullable = false)
    private String syllabus;
    @Column(nullable = false)
    private Long teacherId;
    @Column(nullable = false)
    private Long assistantId;
    @Column(nullable = false)
    private Integer ects;
    @Column(columnDefinition = "TINYINT(1)")
    private Boolean mandatorySubject;
    @Column(nullable = false)
    private Integer numberOfSemesters;
    @Column(nullable = false)
    private Integer numberOfLectures;
    @Column(nullable = false)
    private Integer numberOfPracticalLectures;
    @ManyToOne
    private YearOfStudy yearOfStudy;
    @OneToMany(mappedBy = "subject")
    @NotNull
    private List<SubjectEnrollment> subjectEnrollments;




}
