package com.lms.university.service.service;

import com.lms.university.service.dto.PrivilegesDTO;
import com.lms.university.service.model.Privileges;
import com.lms.university.service.repository.PrivilegesRepository;
import com.lms.university.service.service.base.BaseService;
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
