package com.lms.user.service.service;

import com.lms.user.service.dto.studentDTO.StudentYearDTO;
import com.lms.user.service.dto.YearOfStudyDTO;
import com.lms.user.service.model.StudentYear;
import com.lms.user.service.repository.StudentYearRepository;
import com.lms.user.service.service.base.BaseService;
import com.netflix.appinfo.InstanceInfo;
import com.netflix.discovery.EurekaClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.List;

@Service
public class StudentYearService extends BaseService<StudentYear,StudentYearDTO,Long> {
    @Autowired
    private StudentYearRepository repository;
    @Autowired
    private WebClient webClient;
    @Autowired
    private EurekaClient eurekaClient;

    public StudentYearService(StudentYearRepository repository) {
        super(repository);
    }
    @Override
    public StudentYearDTO convertToDTO(StudentYear object) {
        StudentYearDTO studentYearDTO = new StudentYearDTO(object);
        studentYearDTO.setYearOfStudy(findYearOfStudy(object.getYearOfStudyId()));
        return studentYearDTO;
    }

    public List<StudentYearDTO> findAllByStudentId(Long studentId){
        return convertArrayToDTO(repository.findAllByStudentId(studentId));
    }

    public YearOfStudyDTO findYearOfStudy(Long yearOfStudyId){
        InstanceInfo subjectService = eurekaClient.getApplication("subject-service").getInstances().get(0);

        YearOfStudyDTO yearOfStudyDTO = webClient.get().uri(String.format("%sapi/subject/year-of-study/%s",subjectService.getHomePageUrl(),yearOfStudyId))
                .retrieve().bodyToMono(YearOfStudyDTO.class).block();

        return yearOfStudyDTO;
    }
}
