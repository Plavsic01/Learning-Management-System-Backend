package com.lms.teacher.service.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class TeacherDTO {
    private Long id;
    private Long userId;
    private String biography;
    private List<ProffesionsDTO> professions = new ArrayList<>();

}
