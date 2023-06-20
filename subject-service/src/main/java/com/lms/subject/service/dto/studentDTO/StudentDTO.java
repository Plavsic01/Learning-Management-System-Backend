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


}
