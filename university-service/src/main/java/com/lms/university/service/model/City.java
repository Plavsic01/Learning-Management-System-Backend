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
public class City {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    @NotNull(message = "Name is mandatory")
    private String name;
    @ManyToOne
    @NotNull(message = "Country is mandatory")
    private Country country;
    @OneToMany(mappedBy = "city")
    private List<Address> addresses = new ArrayList<>();

}
