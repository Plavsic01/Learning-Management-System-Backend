package com.lms.university.service.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class StudyProgram {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
//    @Column(nullable = false)
    @NotNull(message = "Study program name is mandatory")
    private String name;
//    @NotNull(message = "Description is mandatory") //DODATI OVO i IZMENITI DTO
//    private String description;

//    @Column(nullable = false,unique = true)
    @NotNull(message = "Coordinator is mandatory")
    private Long coordinatorId;
    @ManyToOne(optional = false)
    @NotNull(message = "Faculty is mandatory")
    private Faculty faculty;
}
