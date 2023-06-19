package com.lms.subject.service.dto.teacherOnRealisationDTO;

import com.lms.subject.service.dto.SubjectDTO;
import com.lms.subject.service.dto.SubjectInTeacherOnRealisationDTO;
import com.lms.subject.service.model.Subject;
import com.lms.subject.service.model.TeacherOnRealisation;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class TeacherOnRealisationDTO {

    private Long id;
    private Long teacherId;
    private SubjectInTeacherOnRealisationDTO subject;

    public TeacherOnRealisationDTO(TeacherOnRealisation teacherOnRealisation) {
        this.id = teacherOnRealisation.getId();
        this.teacherId = teacherOnRealisation.getTeacherId();
    }
}
