package com.lms.subject.service.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class YearOfStudy {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotNull(message = "Year is mandatory")
    private Integer year;
    @OneToMany(mappedBy = "yearOfStudy")
    private List<Subject> subjects = new ArrayList<>();
    @NotNull(message = "StudyProgramId is mandatory")
    private Long studyProgramId;

}
