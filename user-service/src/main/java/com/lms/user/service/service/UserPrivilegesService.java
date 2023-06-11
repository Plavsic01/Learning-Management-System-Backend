package com.lms.user.service.service;


import com.lms.user.service.dto.PrivilegesDTO;
import com.lms.user.service.dto.UserDTO;
import com.lms.user.service.dto.UserPrivilegesDTO;
import com.lms.user.service.model.UserPrivileges;
import com.lms.user.service.repository.UserPrivilegesRepository;
import com.lms.user.service.service.base.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserPrivilegesService extends BaseService<UserPrivileges, UserPrivilegesDTO,Long> {

    @Autowired
    private UserService userService;

    @Autowired
    private PrivilegesService privilegesService;

    @Autowired
    private UserPrivilegesRepository repository;

    public UserPrivilegesService(UserPrivilegesRepository repository) {
        super(repository);
    }

    @Override
    public UserPrivilegesDTO convertToDTO(UserPrivileges object) {

        UserDTO userDTO = userService.findOne(object.getUser().getId());

        PrivilegesDTO privilegesDTO = privilegesService.findOne(object.getPrivileges().getId());

        return new UserPrivilegesDTO(object.getId(),userDTO,privilegesDTO);
    }

    public List<UserPrivileges> findAllByUserId(Long id){
        return repository.findAllByUserId(id);
    }
}
