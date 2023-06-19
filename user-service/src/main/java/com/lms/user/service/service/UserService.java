package com.lms.user.service.service;


import com.lms.user.service.dto.PrivilegesDTO;
import com.lms.user.service.dto.UserDTO;
import com.lms.user.service.dto.UserPrivilegesDTO;
import com.lms.user.service.exception.DoesNotExistException;
import com.lms.user.service.model.User;
import com.lms.user.service.model.UserPrivileges;
import com.lms.user.service.repository.UserRepository;
import com.lms.user.service.service.base.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class UserService extends BaseService<User, UserDTO,Long> {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private UserPrivilegesService userPrivilegesService;

    public UserService(UserRepository repository) {
        super(repository);
    }

    public UserDTO findByUsernameDTO(String username){
        Optional<User> user = userRepository.findByUsername(username);
        return new UserDTO(user.get());
    }

    @Override
    public UserDTO save(User obj) {
        String password = new BCryptPasswordEncoder().encode(obj.getPassword());
        obj.setPassword(password);
        return super.save(obj);
    }

    public Optional<User> findByUsername(String username){
        return userRepository.findByUsername(username);
    }

    public UserDTO findByUserId(Long id){
        return convertToDTO(userRepository.findById(id).get());
    }

    @Override
    public UserDTO convertToDTO(User object) {
            return new UserDTO(object);

    }
}
