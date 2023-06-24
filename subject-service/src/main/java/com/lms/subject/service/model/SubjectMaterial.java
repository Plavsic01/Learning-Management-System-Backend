package com.lms.subject.service.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class SubjectMaterial {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotNull(message = "Title is mandatory")
    private String title;
    @NotNull(message = "Author is mandatory")
    private String author;
    @NotNull(message = "Isbn is mandatory")
    private String isbn;
    @NotNull(message = "Number Of Pages is mandatory")
    private int numberOfPages;
    @NotNull(message = "Publisher is mandatory")
    private String publisher;

}
