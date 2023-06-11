//package com.lms.user.service.service;
//
//import com.lms.user.service.dto.StudentDTO;
//import com.lms.user.service.model.Student;
//import com.lms.user.service.repository.StudentRepository;
//import com.lms.user.service.service.base.BaseService;
//import org.springframework.stereotype.Service;
//
//@Service
//public class StudentService extends BaseService<Student, StudentDTO,Long> {
//
//    private StudentRepository repository;
//
//    public StudentService(StudentRepository repository) {
//        super(repository);
//    }
//
//    @Override
//    public StudentDTO convertToDTO(Student object) {
//        return new StudentDTO(object);
//    }
//}
