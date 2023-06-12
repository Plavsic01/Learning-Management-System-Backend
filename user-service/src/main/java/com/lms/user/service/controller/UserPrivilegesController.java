package com.lms.user.service.controller;


import com.lms.user.service.controller.base.BaseController;
import com.lms.user.service.dto.UserPrivilegesDTO;
import com.lms.user.service.model.UserPrivileges;
import com.lms.user.service.service.UserPrivilegesService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/user-privileges")
public class UserPrivilegesController extends BaseController<UserPrivileges, UserPrivilegesDTO,Long> {
    private UserPrivilegesService service;
    public UserPrivilegesController(UserPrivilegesService service) {
        super(service);
        this.service = service;
    }
}
