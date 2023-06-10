package com.lms.university.service.controller;

import com.lms.university.service.controller.base.BaseController;
import com.lms.university.service.dto.UserDTO;
import com.lms.university.service.model.User;
import com.lms.university.service.service.UserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/users")
public class UserController extends BaseController<User,UserDTO,Long> {
    private UserService service;
    public UserController(UserService service) {
        super(service);
        this.service = service;
    }


}
