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
    @NotNull(message = "Subject Name is mandatory")
    private String name;
    @Lob
    @NotNull(message = "Syllabus is mandatory")
    private String syllabus;
    @NotNull(message = "Ects is mandatory")
    private Integer ects;
    @Column(columnDefinition = "TINYINT(1)")
    @NotNull(message = "Is Subject Mandatory is mandatory")
    private Boolean mandatorySubject;
    @NotNull(message = "Number Of Semesters is mandatory")
    private Integer numberOfSemesters;
    @NotNull(message = "Number Of Lectures is mandatory")
    private Integer numberOfLectures;
    @NotNull(message = "Number Of Practical Lectures is mandatory")
    private Integer numberOfPracticalLectures;
    @ManyToOne
    @NotNull(message = "Year Of Study is mandatory")
    private YearOfStudy yearOfStudy;
    @OneToMany(mappedBy = "subject")
    private List<SubjectEnrollment> subjectEnrollments;
    @OneToMany(mappedBy = "subject")
    private List<Notification> notifications;
    @OneToMany(mappedBy = "subject")
    private List<TeacherOnRealisation> teachersOnRealisation;






}
