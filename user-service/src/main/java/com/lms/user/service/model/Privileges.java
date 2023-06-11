package com.lms.user.service.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;


@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Privileges {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String roleName;
    @OneToMany(mappedBy = "privileges",fetch = FetchType.EAGER)
    private List<UserPrivileges> userPrivileges;
}
