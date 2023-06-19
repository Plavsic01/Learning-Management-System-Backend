package com.lms.subject.service.service;

import com.lms.subject.service.dto.YearOfStudyDTO;
import com.lms.subject.service.dto.studentDTO.StudentDTO;
import com.lms.subject.service.dto.studyProgramDTO.StudyProgramDTO;
import com.lms.subject.service.model.YearOfStudy;
import com.lms.subject.service.repository.YearOfStudyRepository;
import com.lms.subject.service.service.base.BaseService;
import com.netflix.appinfo.InstanceInfo;
import com.netflix.discovery.EurekaClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.List;

@Service
public class YearOfStudyService extends BaseService<YearOfStudy,YearOfStudyDTO,Long> {
    @Autowired
    private YearOfStudyRepository repository;
    @Autowired
    private WebClient webClient;
    @Autowired
    private EurekaClient eurekaClient;

    public YearOfStudyService(YearOfStudyRepository repository) {
        super(repository);
    }
    @Override
    public YearOfStudyDTO convertToDTO(YearOfStudy object) {
        YearOfStudyDTO yearOfStudyDTO = new YearOfStudyDTO(object);
        yearOfStudyDTO.setStudyProgram(findStudyProgram(object.getStudyProgramId()));
        return yearOfStudyDTO;
    }

    public List<YearOfStudyDTO> findAllByStudyProgramId(Long studyProgramId){
        return convertArrayToDTO(repository.findAllByStudyProgramId(studyProgramId));
    }


    public StudyProgramDTO findStudyProgram(Long yearOfStudyId){
        InstanceInfo universityService = eurekaClient.getApplication("university-service").getInstances().get(0);

        StudyProgramDTO studyProgramDTO = webClient.get().uri(String.format("%sapi/university/study-programs/%s",universityService.getHomePageUrl(),yearOfStudyId))
                .retrieve().bodyToMono(StudyProgramDTO.class).block();

        return studyProgramDTO;
    }
}
