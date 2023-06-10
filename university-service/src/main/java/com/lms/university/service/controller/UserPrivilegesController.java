package com.lms.university.service.controller;

import com.lms.university.service.controller.base.BaseController;
import com.lms.university.service.dto.UserPrivilegesDTO;
import com.lms.university.service.model.UserPrivileges;
import com.lms.university.service.service.UserPrivilegesService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/user-privileges")
public class UserPrivilegesController extends BaseController<UserPrivileges,UserPrivilegesDTO,Long> {
    private UserPrivilegesService service;
    public UserPrivilegesController(UserPrivilegesService service) {
        super(service);
        this.service = service;
    }
}
