INSERT INTO teacher.teacher (id, biography, user_id) VALUES ('1', 'Computer Science professor with research interests in artificial intelligence.', '1');
INSERT INTO teacher.type_of_scientific_discipline (id, name) VALUES ('1','Mathematics');
INSERT INTO teacher.scientific_discipline (id, name,type_of_scientific_discipline_id) VALUES ('1', 'Discrete Mathematics', '1');
INSERT INTO teacher.proffesion (id, end_date, start_date, scientific_discipline_id, teacher_id, type_of_scientific_discipline_id, name) VALUES ('1', '2022-12-31', '9999-12-31', '1', '1', '1', 'Professor');