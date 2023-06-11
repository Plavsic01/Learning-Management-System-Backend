package com.lms.university.service.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FacultyDTO {

    private Long id;
    private String name;
    private UniversityDTO university;
    private AddressDTO address;
    private Long deanId;
    private List<StudyProgramDTO> studyPrograms;


    public FacultyDTO(Long id, String name, AddressDTO address, Long deanId,UniversityDTO university,
                      List<StudyProgramDTO> studyPrograms) {
        this.id = id;
        this.name = name;
        this.university = university;
        this.address = address;
        this.deanId = deanId;
        this.studyPrograms = studyPrograms;
    }

    public FacultyDTO(Long id, String name, AddressDTO address, Long deanId) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.deanId = deanId;
    }

}
