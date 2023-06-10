package com.lms.university.service.dto;


import java.util.ArrayList;
import java.util.List;

public class CityDTO {

    private Long id;
    private String name;
    private CountryDTO country;
    private List<AddressDTO> addresses;

    public CityDTO(){

    }

    public CityDTO(Long id, String name, CountryDTO country, List<AddressDTO> addresses) {
        this.id = id;
        this.name = name;
        this.country = country;
        this.addresses = addresses;
    }

    public CityDTO(Long id, String name, CountryDTO country) {
        this.id = id;
        this.name = name;
        this.country = country;
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

    public CountryDTO getCountry() {
        return country;
    }

    public void setCountry(CountryDTO country) {
        this.country = country;
    }

    public List<AddressDTO> getAddresses() {
        return addresses;
    }

    public void setAddresses(List<AddressDTO> addresses) {
        this.addresses = addresses;
    }
}
