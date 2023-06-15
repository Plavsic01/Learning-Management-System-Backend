package com.lms.user.service.service;

import com.lms.user.service.dto.StudentDTO;
import com.lms.user.service.dto.StudentYearDTO;
import com.lowagie.text.*;
import com.lowagie.text.pdf.PdfWriter;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;

@Service
public class PDFGeneratorService {

    @Autowired
    private StudentService studentService;

    @Autowired StudentYearService studentYearService;

    public void export(HttpServletResponse response) throws IOException {
        Document document = new Document(PageSize.A4);
        PdfWriter.getInstance(document,response.getOutputStream());

        document.open();

        Font fontTitle = FontFactory.getFont(FontFactory.HELVETICA_BOLD);
        fontTitle.setSize(18);

        Font fontParagraph = FontFactory.getFont(FontFactory.HELVETICA);
        fontParagraph.setSize(12);

        Paragraph titleParagraph = new Paragraph("STUDENTS\n\n",fontTitle);
        titleParagraph.setAlignment(Paragraph.ALIGN_CENTER);

        document.add(titleParagraph);


        for(StudentDTO s:studentService.findAll()){

            Paragraph studentParagraph = new Paragraph(s.displayStudentFormatted(),fontParagraph);
            studentParagraph.setAlignment(Paragraph.ALIGN_CENTER);
            studentParagraph.setLeading(20);
            document.add(studentParagraph);

            for(StudentYearDTO sy: studentYearService.findAllByStudentId(s.getId())){
                String studentData = "\nIndex Number: " + sy.getIndexNo() + "\nDate Of Enrollment: " + sy.getDateOfEnrollment()
                        + "\nStudy Year: " + sy.getYearOfStudy().getYear()
                        + "\nStudy Program Name:" + sy.getYearOfStudy().getStudyProgram().getName();
                Paragraph enrolledStudyPrograms = new Paragraph(studentData,fontParagraph);
                enrolledStudyPrograms.setAlignment(Paragraph.ALIGN_CENTER);
                enrolledStudyPrograms.setLeading(20);
                document.add(enrolledStudyPrograms);
            }

        }

        document.close();

    }

}
