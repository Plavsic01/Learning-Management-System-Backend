package com.lms.user.service.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    @NotNull(message = "First name is mandatory")
    private String firstName;
    @Column(nullable = false)
    @NotNull(message = "Last name is mandatory")
    private String lastName;
    @Column(nullable = false,unique = true)
    @Email
    @NotNull(message = "Email is mandatory")
    private String email;
    @Column(nullable = false,unique = true)
    @NotNull(message = " Username is mandatory")
    private String username;
    @Column(nullable = false)
    private String password;
    @Column(nullable = false)
    @NotNull(message = "Phone is mandatory")
    private String phone;
    @Column(nullable = false,unique = true)
    @NotNull(message = "Jmbg is mandatory")
    private String jmbg;
    @Column(nullable = false)
    @NotNull(message = "Date of Birth is mandatory")
    private LocalDate DOB;
    @OneToMany(mappedBy = "user")
    private List<UserPrivileges> userPrivileges;

}
