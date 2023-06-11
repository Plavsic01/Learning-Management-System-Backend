package com.lms.university.service.dto;

import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserPrivilegesDTO {
    private Long id;
    private UserDTO user;
    private PrivilegesDTO privileges;
    public UserPrivilegesDTO(Long id, PrivilegesDTO privileges) {
        this.id = id;
        this.privileges = privileges;
    }

}
