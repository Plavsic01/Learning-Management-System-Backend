//package com.lms.user.service.dto;
//
//import com.lms.user.service.model.Student;
//import lombok.AllArgsConstructor;
//import lombok.Data;
//import lombok.NoArgsConstructor;
//
//import java.util.ArrayList;
//import java.util.List;
//
//@NoArgsConstructor
//@AllArgsConstructor
//@Data
//public class StudentDTO {
//    private Long id;
//    private Long userId;
//    private List<StudentYearDTO> studentYears;
//
//
//    public StudentDTO(Student student) {
//        this.id = student.getId();
//        this.userId = student.getUserId();
//        this.studentYears = studentYears(student);
//    }
//
//    private List<StudentYearDTO> studentYears(Student student) {
//
//        List<StudentYearDTO> studentYearDTO = new ArrayList<>();
//
//        student.getStudentYears().forEach((StudentYearDTO::new));
//
//        return studentYearDTO;
//    }
//}
