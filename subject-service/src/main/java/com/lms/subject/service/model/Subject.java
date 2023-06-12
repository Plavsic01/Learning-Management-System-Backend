package com.lms.subject.service.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


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
    @Column(nullable = false)
    private Boolean mandatory;
    @Column(nullable = false)
    private Integer numberOfSemesters;
    @Column(nullable = false)
    private Integer numberOfLectures;
    @Column(nullable = false)
    private Integer numberOfPracticalLectures;
    @ManyToOne
    private YearOfStudy yearOfStudy;




}
