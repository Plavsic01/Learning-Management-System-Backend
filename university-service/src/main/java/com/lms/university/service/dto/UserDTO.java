package com.lms.university.service.dto;

import java.time.LocalDate;
import java.util.List;

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
    private AddressDTO address;
    private List<UserPrivilegesDTO> userPrivileges;

    public UserDTO(Long id, String username, List<UserPrivilegesDTO> userPrivileges) {
        this.id = id;
        this.username = username;
        this.userPrivileges = userPrivileges;
    }

    public UserDTO(Long id, String firstName, String lastName, String email, String username, String phone,
                   String jmbg, LocalDate DOB, AddressDTO address, List<UserPrivilegesDTO> userPrivileges) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.username = username;
        this.phone = phone;
        this.jmbg = jmbg;
        this.DOB = DOB;
        this.address = address;
        this.userPrivileges = userPrivileges;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getJmbg() {
        return jmbg;
    }

    public void setJmbg(String jmbg) {
        this.jmbg = jmbg;
    }

    public LocalDate getDOB() {
        return DOB;
    }

    public void setDOB(LocalDate DOB) {
        this.DOB = DOB;
    }

    public AddressDTO getAddress() {
        return address;
    }

    public void setAddress(AddressDTO address) {
        this.address = address;
    }

    public List<UserPrivilegesDTO> getUserPrivileges() {
        return userPrivileges;
    }

    public void setUserPrivileges(List<UserPrivilegesDTO> userPrivileges) {
        this.userPrivileges = userPrivileges;
    }
}
