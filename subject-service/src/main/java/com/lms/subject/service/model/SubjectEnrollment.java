package com.lms.subject.service.model;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

public class SubjectEnrollment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Integer konacnaOcena;
    private Integer brojPokusaja;
    //TODO: dodati bodove verovatno
    private Long studentId;
    @ManyToOne
    private Subject predmet;

}
