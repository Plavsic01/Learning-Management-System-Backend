package com.lms.teacher.service.service.base;

import com.lms.teacher.service.dto.TeacherDTO;
import com.lowagie.text.*;
import com.lowagie.text.pdf.PdfWriter;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class PDFGeneratorService {

    @Autowired
    private TeacherService service;

    public void export(HttpServletResponse response) throws IOException {
        Document document = new Document(PageSize.A4);
        PdfWriter.getInstance(document,response.getOutputStream());

        document.open();

        Font fontTitle = FontFactory.getFont(FontFactory.HELVETICA_BOLD);
        fontTitle.setSize(18);

        Font fontParagraph = FontFactory.getFont(FontFactory.HELVETICA);
        fontParagraph.setSize(12);

        Paragraph titleParagraph = new Paragraph("TEACHERS\n\n",fontTitle);
        titleParagraph.setAlignment(Paragraph.ALIGN_CENTER);

        document.add(titleParagraph);


        for(TeacherDTO s:service.findAll()){

            String teacherData = "\nID: " + s.getId() + "\nUser ID: " + s.getUser().getId()
                    //dodati user details
                    + "\nBiography: " + s.getBiography()
                    + "\nProfessions:" + s.getProfessions();
            Paragraph studentParagraph = new Paragraph(teacherData,fontParagraph);
            studentParagraph.setAlignment(Paragraph.ALIGN_CENTER);
            studentParagraph.setLeading(20);
            document.add(studentParagraph);


        }

        document.close();

    }

}
