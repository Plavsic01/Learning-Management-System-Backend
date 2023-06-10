package com.lms.university.service.dto;


import java.time.LocalDate;
import java.util.List;

public class UniversityDTO {

    private Long id;
    private String name;
    private LocalDate dateOfEstablishment;
    private String email;
    private String phone;
    private AddressDTO address;
    private Long rectorId;
    private List<FacultyDTO> faculty;

    public UniversityDTO(Long id, String name, LocalDate dateOfEstablishment, String email, String phone,
                         AddressDTO address, Long rectorId, List<FacultyDTO> faculty) {
        this.id = id;
        this.name = name;
        this.dateOfEstablishment = dateOfEstablishment;
        this.email = email;
        this.phone = phone;
        this.address = address;
        this.rectorId = rectorId;
        this.faculty = faculty;
    }

    public UniversityDTO(Long id, String name, LocalDate dateOfEstablishment, String email, String phone,
                         AddressDTO address, Long rectorId) {
        this.id = id;
        this.name = name;
        this.dateOfEstablishment = dateOfEstablishment;
        this.email = email;
        this.phone = phone;
        this.address = address;
        this.rectorId = rectorId;
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

    public LocalDate getDateOfEstablishment() {
        return dateOfEstablishment;
    }

    public void setDateOfEstablishment(LocalDate dateOfEstablishment) {
        this.dateOfEstablishment = dateOfEstablishment;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public AddressDTO getAddress() {
        return address;
    }

    public void setAddress(AddressDTO address) {
        this.address = address;
    }

    public Long getRectorId() {
        return rectorId;
    }

    public void setRectorId(Long rectorId) {
        this.rectorId = rectorId;
    }

    public List<FacultyDTO> getFaculty() {
        return faculty;
    }

    public void setFaculty(List<FacultyDTO> faculty) {
        this.faculty = faculty;
    }
}
