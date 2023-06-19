package com.lms.subject.service.dto;

import com.lms.subject.service.dto.notificationDTO.NotificationInSubjectDTO;
import com.lms.subject.service.dto.teacherOnRealisationDTO.TeacherOnRealisationDTO;
import com.lms.subject.service.dto.teacherOnRealisationDTO.TeacherOnRealisationInSubjectDTO;
import com.lms.subject.service.model.Notification;
import com.lms.subject.service.model.Subject;
import com.lms.subject.service.model.TeacherOnRealisation;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;


@NoArgsConstructor
@AllArgsConstructor
@Data
public class SubjectDTO {
    private Long id;
    private String name;
    private String syllabus;
    private Integer ects;
    private Boolean mandatorySubject;
    private Integer numberOfSemesters;
    private Integer numberOfLectures;
    private Integer numberOfPracticalLectures;
    private YearOfStudyInSubjectDTO yearOfStudy;
    private List<NotificationInSubjectDTO> notifications;
    private List<TeacherOnRealisationInSubjectDTO> teachersOnRealisation;

    public SubjectDTO(Subject subject) {
        this.id = subject.getId();
        this.name = subject.getName();
        this.syllabus = subject.getSyllabus();
        this.ects = subject.getEcts();
        this.mandatorySubject = subject.getMandatorySubject();
        this.numberOfSemesters = subject.getNumberOfSemesters();
        this.numberOfLectures = subject.getNumberOfLectures();
        this.numberOfPracticalLectures = subject.getNumberOfPracticalLectures();
        this.yearOfStudy = new YearOfStudyInSubjectDTO(subject.getYearOfStudy());
        this.notifications = createNotifications(subject);
        this.teachersOnRealisation = createTeachersOnRealisation(subject);
    }

    public SubjectDTO(Long id, String name, String syllabus, Integer ects,
                      boolean mandatorySubject, Integer numberOfSemesters, Integer numberOfLectures, Integer numberOfPracticalLectures) {
        this.id = id;
        this.name = name;
        this.syllabus = syllabus;
//        this.teacherId = teacherId;
//        this.assistantId = assistantId;
        this.ects = ects;
        this.mandatorySubject = mandatorySubject;
        this.numberOfSemesters = numberOfSemesters;
        this.numberOfLectures = numberOfLectures;
        this.numberOfPracticalLectures = numberOfPracticalLectures;
    }

    public List<NotificationInSubjectDTO> createNotifications(Subject subject){
        List<NotificationInSubjectDTO> notifications = new ArrayList<>();
        for(Notification n:subject.getNotifications()){
            notifications.add(new NotificationInSubjectDTO(n.getId(),n.getTitle(),n.getDateOfNotification(),n.getDescription()));
        }
        return notifications;
    }

    public List<TeacherOnRealisationInSubjectDTO> createTeachersOnRealisation(Subject subject){
        List<TeacherOnRealisationInSubjectDTO> teachersOnRealisation = new ArrayList<>();
        for(TeacherOnRealisation t:subject.getTeachersOnRealisation()){
            teachersOnRealisation.add(new TeacherOnRealisationInSubjectDTO(t.getId(),t.getTeacherId()));
        }
        return teachersOnRealisation;
    }


}
