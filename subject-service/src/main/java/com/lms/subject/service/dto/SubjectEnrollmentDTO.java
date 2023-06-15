package com.lms.subject.service.dto;

import com.lms.subject.service.dto.studentDTO.StudentDTO;
import com.lms.subject.service.model.SubjectEnrollment;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class SubjectEnrollmentDTO {
    private Long id;
    private Integer finalGrade;
    private Integer numberOfAttempts;
    private Long points;
    private StudentDTO student;
    private SubjectInSubjectEnrollmentDTO subject;

    public SubjectEnrollmentDTO(SubjectEnrollment subjectEnrollment) {
        this.id = subjectEnrollment.getId();
        this.finalGrade = subjectEnrollment.getFinalGrade();
        this.numberOfAttempts = subjectEnrollment.getNumberOfAttempts();
        this.points = subjectEnrollment.getPoints();
        this.subject = new SubjectInSubjectEnrollmentDTO(subjectEnrollment.getSubject());
    }
}
