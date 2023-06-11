package com.lms.user.service.dto;

import com.lms.user.service.model.Privileges;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PrivilegesInUserDTO {

    private Long id;
    private String roleName;

    public PrivilegesInUserDTO(Privileges privileges){
        this.id = privileges.getId();
        this.roleName = privileges.getRoleName();
    }

}
