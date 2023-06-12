package com.lms.university.service.dto;



import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
@Data
@AllArgsConstructor
@NoArgsConstructor

public class AddressDTO {
    private Long id;
    private String street;
    private String number;
    private CityDTO city;
    private List<UniversityDTO> universities;
    private List<FacultyDTO> faculties;


    public AddressDTO(Long id, String street, String number, CityDTO city) {
        this.id = id;
        this.street = street;
        this.number = number;
        this.city = city;
    }


}
