package com.lms.user.service.dto;

import com.lms.user.service.model.Student;
import com.lms.user.service.model.StudentYear;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class StudentDTO {
    private Long id;
    private Long userId;
    private List<StudentYearDTO> studentYears;


    public StudentDTO(Student student) {
        this.id = student.getId();
        this.userId = student.getUserId();
        this.studentYears = studentYearsDTO(student);
    }

    private List<StudentYearDTO> studentYearsDTO(Student student){
        List<StudentYearDTO> students = new ArrayList<>();
        if(student.getStudentYears() != null){

            for(StudentYear s :student.getStudentYears()){
            students.add(new StudentYearDTO(s.getId(),s.getDateOfEnrollment(),s.getIndexNo()));
            }
        }
        return students;
    }
}
