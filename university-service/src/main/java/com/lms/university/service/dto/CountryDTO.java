package com.lms.university.service.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CountryDTO {

    private Long id;
    private String name;
    private List<CityDTO> cities;

    public CountryDTO(Long id, String name) {
        this.id = id;
        this.name = name;
    }

}
