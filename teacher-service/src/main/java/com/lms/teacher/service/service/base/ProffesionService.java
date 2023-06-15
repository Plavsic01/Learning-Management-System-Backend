package com.lms.teacher.service.service.base;

import com.lms.teacher.service.dto.ProffesionsDTO;
import com.lms.teacher.service.dto.ScientificDisciplineDTO;
import com.lms.teacher.service.dto.TeacherDTO;
import com.lms.teacher.service.dto.TypeOfScientificDisciplineDTO;
import com.lms.teacher.service.model.Proffesion;
import com.lms.teacher.service.model.Teacher;
import com.lms.teacher.service.model.TypeOfScientificDiscipline;
import com.lms.teacher.service.repository.base.ProffesionRepository;
import com.lms.teacher.service.repository.base.ScientificDisciplineRepository;
import com.lms.teacher.service.repository.base.TeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class ProffesionService extends BaseService<Proffesion, ProffesionsDTO,Long> {

    @Autowired
    private ProffesionRepository repository;
    @Autowired
    private TeacherService teacherService;
    @Autowired
    private ScientificDisciplineService scientificDisciplineService;
    @Autowired
    private TypeOfScientificDisciplineService typeOfScientificDisciplineService;
    public ProffesionService(ProffesionRepository repository) {
        super(repository);
    }

    @Override
    public ProffesionsDTO convertToDTO(Proffesion object) {
        ProffesionsDTO professionDTO = new ProffesionsDTO();
        professionDTO.setId(object.getId());
        professionDTO.setName(object.getName());
        professionDTO.setStartDate(object.getStartDate());
        professionDTO.setEndDate(object.getEndDate());

        if (object.getTeacher() != null) {
            TeacherDTO teacherDTO = teacherService.convertToDTO(object.getTeacher());
            professionDTO.setTeacher(teacherDTO);
        }

        if (object.getTypeOfScientificDiscipline() != null) {
            TypeOfScientificDisciplineDTO typeOfScientificDisciplineDTO = typeOfScientificDisciplineService.convertToDTO(object.getTypeOfScientificDiscipline());
            professionDTO.setTypeOfScientificDiscipline(typeOfScientificDisciplineDTO);
        }

        if (object.getScientificDiscipline() != null) {
            ScientificDisciplineDTO scientificDisciplineDTO = scientificDisciplineService.convertToDTO(object.getScientificDiscipline());
            professionDTO.setScientificDiscipline(scientificDisciplineDTO);
        }
        return professionDTO;
    }
}
