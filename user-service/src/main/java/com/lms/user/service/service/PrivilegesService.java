package com.lms.user.service.service;


import com.lms.user.service.dto.PrivilegesDTO;
import com.lms.user.service.model.Privileges;
import com.lms.user.service.repository.PrivilegesRepository;
import com.lms.user.service.service.base.BaseService;
import org.springframework.stereotype.Service;

@Service
public class PrivilegesService extends BaseService<Privileges, PrivilegesDTO,Long> {


    public PrivilegesService(PrivilegesRepository repository) {
        super(repository);
    }

    @Override
    public PrivilegesDTO convertToDTO(Privileges object) {
        return new PrivilegesDTO(object.getId(), object.getRoleName());
    }



}
