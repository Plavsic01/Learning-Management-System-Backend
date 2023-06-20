package com.lms.user.service.service;

import com.lms.user.service.dto.studentDTO.StudentDTO;
import com.lms.user.service.dto.UserDTO;
import com.lms.user.service.exception.DoesNotExistException;
import com.lms.user.service.model.Student;
import com.lms.user.service.repository.StudentRepository;
import com.lms.user.service.service.base.BaseService;
import jakarta.ws.rs.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService extends BaseService<Student, StudentDTO,Long> {
    @Autowired
    private StudentRepository repository;

    @Autowired
    private UserService userService;

    @Autowired
    private StudentYearService studentYearService;

    public StudentService(StudentRepository repository) {
        super(repository);
    }

    @Override
    public StudentDTO convertToDTO(Student object) {
        return new StudentDTO(object);
    }

    @Override
    public List<StudentDTO> findAll() {
        List<StudentDTO> students = new ArrayList<>();
        for(Student student:repository.findAll()){
            UserDTO userDTO = userService.findByUserId(student.getUserId());
            StudentDTO studentDTO = convertToDTO(student);
            studentDTO.setStudentYears(studentYearService.findAllByStudentId(student.getId()));
            studentDTO.setUser(userDTO);
            students.add(studentDTO);
        }
        return students;
    }

    @Override
    public StudentDTO findOne(Long id) {
        Student student = repository.getById(id);
        UserDTO userDTO = userService.findByUserId(student.getUserId());
        StudentDTO studentDTO = convertToDTO(student);
        studentDTO.setUser(userDTO);
        studentDTO.setStudentYears(studentYearService.findAllByStudentId(student.getId()));
        return studentDTO;
    }

    public StudentDTO findByUserId(Long userId){
        if(this.repository.findByUserId(userId).isPresent()){
            return convertToDTO(this.repository.findByUserId(userId).get());
        }
        throw new DoesNotExistException();
    }

}
