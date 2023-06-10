package com.lms.university.service.dto;


import java.util.ArrayList;
import java.util.List;

public class CountryDTO {

    private Long id;
    private String name;
    private List<CityDTO> cities;

    public CountryDTO(Long id, String name) {
        this.id = id;
        this.name = name;
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

    public List<CityDTO> getCities() {
        return cities;
    }

    public void setCities(List<CityDTO> cities) {
        this.cities = cities;
    }
}
