package com.lms.user.service.controller;


import com.lms.user.service.controller.base.BaseController;
import com.lms.user.service.dto.PrivilegesDTO;
import com.lms.user.service.model.Privileges;
import com.lms.user.service.service.PrivilegesService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/user/privileges")
public class PrivilegesController extends BaseController<Privileges, PrivilegesDTO,Long> {
    private PrivilegesService service;
    public PrivilegesController(PrivilegesService service) {
        super(service);
        this.service = service;
    }
}
