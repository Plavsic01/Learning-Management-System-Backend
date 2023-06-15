package com.lms.university.service.controller;

import com.lms.university.service.controller.base.BaseController;
import com.lms.university.service.dto.CityDTO;
import com.lms.university.service.model.City;
import com.lms.university.service.service.CityService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/university/city")
public class CityController extends BaseController<City,CityDTO,Long> {

    private CityService service;

    public CityController(CityService service) {
        super(service);
        this.service = service;
    }


}
