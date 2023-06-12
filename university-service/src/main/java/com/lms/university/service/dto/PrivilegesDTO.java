package com.lms.university.service.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PrivilegesDTO {

    private Long id;
    private String roleName;

    private List<UserPrivilegesDTO> userPrivileges;

    public PrivilegesDTO(Long id, String roleName) {
        this.id = id;
        this.roleName = roleName;
    }

}
