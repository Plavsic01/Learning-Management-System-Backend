package com.lms.subject.service.service;

import com.lms.subject.service.dto.SubjectEnrollmentDTO;
import com.lms.subject.service.dto.SubjectInSubjectEnrollmentDTO;
import com.lms.subject.service.dto.studentDTO.StudentDTO;
import com.lms.subject.service.exception.DoesNotExistException;
import com.lms.subject.service.model.Subject;
import com.lms.subject.service.model.SubjectEnrollment;
import com.lms.subject.service.repository.SubjectEnrollmentRepository;
import com.lms.subject.service.service.base.BaseService;
import com.netflix.appinfo.InstanceInfo;
import com.netflix.discovery.EurekaClient;
import jakarta.ws.rs.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.List;

@Service
public class SubjectEnrollmentService extends BaseService<SubjectEnrollment,SubjectEnrollmentDTO,Long> {
    @Autowired
    private SubjectEnrollmentRepository repository;
    @Autowired
    private SubjectService subjectService;
    @Autowired
    private WebClient webClient;
    @Autowired
    private EurekaClient eurekaClient;

    public SubjectEnrollmentService(SubjectEnrollmentRepository repository) {
        super(repository);
    }
    @Override
    public SubjectEnrollmentDTO convertToDTO(SubjectEnrollment object) {

        SubjectEnrollmentDTO subjectEnrollmentDTO = new SubjectEnrollmentDTO(object);
        subjectEnrollmentDTO.setStudent(findStudent(object.getStudentId()));

        if(object.getSubject() != null){
            if(subjectService.findOneWithoutDTO(object.getSubject().getId()).isPresent()){
                Subject subject = subjectService.findOneWithoutDTO(object.getSubject().getId()).get();
//                SubjectInSubjectEnrollmentDTO subjectInSubjectEnrollmentDTO = new SubjectInSubjectEnrollmentDTO(subject);
//                subjectEnrollmentDTO.setSubject(subjectInSubjectEnrollmentDTO);
            }else{
                throw new DoesNotExistException();
            }
        }
        return subjectEnrollmentDTO;
    }

    public StudentDTO findStudent(Long studentId){
        InstanceInfo userService = eurekaClient.getApplication("user-service").getInstances().get(0);

        StudentDTO studentDTO = webClient.get().uri(String.format("%sapi/user/students/%s",userService.getHomePageUrl(),studentId))
                .retrieve().bodyToMono(StudentDTO.class).block();

        return studentDTO;
    }

    public List<SubjectEnrollmentDTO> findAllByStudentIdAndFinalGradeIsNull(Long studentId){
        return convertArrayToDTO(repository.findAllByStudentIdAndFinalGradeIsNull(studentId));
    }

    public List<SubjectEnrollmentDTO> findAllByStudentIdAndFinalGradeIsNotNull(Long studentId){
        return convertArrayToDTO(repository.findAllByStudentIdAndFinalGradeIsNotNull(studentId));
    }

}
