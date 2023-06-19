package com.lms.teacher.service.model;

import jakarta.persistence.*;
import jakarta.persistence.GenerationType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class ScientificDiscipline {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

   // @OneToMany(mappedBy = "scientificDiscipline")
 //   List<Proffesion> proffesions = new ArrayList<>();
    @ManyToOne
    private TypeOfScientificDiscipline typeOfScientificDiscipline;

}
