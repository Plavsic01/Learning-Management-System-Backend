package com.lms.teacher.service.controller;
import com.lms.teacher.service.controller.base.BaseController;
import com.lms.teacher.service.dto.ProffesionsDTO;
import com.lms.teacher.service.model.Proffesion;
import com.lms.teacher.service.service.base.ProffesionService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/profession")
public class ProffesionController extends BaseController<Proffesion, ProffesionsDTO,Long> {

    private ProffesionService service;

    public ProffesionController(ProffesionService service) {
        super(service);
        this.service = service;
    }
}
