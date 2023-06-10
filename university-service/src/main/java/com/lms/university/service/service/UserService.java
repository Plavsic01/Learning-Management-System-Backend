package com.lms.university.service.service;

import com.lms.university.service.dto.AddressDTO;
import com.lms.university.service.dto.UserDTO;
import com.lms.university.service.model.User;
import com.lms.university.service.repository.UserRepository;
import com.lms.university.service.service.base.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService extends BaseService<User,UserDTO,Long> {

    @Autowired
    private AddressService addressService;

    @Autowired
    private UserRepository userRepository;

    public UserService(UserRepository repository) {
        super(repository);
    }

    public Optional<User> findByUsername(String username){
        return Optional.ofNullable(this.userRepository.findByUsername(username).orElse(null));
    }

    @Override
    public UserDTO convertToDTO(User object) {

        AddressDTO addressDTO = addressService.findOne(object.getAddress().getId());

        return new UserDTO(object.getId(),object.getFirstName(),object.getLastName(),object.getEmail(),object.getUsername(),
                object.getPhone(),object.getJmbg(),object.getDOB(),addressDTO,null);
    }
}
