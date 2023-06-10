package com.lms.university.service.service;

import com.lms.university.service.dto.*;
import com.lms.university.service.exception.DoesNotExistException;
import com.lms.university.service.model.Faculty;
import com.lms.university.service.model.University;
import com.lms.university.service.repository.UniversityRepository;
import com.lms.university.service.service.base.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class UniversityService extends BaseService<University, UniversityDTO,Long> {

    @Autowired
    private AddressService addressService;

    public UniversityService(UniversityRepository repository) {
        super(repository);
    }

    @Override
    public UniversityDTO convertToDTO(University object) {

        ArrayList<FacultyDTO> facultiesInUniversity = new ArrayList<>();

        if(object.getFaculty() != null){
            for(Faculty f: object.getFaculty()){
                facultiesInUniversity.add(new FacultyDTO(f.getId(),f.getName(),new AddressDTO(f.getAddress().getId(),f.getAddress().getStreet(),f.getAddress().getNumber(),
                        new CityDTO(f.getAddress().getCity().getId(),f.getAddress().getCity().getName(),
                                new CountryDTO(f.getAddress().getCity().getCountry().getId(),f.getAddress().getCity().getCountry().getName()))),f.getDeanId()));
            }
        }

        AddressDTO addressDTO = addressService.findOne(object.getAddress().getId());

        return new UniversityDTO(object.getId(), object.getName(), object.getDateOfEstablishment(), object.getEmail(), object.getPhone(),
                addressDTO,object.getRectorId(),
                facultiesInUniversity
        );

    }




}