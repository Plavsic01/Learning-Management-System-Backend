INSERT INTO `university`.`country` (`id`, `name`) VALUES ('1', 'Srbija');
INSERT INTO `university`.`country` (`id`, `name`) VALUES ('2', 'Hrvatska');

INSERT INTO `university`.`city` (`id`, `name`, `country_id`) VALUES ('1', 'Novi Sad', '1');
INSERT INTO `university`.`city` (`id`, `name`, `country_id`) VALUES ('2', 'Vukovar', '2');
INSERT INTO `university`.`city` (`id`, `name`, `country_id`) VALUES ('3', 'Beograd', '1');

INSERT INTO `university`.`address` (`id`, `number`, `street`, `city_id`) VALUES ('1', '12', 'Backa', '1');
INSERT INTO `university`.`address` (`id`, `number`, `street`, `city_id`) VALUES ('2', '50', 'Kralja Petra Kresimira IV', '2');
INSERT INTO `university`.`address` (`id`, `number`, `street`, `city_id`) VALUES ('3', '32', 'Danijelova', '3');
INSERT INTO `university`.`address` (`id`, `number`, `street`, `city_id`) VALUES ('4', '20', 'Bulevar Mihajla Pupina', '1');

INSERT INTO `university`.`university` (`id`, `date_of_establishment`, `email`, `name`, `phone`, `rector_id`, `address_id`) VALUES ('1', '2005-10-12', 'singi@singi.com', 'Univerzitet Singidunum', '092-233/233', '1', '3');

INSERT INTO `university`.`faculty` (`id`, `dean_id`, `name`, `address_id`, `university_id`) VALUES ('1', '1', 'Centar Novi Sad', '4', '1');
INSERT INTO `university`.`faculty` (`id`, `dean_id`, `name`, `address_id`, `university_id`) VALUES ('2', '2', 'Centar Beograd', '3', '1');

INSERT INTO `university`.`study_program` (`id`, `coordinator_id`, `name`, `faculty_id`) VALUES ('1', '1', 'Softversko Inzenjerstvo', '1');
INSERT INTO `university`.`study_program` (`id`, `coordinator_id`, `name`, `faculty_id`) VALUES ('2', '2', 'Informaciono Inzenjerstvo', '2');










