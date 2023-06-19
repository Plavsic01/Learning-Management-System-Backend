package com.lms.university.service.service;

import com.lms.university.service.dto.AddressDTO;
import com.lms.university.service.dto.FacultyDTO;
import com.lms.university.service.dto.StudyProgramDTO;
import com.lms.university.service.dto.UniversityDTO;
import com.lms.university.service.model.Faculty;
import com.lms.university.service.model.StudyProgram;
import com.lms.university.service.model.University;
import com.lms.university.service.repository.FacultyRepository;
import com.lms.university.service.service.base.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class FacultyService extends BaseService<Faculty, FacultyDTO,Long> {
    @Autowired
    private FacultyRepository repository;
    @Autowired
    private AddressService addressService;

    @Autowired
    private UniversityService universityService;

    @Autowired
    private StudyProgramService studyProgramService;

    public FacultyService(FacultyRepository repository) {
        super(repository);
    }

    @Override
    public FacultyDTO convertToDTO(Faculty object) {

        AddressDTO addressFacultyDTO = addressService.findOne(object.getAddress().getId());

        University university = universityService.findOneWithoutDTO(object.getUniversity().getId()).get();
        AddressDTO addressUniversityDTO = addressService.findOne(university.getAddress().getId());

        List<StudyProgram> studyPrograms = studyProgramService.findAllByFacultyId(object.getId());

        List<StudyProgramDTO> studyProgramsDTO = new ArrayList<>();

        for(StudyProgram sp:studyProgramService.findAllByFacultyId(object.getId())){
            studyProgramsDTO.add(new StudyProgramDTO(sp.getId(),sp.getName(),sp.getCoordinatorId()));
        }


        return new FacultyDTO(object.getId(),object.getName(),addressFacultyDTO, object.getDeanId(),
                new UniversityDTO(object.getUniversity().getId(),object.getUniversity().getName(),
                        object.getUniversity().getDateOfEstablishment(),object.getUniversity().getEmail(),
                        object.getUniversity().getPhone(),addressUniversityDTO,object.getUniversity().getRectorId()),
                studyProgramsDTO);
    }


    public List<FacultyDTO> findAllByUniversityId(Long id){
        return convertArrayToDTO(this.repository.findAllByUniversityId(id));
    }

}


