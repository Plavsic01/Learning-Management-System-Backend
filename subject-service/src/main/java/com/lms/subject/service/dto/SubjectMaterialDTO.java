package com.lms.subject.service.dto;

import com.lms.subject.service.model.SubjectMaterial;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class SubjectMaterialDTO {

    private Long id;

    private String title;

    private String author;

    private String isbn;

    private int numberOfPages;

    private String publisher;

    public SubjectMaterialDTO(SubjectMaterial subjectMaterial) {
        this.id = subjectMaterial.getId();
        this.title = subjectMaterial.getTitle();
        this.author = subjectMaterial.getAuthor();
        this.isbn = subjectMaterial.getIsbn();
        this.numberOfPages = subjectMaterial.getNumberOfPages();
        this.publisher = subjectMaterial.getPublisher();
    }
}
