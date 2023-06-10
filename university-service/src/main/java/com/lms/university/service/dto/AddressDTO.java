package com.lms.university.service.dto;



import java.util.ArrayList;
import java.util.List;

public class AddressDTO {
    private Long id;
    private String street;
    private String number;
    private CityDTO city;
    private List<UniversityDTO> universities;
    private List<FacultyDTO> faculties;
    private List<UserDTO> users;

    public AddressDTO(Long id, String street, String number, CityDTO city, List<UniversityDTO> universities,
                      List<FacultyDTO> faculties, List<UserDTO> users) {
        this.id = id;
        this.street = street;
        this.number = number;
        this.city = city;
        this.universities = universities;
        this.faculties = faculties;
        this.users = users;
    }

    public AddressDTO(Long id, String street, String number, CityDTO city) {
        this.id = id;
        this.street = street;
        this.number = number;
        this.city = city;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public CityDTO getCity() {
        return city;
    }

    public void setCity(CityDTO city) {
        this.city = city;
    }

    public List<UniversityDTO> getUniversities() {
        return universities;
    }

    public void setUniversities(List<UniversityDTO> universities) {
        this.universities = universities;
    }

    public List<FacultyDTO> getFaculties() {
        return faculties;
    }

    public void setFaculties(List<FacultyDTO> faculties) {
        this.faculties = faculties;
    }

    public List<UserDTO> getUsers() {
        return users;
    }

    public void setUsers(List<UserDTO> users) {
        this.users = users;
    }
}
