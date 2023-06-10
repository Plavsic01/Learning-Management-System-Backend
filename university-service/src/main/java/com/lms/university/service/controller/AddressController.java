package com.lms.university.service.controller;


import com.lms.university.service.controller.base.BaseController;
import com.lms.university.service.dto.AddressDTO;
import com.lms.university.service.model.Address;
import com.lms.university.service.service.AddressService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/address")
public class AddressController extends BaseController<Address, AddressDTO,Long> {

    private AddressService service;

    public AddressController(AddressService service) {
        super(service);
        this.service = service;
    }

}
