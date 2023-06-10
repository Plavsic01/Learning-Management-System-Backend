package com.lms.university.service.service;

import com.lms.university.service.dto.PrivilegesDTO;
import com.lms.university.service.dto.UserDTO;
import com.lms.university.service.dto.UserPrivilegesDTO;
import com.lms.university.service.model.UserPrivileges;
import com.lms.university.service.repository.UserPrivilegesRepository;
import com.lms.university.service.service.base.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserPrivilegesService extends BaseService<UserPrivileges, UserPrivilegesDTO,Long> {

    @Autowired
    private UserService userService;

    @Autowired PrivilegesService privilegesService;

    public UserPrivilegesService(UserPrivilegesRepository repository) {
        super(repository);
    }

    @Override
    public UserPrivilegesDTO convertToDTO(UserPrivileges object) {

        UserDTO userDTO = userService.findOne(object.getUser().getId());

        PrivilegesDTO privilegesDTO = privilegesService.findOne(object.getPrivileges().getId());

        return new UserPrivilegesDTO(object.getId(),userDTO,privilegesDTO);
    }
}
