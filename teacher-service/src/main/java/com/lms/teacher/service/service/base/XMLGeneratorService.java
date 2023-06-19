package com.lms.teacher.service.service.base;

import com.lms.teacher.service.dto.ProffesionsDTO;
import com.lms.teacher.service.dto.TeacherDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

@Service
public class XMLGeneratorService {

    @Autowired
    private TeacherService service;

    public void export(HttpServletResponse response) throws ParserConfigurationException, TransformerException, IOException, SAXException {
        DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder docBuilder = docFactory.newDocumentBuilder();

        // Create the root element
        Document doc = docBuilder.newDocument();
        Element rootElement = doc.createElement("Teachers");
        doc.appendChild(rootElement);

        for (TeacherDTO s : service.findAll()) {
            Element teacherElement = doc.createElement("Teacher");
            rootElement.appendChild(teacherElement);

            addElement(doc, teacherElement, "ID", s.getId().toString());
            addElement(doc, teacherElement, "UserID", s.getUser().getId().toString());
            addElement(doc, teacherElement, "FirstName", s.getUser().getFirstName());
            addElement(doc, teacherElement, "LastName", s.getUser().getLastName());
            addElement(doc, teacherElement, "Email", s.getUser().getEmail());
            addElement(doc, teacherElement, "Biography", s.getBiography());

            if (s.getProfessions().size() > 0) {
                Element professionsElement = doc.createElement("Professions");
                teacherElement.appendChild(professionsElement);

                for (ProffesionsDTO profession : s.getProfessions()) {
                    addElement(doc, professionsElement, "Profession", String.valueOf(profession));
                }
            }
        }

        // Transform the XML document to response output stream
        TransformerFactory transformerFactory = TransformerFactory.newInstance();
        Transformer transformer = transformerFactory.newTransformer();
        DOMSource source = new DOMSource(doc);
        StreamResult result = new StreamResult(response.getOutputStream());
        transformer.transform(source, result);
    }

    private void addElement(Document doc, Element parentElement, String tagName, String textContent) {
        Element element = doc.createElement(tagName);
        element.setTextContent("\n" + textContent.trim() + "\n");
        parentElement.appendChild(element);
    }
}

