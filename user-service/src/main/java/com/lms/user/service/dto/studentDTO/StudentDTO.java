package com.lms.user.service.dto.studentDTO;

import com.lms.user.service.dto.UserDTO;
import com.lms.user.service.model.Student;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class StudentDTO {
    private Long id;
    private UserDTO user;
    private List<StudentYearDTO> studentYears;


    public StudentDTO(Student student) {
        this.id = student.getId();
    }

    public String displayStudentFormatted(){
        return String.format("\nFirst Name: %s\n Last Name: %s\n Date Of Birth: %s\n Jmbg: %s\n Email: %s\n Phone: %s",
                user.getFirstName(),user.getLastName(),
                user.getDOB(),user.getJmbg(),user.getEmail(),user.getPhone());
    }
}
