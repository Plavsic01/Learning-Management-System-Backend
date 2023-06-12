package com.lms.user.service.dto;

import com.lms.user.service.model.Student;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class StudentStudyYearDTO {

    private Long id;
    private Long userId;

    public StudentStudyYearDTO(Student student) {
        this.id = student.getId();
        this.userId = student.getUserId();
    }
}
