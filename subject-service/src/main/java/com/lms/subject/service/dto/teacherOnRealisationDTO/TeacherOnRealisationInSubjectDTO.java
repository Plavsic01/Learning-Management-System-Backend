package com.lms.subject.service.dto.teacherOnRealisationDTO;

import com.lms.subject.service.model.TeacherOnRealisation;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class TeacherOnRealisationInSubjectDTO {
    private Long id;
    private Long teacherId;

    public TeacherOnRealisationInSubjectDTO(TeacherOnRealisation teacherOnRealisation) {
        this.id = teacherOnRealisation.getId();
        this.teacherId = teacherOnRealisation.getTeacherId();
    }
}
