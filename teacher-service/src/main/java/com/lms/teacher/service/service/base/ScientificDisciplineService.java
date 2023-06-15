package com.lms.teacher.service.service.base;

import com.lms.teacher.service.dto.ScientificDisciplineDTO;
import com.lms.teacher.service.dto.TypeOfScientificDisciplineDTO;
import com.lms.teacher.service.model.ScientificDiscipline;
import com.lms.teacher.service.repository.base.BaseRepository;
import com.lms.teacher.service.repository.base.ScientificDisciplineRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ScientificDisciplineService extends BaseService <ScientificDiscipline, ScientificDisciplineDTO, Long>{

    @Autowired
    private ScientificDisciplineRepository repository;
    @Autowired
    private TypeOfScientificDisciplineService typeOfScientificDisciplineService;
    @Autowired
    private ProffesionService proffesionService;

    public ScientificDisciplineService(BaseRepository<ScientificDiscipline, Long> repository) {
        super(repository);
    }

    @Override
    public ScientificDisciplineDTO convertToDTO(ScientificDiscipline object) {
        ScientificDisciplineDTO scientificDisciplineDTO = new ScientificDisciplineDTO();
        scientificDisciplineDTO.setId(object.getId());
        scientificDisciplineDTO.setName(object.getName());

        if (object.getTypeOfScientificDiscipline() != null) {
            TypeOfScientificDisciplineDTO typeOfScientificDisciplineDTO = typeOfScientificDisciplineService.convertToDTO(object.getTypeOfScientificDiscipline());
            scientificDisciplineDTO.setTypeOfScientificDisciplines(typeOfScientificDisciplineDTO);
        }

        return scientificDisciplineDTO;
    }
}
