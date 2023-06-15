package com.lms.teacher.service.controller;
import com.lms.teacher.service.controller.base.BaseController;
import com.lms.teacher.service.dto.TeacherDTO;
import com.lms.teacher.service.model.Teacher;
import com.lms.teacher.service.service.base.BaseService;
import com.lms.teacher.service.service.base.TeacherService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping(path = "/api/teacher/teachers")
public class TeacherController extends BaseController<Teacher, TeacherDTO,Long> {

    private TeacherService service;
    public TeacherController(BaseService<Teacher, TeacherDTO, Long> service) {
        super(service);
    }
}
