INSERT INTO `users`.`privileges` (`role_name`) VALUES ('ROLE_ADMIN');
INSERT INTO `users`.`privileges` (`role_name`) VALUES ('ROLE_TEACHER');
INSERT INTO `users`.`privileges` (`role_name`) VALUES ('ROLE_STUDENT');
INSERT INTO `users`.`privileges` (`role_name`) VALUES ('ROLE_STUDENT_ADMINISTRATION');

INSERT INTO `users`.`user` (`dob`, `email`, `first_name`, `jmbg`, `last_name`, `password`, `phone`, `username`) VALUES ('2001-03-15', 'andrej@gmail.com', 'Andrej', '1234567890123', 'Plavsic', '$2a$09$KmjyzEsBvKVeY.NHgPYKveiaanoBj/ysVZK8x0nxLeMRbXDx20tte', '065 213 1234', 'admin');
INSERT INTO `users`.`user` (`dob`, `email`, `first_name`, `jmbg`, `last_name`, `password`, `phone`, `username`) VALUES ('1978-05-15', 'milica@gmail.com', 'Milica', '2282736436382', 'Milicevic', '$2a$12$K9NkLfQP9BtwUcMa7lquHe/wHd9vXrq4KmQ07PrOk/6fJIbTiaItu', '065 213 1111', 'sluzbamilica');
INSERT INTO `users`.`user` (`dob`, `email`, `first_name`, `jmbg`, `last_name`, `password`, `phone`, `username`) VALUES ('2002-10-21', 'marko.petrovic@gmail.com', 'Marko', '1234567891231', 'Petrovic', '$2a$12$y701lMh3U1dc9B2X5Nx6s.L/EfC/yYe8lfWFf/ooxjxRyNkHoffEm', '555 123 4567', 'markopetrovic01');
INSERT INTO `users`.`user` (`dob`, `email`, `first_name`, `jmbg`, `last_name`, `password`, `phone`, `username`) VALUES ('1985-08-17', 'ana.jovanovic@gmail.com', 'Ana', '6548567891231', 'Jovanovic', '$2a$12$OkkJM12RviDu9bqpZ/pll.PWJ3sKxlJEEVzIg4Snzvap1Z7XFNaAu', '091 198 3854', 'anajovanovic85');
INSERT INTO `users`.`user` (`dob`, `email`, `first_name`, `jmbg`, `last_name`, `password`, `phone`, `username`) VALUES ('1992-05-05', 'stefan.nikolic@gmail.com', 'Stefan', '6548567896634', 'Nikolic', '$2a$12$gyFqEVEFWVko/acbULHh9eaiva4spDR5vCeU1d9KyniaYtd7TppBa', '553 333 5552', 'stefannikolic92');
INSERT INTO `users`.`user` (`dob`, `email`, `first_name`, `jmbg`, `last_name`, `password`, `phone`, `username`) VALUES ('2000-04-10', 'milica.djordjevic@gmail.com', 'Milica', '6548567890098', 'Djordjevic', '$2a$12$njCIuQsPqX3YoZ3T/tbO5Ouh7n7e55ol3KN2RTTqIJugBKVEb1EcC', '093 293 1322', 'milicadjordjevic00');

INSERT INTO `users`.`user` (`dob`, `email`, `first_name`, `jmbg`, `last_name`, `password`, `phone`, `username`) VALUES ('1993-01-16', 'aleksandar.simic@example.com', 'Aleksandar', '1234567431823', 'Simic', '$2a$12$h4jarxw1tbpvsHRPNNuYUe4ABm1ryVPyhtK8dLpjwcQN6PlshwuVW', '555 765 4321', 'aleksandarsimic93');
INSERT INTO `users`.`user` (`dob`, `email`, `first_name`, `jmbg`, `last_name`, `password`, `phone`, `username`) VALUES ('1989-03-14', 'tamara.lukic@example.com', 'Tamara', '1234567432853', 'Lukic', '$2a$12$zgqqNYVMll8hi5D0Frqv6uC1uWfZNYi765q3uriDHPcsIK1pUFUXa', '555 234 5678', 'tamaralukic89');
INSERT INTO `users`.`user` (`dob`, `email`, `first_name`, `jmbg`, `last_name`, `password`, `phone`, `username`) VALUES ('1991-05-27', 'marko.djuric@example.com', 'Marko', '1221567431865', 'Djuric', '$2a$12$uNxNMzaYIY1O1jH60QOL1uXv4Ortr0b9cV8EP.vTXzBWuI9rUwnjW', '555 987 6543', 'markodjuric91');
INSERT INTO `users`.`user` (`dob`, `email`, `first_name`, `jmbg`, `last_name`, `password`, `phone`, `username`) VALUES ('1998-08-11', 'jovana.simic@example.com', 'Jovana', '5735567431821', 'Simic', '$2a$12$kSPAJKjZcP4r5CLjIHke9uBXfqcU1lR6DBlPoNJKmmp6.jt6QjRFi', '555 456 7890', 'jovanasimic98');
INSERT INTO `users`.`user` (`dob`, `email`, `first_name`, `jmbg`, `last_name`, `password`, `phone`, `username`) VALUES ('1997-08-05', 'stefan.djordjevic@example.com', 'Stefan', '9234557631825', 'Djordjevic', '$2a$12$hhzCNE49LVlNB.NBTEl/hepIIi7QwmfvSSWyPinZNA1naGFnScQCS', ' 555 765 4321', 'stefandjordjevic97');

