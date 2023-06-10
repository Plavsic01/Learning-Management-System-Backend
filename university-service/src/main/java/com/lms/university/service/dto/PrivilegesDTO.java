package com.lms.university.service.dto;

import com.lms.university.service.model.UserPrivileges;
import jakarta.persistence.FetchType;
import jakarta.persistence.OneToMany;

import java.util.List;
import java.util.Set;

public class PrivilegesDTO {

    private Long id;
    private String roleName;

    private List<UserPrivilegesDTO> userPrivileges;

    public PrivilegesDTO(Long id, String roleName, List<UserPrivilegesDTO> userPrivileges) {
        this.id = id;
        this.roleName = roleName;
        this.userPrivileges = userPrivileges;
    }

    public PrivilegesDTO(Long id, String roleName) {
        this.id = id;
        this.roleName = roleName;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public List<UserPrivilegesDTO> getUserPrivileges() {
        return userPrivileges;
    }

    public void setUserPrivileges(List<UserPrivilegesDTO> userPrivileges) {
        this.userPrivileges = userPrivileges;
    }
}
