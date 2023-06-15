package com.lms.subject.service.dto.userDTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDTO {
    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private String username;
    private String password;
    private String phone;
    private String jmbg;
    private LocalDate DOB;
    private List<PrivilegesInUserDTO> privileges;

    public UserDTO(Long id, String username, String password, List<PrivilegesInUserDTO> privileges) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.privileges = privileges;
    }

    public UserDTO(Long id, String firstName, String lastName, String email, String username, String phone,
                   String jmbg, LocalDate DOB, List<PrivilegesInUserDTO> privileges) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.username = username;
        this.phone = phone;
        this.jmbg = jmbg;
        this.DOB = DOB;
        this.privileges = privileges;
    }

}
