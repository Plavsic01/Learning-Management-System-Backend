package com.lms.subject.service.dto.studentDTO;

import com.lms.subject.service.dto.userDTO.UserDTO;

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
    private UserDTO user;
//    private List<StudentYearDTO> studentYears;


//    public StudentDTO(Student student) {
//        this.id = student.getId();
//        this.studentYears = studentYearsDTO(student);
//    }




//    private List<StudentYearDTO> studentYearsDTO(Student student){
//        List<StudentYearDTO> students = new ArrayList<>();
//        if(student.getStudentYears() != null){
//
//            for(StudentYear s :student.getStudentYears()){
//            students.add(new StudentYearDTO(s.getId(),s.getDateOfEnrollment(),s.getIndexNo()));
//            }
//        }
//        return students;
//    }

}
