package com.lms.teacher.service.service.base;

import com.lms.teacher.service.dto.ScientificDisciplineDTO;
import com.lms.teacher.service.dto.TypeOfScientificDisciplineDTO;
import com.lms.teacher.service.model.ScientificDiscipline;
import com.lms.teacher.service.model.TypeOfScientificDiscipline;
import com.lms.teacher.service.repository.base.TypeOfScientificDisciplineRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class TypeOfScientificDisciplineService extends BaseService <TypeOfScientificDiscipline, TypeOfScientificDisciplineDTO, Long>{
    @Autowired
    private TypeOfScientificDisciplineRepository repository;
    @Autowired
    private ScientificDisciplineService scientificDisciplineService;

    public TypeOfScientificDisciplineService(TypeOfScientificDisciplineRepository repository) {
        super(repository);
    }
    @Override
    public TypeOfScientificDisciplineDTO convertToDTO(TypeOfScientificDiscipline object) {
        TypeOfScientificDisciplineDTO typeOfScientificDisciplineDTO = new TypeOfScientificDisciplineDTO();
        typeOfScientificDisciplineDTO.setId(object.getId());
        typeOfScientificDisciplineDTO.setName(object.getName());

        // Konvertovanje liste ScientificDiscipline u DTO objekte
        List<ScientificDisciplineDTO> scientificDisciplineDTOs = convertScientificDisciplinesToDTOs(object.getScientificDisciplines());
        typeOfScientificDisciplineDTO.setScientificDisciplines(scientificDisciplineDTOs);

        return typeOfScientificDisciplineDTO;
    }

    private List<ScientificDisciplineDTO> convertScientificDisciplinesToDTOs(List<ScientificDiscipline> scientificDisciplines) {
        List<ScientificDisciplineDTO> scientificDisciplineDTOs = new ArrayList<>();

        for (ScientificDiscipline scientificDiscipline : scientificDisciplines) {
            ScientificDisciplineDTO scientificDisciplineDTO = new ScientificDisciplineDTO();
            scientificDisciplineDTO.setId(scientificDiscipline.getId());
            scientificDisciplineDTO.setName(scientificDiscipline.getName());

            scientificDisciplineDTOs.add(scientificDisciplineDTO);
        }

        return scientificDisciplineDTOs;
    }
}
