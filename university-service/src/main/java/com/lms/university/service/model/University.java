package com.lms.university.service.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class University {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    @NotNull(message = "Name is mandatory")
    private String name;
    @Column(nullable = false)
    @NotNull(message = "Date of Establishment is mandatory")
    private LocalDate dateOfEstablishment;
    @Column(nullable = false)
    @NotNull(message = "Email is mandatory")
    @Email
    private String email;
    @Column(nullable = false)
    @NotNull(message = "Phone is mandatory")
    private String phone;
    @ManyToOne(optional = false)
    @NotNull(message = "Address is mandatory")
    private Address address;
    @Column(nullable = false,unique = true)
    @NotNull(message = "Rector is mandatory")
    private Long rectorId;
    @OneToMany(mappedBy = "university")
    private List<Faculty> faculty;

}
