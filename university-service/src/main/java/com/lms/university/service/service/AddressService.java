package com.lms.university.service.service;

import com.lms.university.service.dto.AddressDTO;
import com.lms.university.service.dto.CityDTO;
import com.lms.university.service.model.Address;
import com.lms.university.service.repository.AddressRepository;
import com.lms.university.service.service.base.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class AddressService extends BaseService<Address, AddressDTO,Long> {
    @Autowired
    private AddressRepository repository;

    @Autowired
    private CityService cityService;

    public AddressService(AddressRepository repository) {
        super(repository);
    }

    public Page<Address> findAll(Pageable pageable){
        return repository.findAll(pageable);
    }

    @Override
    public AddressDTO convertToDTO(Address object) {

        CityDTO cityDTO = cityService.findOne(object.getCity().getId());

        return new AddressDTO(object.getId(), object.getStreet(), object.getNumber(),cityDTO);
    }

}
