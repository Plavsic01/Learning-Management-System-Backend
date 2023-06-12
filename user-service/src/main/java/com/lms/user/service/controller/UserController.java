package com.lms.user.service.controller;


import com.lms.user.service.controller.base.BaseController;
import com.lms.user.service.dto.UserDTO;
import com.lms.user.service.model.User;
import com.lms.user.service.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "/api/users")
public class UserController extends BaseController<User,UserDTO,Long> {
    private UserService service;
    public UserController(UserService service) {
        super(service);
        this.service = service;
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public UserDTO getOne(@RequestParam("username") String username){
        return service.findByUsernameDTO(username);
    }

    @GetMapping("/all")
    @ResponseStatus(HttpStatus.OK)
    public List<UserDTO> getAll(){
        return service.findAll();
    }


}
