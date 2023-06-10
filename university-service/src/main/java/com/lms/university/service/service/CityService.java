package com.lms.university.service.service;

import com.lms.university.service.dto.CityDTO;
import com.lms.university.service.dto.CountryDTO;
import com.lms.university.service.model.City;
import com.lms.university.service.repository.CityRepository;
import com.lms.university.service.service.base.BaseService;
import org.springframework.stereotype.Service;

@Service
public class CityService extends BaseService<City, CityDTO,Long> {
    public CityService(CityRepository repository) {
        super(repository);
    }

    @Override
    public CityDTO convertToDTO(City object) {
        return new CityDTO(object.getId(), object.getName(),new CountryDTO(object.getCountry().getId(),object.getCountry().getName()));
    }
}
