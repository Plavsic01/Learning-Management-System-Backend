package com.lms.user.service.dto.studentDTO;

import com.lms.user.service.dto.YearOfStudyDTO;
import com.lms.user.service.model.StudentYear;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class StudentYearDTO {

    private Long id;
    private LocalDate dateOfEnrollment;
    private String indexNo;
    private StudentStudyYearDTO student;
    private YearOfStudyDTO yearOfStudy;
    public StudentYearDTO(StudentYear studentYear) {
        this.id = studentYear.getId();
        this.dateOfEnrollment = studentYear.getDateOfEnrollment();
        this.indexNo = studentYear.getIndexNo();
        this.student = new StudentStudyYearDTO(studentYear.getStudent());
    }

}
