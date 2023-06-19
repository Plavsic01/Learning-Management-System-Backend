
package com.lms.teacher.service.controller;
        import com.lms.teacher.service.service.base.XMLGeneratorService;
        import org.springframework.beans.factory.annotation.Autowired;
        import org.springframework.http.HttpStatus;
        import org.springframework.http.MediaType;
        import org.springframework.web.bind.annotation.GetMapping;
        import org.springframework.web.bind.annotation.RequestMapping;
        import org.springframework.web.bind.annotation.ResponseStatus;
        import org.springframework.web.bind.annotation.RestController;

        import jakarta.servlet.http.HttpServletResponse;

@RestController
@RequestMapping("/api/teacher/teachers/xml")
public class XMLGeneratorController {

    private XMLGeneratorService xmlGeneratorService;

    @Autowired
    public XMLGeneratorController(XMLGeneratorService xmlGeneratorService) {
        this.xmlGeneratorService = xmlGeneratorService;
    }

    @GetMapping(value = "/generate", produces = MediaType.APPLICATION_XML_VALUE)
    @ResponseStatus(HttpStatus.OK)
    public void generateXML(HttpServletResponse response) {
        try {
            response.setHeader("Content-Disposition", "attachment; filename=teachers.xml");
            xmlGeneratorService.export(response);
        } catch (Exception e) {
            // Handle any exceptions or error handling logic here
            e.printStackTrace();
        }
    }
}

