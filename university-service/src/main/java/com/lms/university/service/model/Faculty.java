package com.lms.university.service.model;

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
public class Faculty {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    @NotNull(message = "Name is mandatory")
    private String name;
    @ManyToOne(optional = false)
    @NotNull(message = "University is mandatory")
    private University university;
    @ManyToOne(optional = false)
    @NotNull(message = "Address is mandatory")
    private Address address;
    @Column(nullable = false)
    @NotNull(message = "Dean is mandatory")
    private Long deanId;
    @OneToMany(mappedBy = "faculty")
    private List<StudyProgram> studyPrograms;
}
