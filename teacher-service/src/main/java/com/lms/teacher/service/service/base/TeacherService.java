package com.lms.teacher.service.service.base;

import com.lms.teacher.service.dto.ProffesionsDTO;
import com.lms.teacher.service.dto.TeacherDTO;
import com.lms.teacher.service.dto.UserDTO;
import com.lms.teacher.service.model.Proffesion;
import com.lms.teacher.service.model.Teacher;
import com.lms.teacher.service.repository.base.TeacherRepository;
import com.netflix.appinfo.InstanceInfo;
import com.netflix.discovery.EurekaClient;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.ArrayList;
import java.util.List;

@Service
public class TeacherService extends BaseService<Teacher, TeacherDTO,Long>{
    @Autowired
    private TeacherRepository repository;
    @Autowired
    private WebClient webClient;
    @Autowired
    private EurekaClient eurekaClient;
    public TeacherService(TeacherRepository repository) {
        super(repository);
    }

    public Page<Teacher> findAll(Pageable pageable){
        return repository.findAll(pageable);
    }

    @Override
    public TeacherDTO convertToDTO(Teacher object) {

        TeacherDTO teacherDTO = new TeacherDTO();
        teacherDTO.setId(object.getId());
        UserDTO userDTO = findUser(object.getUserId());
        teacherDTO.setUser(userDTO);
        teacherDTO.setBiography(object.getBiography());


        List<ProffesionsDTO> professionDTOs = new ArrayList<>();
        for (Proffesion profession : object.getProfessions()) {
            ProffesionsDTO professionDTO = new ProffesionsDTO();
            professionDTO.setId(profession.getId());
            professionDTO.setName(profession.getName());
            professionDTOs.add(professionDTO);
        }
        teacherDTO.setProfessions(professionDTOs);
        teacherDTO.setFirstName(userDTO.getFirstName());
        teacherDTO.setLastName(userDTO.getLastName());
        return teacherDTO;
    }

    public UserDTO findUser(Long userId){
        InstanceInfo userService = eurekaClient.getApplication("user-service").getInstances().get(0);

        UserDTO userDTO = webClient.get().uri(String.format("%sapi/user/users/%s",userService.getHomePageUrl(),userId))
                .retrieve().bodyToMono(UserDTO.class).block();

        return userDTO;
    }



}
