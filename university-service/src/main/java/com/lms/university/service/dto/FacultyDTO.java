package com.lms.university.service.dto;


import java.util.List;

public class FacultyDTO {

    private Long id;
    private String name;
    private UniversityDTO university;
    private AddressDTO address;
    private Long deanId;
    private List<StudyProgramDTO> studyPrograms;


//    public FacultyDTO(Long id,String name, AddressDTO address, Long deanId,UniversityDTO university) {
//        this.id = id;
//        this.name = name;
//        this.address = address;
//        this.deanId = deanId;
//        this.university = university;
//    }

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


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UniversityDTO getUniversity() {
        return university;
    }

    public void setUniversity(UniversityDTO university) {
        this.university = university;
    }

    public AddressDTO getAddress() {
        return address;
    }

    public void setAddress(AddressDTO address) {
        this.address = address;
    }

    public Long getDeanId() {
        return deanId;
    }

    public void setDeanId(Long deanId) {
        this.deanId = deanId;
    }

    public List<StudyProgramDTO> getStudyPrograms() {
        return studyPrograms;
    }

    public void setStudyPrograms(List<StudyProgramDTO> studyPrograms) {
        this.studyPrograms = studyPrograms;
    }
}
