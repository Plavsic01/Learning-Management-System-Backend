package com.lms.university.service.controller;

import com.lms.university.service.controller.base.BaseController;
import com.lms.university.service.dto.PrivilegesDTO;
import com.lms.university.service.model.Privileges;
import com.lms.university.service.service.PrivilegesService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/privileges")
public class PrivilegesController extends BaseController<Privileges,PrivilegesDTO,Long> {
    private PrivilegesService service;
    public PrivilegesController(PrivilegesService service) {
        super(service);
        this.service = service;
    }
}
