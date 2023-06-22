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










