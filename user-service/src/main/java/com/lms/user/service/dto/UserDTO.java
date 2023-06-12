package com.lms.user.service.dto;

import com.lms.user.service.model.User;
import com.lms.user.service.model.UserPrivileges;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

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

    public UserDTO(User user) {
        this.id = user.getId();
        this.firstName = user.getFirstName();
        this.lastName = user.getLastName();
        this.email = user.getEmail();
        this.username = user.getUsername();
        this.password = user.getPassword();
        this.phone = user.getPhone();
        this.jmbg = user.getJmbg();
        this.DOB = user.getDOB();
        this.privileges = convertToPrivileges(user.getUserPrivileges());
    }

    private List<PrivilegesInUserDTO> convertToPrivileges(List<UserPrivileges> userPrivileges) {
        List<PrivilegesInUserDTO> privilegesDTO = new ArrayList<>();
        if (userPrivileges != null) {
            userPrivileges.forEach((userPrivilege ->
                    privilegesDTO.add(new PrivilegesInUserDTO(userPrivilege.getPrivileges()))));
        }
        return privilegesDTO;
    }

}
