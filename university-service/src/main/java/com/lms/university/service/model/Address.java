package com.lms.university.service.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    @NotNull(message = "Street is mandatory")
    private String street;
    @Column(nullable = false)
    @NotNull(message = "Number is mandatory")
    private String number;
    @ManyToOne(optional = false)
    @NotNull(message = "City is mandatory")
    private City city;
    @OneToMany(mappedBy = "address")
    private List<University> universities = new ArrayList<>();
    @OneToMany(mappedBy = "address")
    private List<Faculty> faculties = new ArrayList<>();
    @OneToMany(mappedBy = "address")
    private List<User> users = new ArrayList<>();

}
