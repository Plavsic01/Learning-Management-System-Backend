package com.lms.university.service.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;
@Data
@AllArgsConstructor
@NoArgsConstructor

public class CityDTO {

    private Long id;
    private String name;
    private CountryDTO country;
    private List<AddressDTO> addresses;


    public CityDTO(Long id, String name, CountryDTO country) {
        this.id = id;
        this.name = name;
        this.country = country;
    }

}
