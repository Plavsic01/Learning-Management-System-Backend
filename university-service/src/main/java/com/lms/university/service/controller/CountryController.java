package com.lms.university.service.controller;

import com.lms.university.service.controller.base.BaseController;
import com.lms.university.service.dto.CountryDTO;
import com.lms.university.service.model.Country;
import com.lms.university.service.service.CountryService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/university/country")
public class CountryController extends BaseController<Country,CountryDTO,Long> {

    private CountryService service;

    public CountryController(CountryService service) {
        super(service);
        this.service = service;
    }
}
