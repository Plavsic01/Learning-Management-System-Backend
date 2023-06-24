INSERT INTO university.country (id, name) VALUES ('1', 'Srbija');
INSERT INTO university.country (id, name) VALUES ('2', 'Sjedinjene Američke Države');

INSERT INTO `university`.`city` (`id`, `name`, `country_id`) VALUES ('1', 'Beograd', '1');
INSERT INTO `university`.`city` (`id`, `name`, `country_id`) VALUES ('2', 'Standford, Kalifornija', '2');

INSERT INTO `university`.`address` (`id`, `number`, `street`, `city_id`) VALUES ('1', '1', 'Studentski trg', '1');
INSERT INTO `university`.`address` (`id`, `number`, `street`, `city_id`) VALUES ('2', '154', 'Jove Ilica', '1');
INSERT INTO `university`.`address` (`id`, `number`, `street`, `city_id`) VALUES ('3', '16', 'Studentski trg', '1');
INSERT INTO `university`.`address` (`id`, `number`, `street`, `city_id`) VALUES ('4', '450', 'Serra Mall', '2');
INSERT INTO `university`.`address` (`id`, `number`, `street`, `city_id`) VALUES ('5', '291', 'Campus Drive', '2');
INSERT INTO `university`.`address` (`id`, `number`, `street`, `city_id`) VALUES ('6', '475', 'Via Ortega', '2');

INSERT INTO `university`.`university` (`id`, `date_of_establishment`, `email`, `name`, `phone`, `rector_id`, `address_id`) VALUES ('1', '2003-07-23', 'singidunum@singi.com', 'Univerzitet Singidunum', '555 987 6543', '1', '1');
INSERT INTO `university`.`university` (`id`, `date_of_establishment`, `email`, `name`, `phone`, `rector_id`, `address_id`) VALUES ('2', '1999-10-12', 'info@stanford.edu', 'Stanford Univerzitet', '650 723 2300', '2', '4');


INSERT INTO `university`.`faculty` (`id`, `dean_id`, `name`, `address_id`, `university_id`) VALUES ('1', '1', 'Fakultet organizacionih nauka', '2', '1');
INSERT INTO `university`.`faculty` (`id`, `dean_id`, `name`, `address_id`, `university_id`) VALUES ('2', '2', 'Matematički fakultet', '3', '1');
INSERT INTO `university`.`faculty` (`id`, `dean_id`, `name`, `address_id`, `university_id`) VALUES ('3', '3', 'Stanford School of Medicine', '5', '2');
INSERT INTO `university`.`faculty` (`id`, `dean_id`, `name`, `address_id`, `university_id`) VALUES ('4', '4', 'Stanford School of Engineering', '6', '2');


INSERT INTO `university`.`study_program` (`id`, `coordinator_id`, `name`, `faculty_id`) VALUES ('1', '1', 'Softversko Inzenjerstvo', '1');
INSERT INTO `university`.`study_program` (`id`, `coordinator_id`, `name`, `faculty_id`) VALUES ('2', '2', 'Matematika', '2');
INSERT INTO `university`.`study_program` (`id`, `coordinator_id`, `name`, `faculty_id`) VALUES ('3', '3', 'Bio Engineering', '3');
INSERT INTO `university`.`study_program` (`id`, `coordinator_id`, `name`, `faculty_id`) VALUES ('4', '4', 'Electro Engineering', '4');


INSERT INTO `university`.`notification` (`date_of_notification`, `description`, `title`,`faculty_id`) VALUES ('2023-06-23', 'Rok za prijavu ispita za letnji ispitni rok je 30. juna. Molimo sve studente da se blagovremeno prijave preko studentskog informacionog sistema.', 'Rok za prijavu ispita za letnji ispitni rok','1');
INSERT INTO `university`.`notification` (`date_of_notification`, `description`, `title`,`faculty_id`) VALUES ('2023-06-20', 'Praktična nastava iz predmeta Organizacija preduzeća održaće se u sledećim terminima: 25. juna, 2. jula i 9. jula od 14:00 do 17:00 časova u računarskoj učionici 305.', 'Praktična nastava iz predmeta Organizacija preduzeća - Termini','1');

INSERT INTO `university`.`notification` (`date_of_notification`, `description`, `title`,`faculty_id`) VALUES ('2023-06-23', 'Obaveštavamo studente da će se predavanje iz Linearne algebre održati u drugoj učionici u petak, 25. juna.', 'Izmena u rasporedu predavanja','2');
INSERT INTO `university`.`notification` (`date_of_notification`, `description`, `title`,`faculty_id`) VALUES ('2023-06-22', 'Podsećamo studente da je rok za prijavu ispita iz Matematičke analize 1 produžen do kraja nedelje.', 'Produžen rok za prijavu ispita','2');

INSERT INTO `university`.`notification` (`date_of_notification`, `description`, `title`,`faculty_id`) VALUES ('2023-06-23', 'Otvoren je novi program istraživanja na Stanford School of Medicine.', 'Novi istraživački program','3');
INSERT INTO `university`.`notification` (`date_of_notification`, `description`, `title`,`faculty_id`) VALUES ('2023-06-22', 'Prijave za letnju praksu na Stanford School of Medicine su otvorene.', 'Letnja praksa prijave','3');

INSERT INTO `university`.`notification` (`date_of_notification`, `description`, `title`,`faculty_id`) VALUES ('2023-06-21', 'Obaveštavamo sve studente da će se održati predavanje na temu novih tehnologija u inženjeringu. Molimo sve zainteresovane da prisustvuju.', 'Predavanje o novim tehnologijama','4');
INSERT INTO `university`.`notification` (`date_of_notification`, `description`, `title`,`faculty_id`) VALUES ('2023-06-22', 'Obaveštavamo sve studente da će se radionica o robotici održati u laboratoriji 305. Prijave su otvorene.', 'Radionica o robotici','4');



