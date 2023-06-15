INSERT INTO `users`.`privileges` (`role_name`) VALUES ('ROLE_ADMIN');
INSERT INTO `users`.`privileges` (`role_name`) VALUES ('ROLE_TEACHER');
INSERT INTO `users`.`privileges` (`role_name`) VALUES ('ROLE_STUDENT');
INSERT INTO `users`.`privileges` (`role_name`) VALUES ('ROLE_STUDENT_SERVICE');

INSERT INTO `users`.`user` (`dob`, `email`, `first_name`, `jmbg`, `last_name`, `password`, `phone`, `username`) VALUES ('2001-03-15', 'andrej@gmail.com', 'Andrej', '210239123', 'Plavsic', '$2a$09$KmjyzEsBvKVeY.NHgPYKveiaanoBj/ysVZK8x0nxLeMRbXDx20tte', '091/213-123', 'admin');
INSERT INTO `users`.`user` (`dob`, `email`, `first_name`, `jmbg`, `last_name`, `password`, `phone`, `username`) VALUES ('2001-10-21', 'vanja@gmail.com', 'Vanja', '210239100', 'Jovicic', '$2a$09$7OXI4S9z619cuKIq359AvePCa.SzJINprbQ7/vpFg3aKgllFs8/Lq', '091/010-100', 'student1');
INSERT INTO `users`.`user` (`dob`, `email`, `first_name`, `jmbg`, `last_name`, `password`, `phone`, `username`) VALUES ('2004-08-17', 'igor@gmail.com', 'Igor', '112030291', 'Igorovic', '$2a$09$Q/OyeJYoWo.kuEijGTfuEOMhorJGNYwVg94xAJ2Z2xERnG01U09bi', '091/198-385', 'student2');
INSERT INTO `users`.`user` (`dob`, `email`, `first_name`, `jmbg`, `last_name`, `password`, `phone`, `username`) VALUES ('2004-09-20', 'milica@gmail.com', 'Milica', '109282013', 'Milic', '$2a$09$dFNdgFHD3G3ZZLMT0Y20YuO/1xKScJSfDF3nQZNt50qPRih8TfIjW', '091/333-555', 'teacher1');
INSERT INTO `users`.`user` (`dob`, `email`, `first_name`, `jmbg`, `last_name`, `password`, `phone`, `username`) VALUES ('2003-04-10', 'jovana@gmail.com', 'Jovana', '222232132', 'Jovic', '$2a$09$cCli5EQcE4JKZPGiGaoF2.S7RFngMWM7zq01Ld46ZZZtIMUpkLOTu', '092/293-132', 'teacher2');

INSERT INTO `users`.`user_privileges` (`privileges_id`, `user_id`) VALUES ('1', '1');
INSERT INTO `users`.`user_privileges` (`privileges_id`, `user_id`) VALUES ('3', '2');
INSERT INTO `users`.`user_privileges` (`privileges_id`, `user_id`) VALUES ('3', '3');
INSERT INTO `users`.`user_privileges` (`privileges_id`, `user_id`) VALUES ('2', '4');
INSERT INTO `users`.`user_privileges` (`privileges_id`, `user_id`) VALUES ('2', '5');

INSERT INTO `users`.`student` (`user_id`) VALUES ('2');
INSERT INTO `users`.`student` (`user_id`) VALUES ('3');

INSERT INTO `users`.`student_year` (`date_of_enrollment`, `index_no`, `year_of_study_id`, `student_id`) VALUES ('2019-09-28', '2020/270068', '1', '1');
INSERT INTO `users`.`student_year` (`date_of_enrollment`, `index_no`, `year_of_study_id`, `student_id`) VALUES ('2020-09-28', '2020/272518', '2', '2');
INSERT INTO `users`.`student_year` (`id`, `date_of_enrollment`, `index_no`, `year_of_study_id`, `student_id`) VALUES ('3', '2222-02-22', '2021/222333', '2', '1');


