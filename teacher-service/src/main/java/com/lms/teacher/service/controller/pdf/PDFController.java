package com.lms.teacher.service.controller.pdf;
import com.lms.teacher.service.service.base.PDFGeneratorService;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;


@Controller
@RequestMapping(path = "/api/teacher/teachers")
public class PDFController {
    @Autowired
    private PDFGeneratorService pdfGeneratorService;

    @GetMapping("/generate/pdf")
    public void generatePDF(HttpServletResponse response) throws IOException {
        response.setContentType("application/pdf");

        DateFormat dateFormatter = new SimpleDateFormat("yyyy-MM-dd:hh:mm:ss");
        String currentDateTime = dateFormatter.format(new Date());

        String headerKey = "Content-Disposition";
        String headerValue = "attachment; filename=export_" + currentDateTime + ".pdf";
        response.setHeader(headerKey,headerValue);

        this.pdfGeneratorService.export(response);
    }



}
