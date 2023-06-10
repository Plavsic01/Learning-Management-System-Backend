package com.lms.university.service.dto;

import jakarta.persistence.ManyToOne;

public class UserPrivilegesDTO {
    private Long id;
    @ManyToOne
    private UserDTO user;
    @ManyToOne
    private PrivilegesDTO privileges;

    public UserPrivilegesDTO(Long id, UserDTO user, PrivilegesDTO privileges) {
        this.id = id;
        this.user = user;
        this.privileges = privileges;
    }

    public UserPrivilegesDTO(Long id, PrivilegesDTO privileges) {
        this.id = id;
        this.privileges = privileges;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public UserDTO getUser() {
        return user;
    }

    public void setUser(UserDTO user) {
        this.user = user;
    }

    public PrivilegesDTO getPrivileges() {
        return privileges;
    }

    public void setPrivileges(PrivilegesDTO privileges) {
        this.privileges = privileges;
    }
}
