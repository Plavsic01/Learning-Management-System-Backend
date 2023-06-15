package com.lms.teacher.service.service.base;

import com.lms.teacher.service.dto.ProffesionsDTO;
import com.lms.teacher.service.dto.TeacherDTO;
import com.lms.teacher.service.model.Proffesion;
import com.lms.teacher.service.model.Teacher;
import com.lms.teacher.service.repository.base.TeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;

import java.util.ArrayList;
import java.util.List;

@Service
public class TeacherService extends BaseService<Teacher, TeacherDTO,Long>{
    @Autowired
    private TeacherRepository repository;

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
        teacherDTO.setUserId(object.getUserId());
        teacherDTO.setBiography(object.getBiography());

        List<ProffesionsDTO> professionDTOs = new ArrayList<>();
        for (Proffesion profession : object.getProfessions()) {
            ProffesionsDTO professionDTO = new ProffesionsDTO();
            professionDTO.setId(profession.getId());
            professionDTO.setName(profession.getName());
            professionDTOs.add(professionDTO);
        }
        teacherDTO.setProfessions(professionDTOs);

        return teacherDTO;
    }

}
