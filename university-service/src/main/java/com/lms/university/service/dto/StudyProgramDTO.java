package com.lms.university.service.dto;


public class StudyProgramDTO {

    private Long id;
    private String name;
    private Long coordinatorId;
    private FacultyDTO faculty;

    public StudyProgramDTO(Long id, String name, Long coordinatorId, FacultyDTO faculty) {
        this.id = id;
        this.name = name;
        this.coordinatorId = coordinatorId;
        this.faculty = faculty;
    }

    public StudyProgramDTO(Long id, String name, Long coordinatorId) {
        this.id = id;
        this.name = name;
        this.coordinatorId = coordinatorId;
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

    public Long getCoordinatorId() {
        return coordinatorId;
    }

    public void setCoordinatorId(Long coordinatorId) {
        this.coordinatorId = coordinatorId;
    }

    public FacultyDTO getFaculty() {
        return faculty;
    }

    public void setFaculty(FacultyDTO faculty) {
        this.faculty = faculty;
    }
}
