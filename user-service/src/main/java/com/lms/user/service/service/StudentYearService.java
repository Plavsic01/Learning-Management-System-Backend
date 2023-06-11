//package com.lms.user.service.service;
//
//import com.lms.user.service.dto.StudentYearDTO;
//import com.lms.user.service.model.StudentYear;
//import com.lms.user.service.repository.StudentYearRepository;
//import com.lms.user.service.service.base.BaseService;
//import org.springframework.stereotype.Service;
//
//@Service
//public class StudentYearService extends BaseService<StudentYear,StudentYearDTO,Long> {
//
//    private StudentYearRepository repository;
//
//    public StudentYearService(StudentYearRepository repository) {
//        super(repository);
//    }
//    @Override
//    public StudentYearDTO convertToDTO(StudentYear object) {
//        return new StudentYearDTO(object);
//    }
//}
