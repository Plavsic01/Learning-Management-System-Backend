package com.lms.university.service.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor

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
                         AddressDTO address, Long rectorId) {
        this.id = id;
        this.name = name;
        this.dateOfEstablishment = dateOfEstablishment;
        this.email = email;
        this.phone = phone;
        this.address = address;
        this.rectorId = rectorId;
    }



}
