package com.lms.university.service.service;

import com.lms.university.service.dto.CountryDTO;
import com.lms.university.service.model.Country;
import com.lms.university.service.repository.CountryRepository;
import com.lms.university.service.service.base.BaseService;
import org.springframework.stereotype.Service;

@Service
public class CountryService extends BaseService<Country, CountryDTO,Long> {
    public CountryService(CountryRepository repository) {
        super(repository);
    }

    @Override
    public CountryDTO convertToDTO(Country object) {
        return new CountryDTO(object.getId(),object.getName());
    }
}