INSERT INTO `users`.`user_privileges` (`privileges_id`, `user_id`) VALUES ('1', '1');
INSERT INTO `users`.`user_privileges` (`privileges_id`, `user_id`) VALUES ('4', '2');
INSERT INTO `users`.`user_privileges` (`privileges_id`, `user_id`) VALUES ('3', '3');
INSERT INTO `users`.`user_privileges` (`privileges_id`, `user_id`) VALUES ('3', '4');
INSERT INTO `users`.`user_privileges` (`privileges_id`, `user_id`) VALUES ('3', '5');
INSERT INTO `users`.`user_privileges` (`privileges_id`, `user_id`) VALUES ('3', '6');
INSERT INTO `users`.`user_privileges` (`privileges_id`, `user_id`) VALUES ('3', '7');
INSERT INTO `users`.`user_privileges` (`privileges_id`, `user_id`) VALUES ('3', '8');
INSERT INTO `users`.`user_privileges` (`privileges_id`, `user_id`) VALUES ('3', '9');
INSERT INTO `users`.`user_privileges` (`privileges_id`, `user_id`) VALUES ('3', '10');
INSERT INTO `users`.`user_privileges` (`privileges_id`, `user_id`) VALUES ('3', '11');

INSERT INTO `users`.`student` (`user_id`) VALUES ('3');
INSERT INTO `users`.`student` (`user_id`) VALUES ('4');
INSERT INTO `users`.`student` (`user_id`) VALUES ('5');
INSERT INTO `users`.`student` (`user_id`) VALUES ('6');
INSERT INTO `users`.`student` (`user_id`) VALUES ('7');
INSERT INTO `users`.`student` (`user_id`) VALUES ('8');
INSERT INTO `users`.`student` (`user_id`) VALUES ('9');
INSERT INTO `users`.`student` (`user_id`) VALUES ('10');
INSERT INTO `users`.`student` (`user_id`) VALUES ('11');

INSERT INTO `users`.`student_year` (`date_of_enrollment`, `index_no`, `year_of_study_id`, `student_id`) VALUES ('2020-09-10', '2020/270068', '1', '1');
INSERT INTO `users`.`student_year` (`date_of_enrollment`, `index_no`, `year_of_study_id`, `student_id`) VALUES ('2020-09-12', '2020/271144', '3', '2');
INSERT INTO `users`.`student_year` (`date_of_enrollment`, `index_no`, `year_of_study_id`, `student_id`) VALUES ('2021-09-13', '2021/241234', '4', '3');
INSERT INTO `users`.`student_year` (`date_of_enrollment`, `index_no`, `year_of_study_id`, `student_id`) VALUES ('2021-09-15', '2021/232222', '6', '4');
INSERT INTO `users`.`student_year` (`date_of_enrollment`, `index_no`, `year_of_study_id`, `student_id`) VALUES ('2020-09-13', '2020/245832', '7', '5');
INSERT INTO `users`.`student_year` (`date_of_enrollment`, `index_no`, `year_of_study_id`, `student_id`) VALUES ('2020-09-09', '2020/193842', '10', '6');
INSERT INTO `users`.`student_year` (`date_of_enrollment`, `index_no`, `year_of_study_id`, `student_id`) VALUES ('2020-09-10', '2020/204585', '8', '7');
INSERT INTO `users`.`student_year` (`date_of_enrollment`, `index_no`, `year_of_study_id`, `student_id`) VALUES ('2020-09-11', '2020/128283', '13', '8');
INSERT INTO `users`.`student_year` (`date_of_enrollment`, `index_no`, `year_of_study_id`, `student_id`) VALUES ('2020-09-15', '2020/494853', '12', '9');

