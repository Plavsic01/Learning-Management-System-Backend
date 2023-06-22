INSERT INTO `subjects`.`year_of_study` (`study_program_id`, `year`) VALUES ('1', '1');
INSERT INTO `subjects`.`year_of_study` (`study_program_id`, `year`) VALUES ('1', '2');
INSERT INTO `subjects`.`year_of_study` (`study_program_id`, `year`) VALUES ('1', '3');
INSERT INTO `subjects`.`year_of_study` (`study_program_id`, `year`) VALUES ('1', '4');

INSERT INTO `subjects`.`year_of_study` (`study_program_id`, `year`) VALUES ('2', '1');
INSERT INTO `subjects`.`year_of_study` (`study_program_id`, `year`) VALUES ('2', '2');
INSERT INTO `subjects`.`year_of_study` (`study_program_id`, `year`) VALUES ('2', '3');

INSERT INTO `subjects`.`year_of_study` (`study_program_id`, `year`) VALUES ('3', '1');
INSERT INTO `subjects`.`year_of_study` (`study_program_id`, `year`) VALUES ('3', '2');
INSERT INTO `subjects`.`year_of_study` (`study_program_id`, `year`) VALUES ('3', '3');

INSERT INTO `subjects`.`year_of_study` (`study_program_id`, `year`) VALUES ('4', '1');
INSERT INTO `subjects`.`year_of_study` (`study_program_id`, `year`) VALUES ('4', '2');
INSERT INTO `subjects`.`year_of_study` (`study_program_id`, `year`) VALUES ('4', '3');



--Softversko Inzenjerstvo 1. godina

INSERT INTO subjects.subject (ects, mandatory_subject, name, number_of_lectures, number_of_practical_lectures, number_of_semesters, syllabus, year_of_study_id) VALUES ('6', '1', 'Uvod u programiranje', '30', '30', '1', 'Osnovni koncepti programiranja, struktura podataka, algoritmi.', '1');
INSERT INTO subjects.subject (ects, mandatory_subject, name, number_of_lectures, number_of_practical_lectures, number_of_semesters, syllabus, year_of_study_id) VALUES ('5', '1', 'Matematika za programere', '30', '30', '2', 'Osnove matematike potrebne za softversko inženjerstvo, logika, diskretne strukture.', '1');
INSERT INTO subjects.subject (ects, mandatory_subject, name, number_of_lectures, number_of_practical_lectures, number_of_semesters, syllabus, year_of_study_id) VALUES ('8', '1', 'Osnove baza podataka', '35', '35', '1', 'Koncepti baza podataka, SQL, modelovanje podataka.', '1');
INSERT INTO subjects.subject (ects, mandatory_subject, name, number_of_lectures, number_of_practical_lectures, number_of_semesters, syllabus, year_of_study_id) VALUES ('6', '1', 'Web programiranje', '40', '35', '2', 'Front-end i back-end web tehnologije, HTML, CSS, JavaScript, server-side programiranje.', '1');

--Softversko Inzenjerstvo 2. godina

INSERT INTO subjects.subject (ects, mandatory_subject, name, number_of_lectures, number_of_practical_lectures, number_of_semesters, syllabus, year_of_study_id) VALUES ('8', '1', 'Objektno orijentisano programiranje', '30', '30', '1', 'OOP koncepti, klasa, objekti, nasleđivanje, polimorfizam.', '2');
INSERT INTO subjects.subject (ects, mandatory_subject, name, number_of_lectures, number_of_practical_lectures, number_of_semesters, syllabus, year_of_study_id) VALUES ('6', '1', 'Algoritmi i strukture podataka', '30', '30', '2', 'Efikasnost algoritama, linearna i nelinearna struktura podataka.', '2');
INSERT INTO subjects.subject (ects, mandatory_subject, name, number_of_lectures, number_of_practical_lectures, number_of_semesters, syllabus, year_of_study_id) VALUES ('8', '1', 'Softversko inženjerstvo', '30', '30', '1', 'Metodologije razvoja softvera, životni ciklus projekta, upravljanje zahtevima, testiranje, održavanje softvera.', '2');
INSERT INTO subjects.subject (ects, mandatory_subject, name, number_of_lectures, number_of_practical_lectures, number_of_semesters, syllabus, year_of_study_id) VALUES ('6', '1', 'Upravljanje projektima', '30', '30', '2', 'Planiranje, organizacija i vođenje projekata, upravljanje resursima, rizicima i timovima.', '2');

--Softversko Inzenjerstvo 3. godina

INSERT INTO `subjects`.`subject` (`ects`, `mandatory_subject`, `name`, `number_of_lectures`, `number_of_practical_lectures`, `number_of_semesters`, `syllabus`, `year_of_study_id`) VALUES ('8', '1', 'Napredno Programiranje', '30', '30', '1', 'Paralelno i distribuirano programiranje, programiranje mrežnih aplikacija, upravljanje memorijom.', '3');
INSERT INTO `subjects`.`subject` (`ects`, `mandatory_subject`, `name`, `number_of_lectures`, `number_of_practical_lectures`, `number_of_semesters`, `syllabus`, `year_of_study_id`) VALUES ('6', '1', 'Baze Podataka', '30', '35', '1', 'Napredni koncepti baza podataka, upravljanje transakcijama, optimizacija upita.', '3');
INSERT INTO `subjects`.`subject` (`ects`, `mandatory_subject`, `name`, `number_of_lectures`, `number_of_practical_lectures`, `number_of_semesters`, `syllabus`, `year_of_study_id`) VALUES ('8', '1', 'Kompajleri', '35', '35', '2', ' Osnovni koncepti kompajliranja, analiza i generisanje koda, optimizacija.', '3');
INSERT INTO `subjects`.`subject` (`ects`, `mandatory_subject`, `name`, `number_of_lectures`, `number_of_practical_lectures`, `number_of_semesters`, `syllabus`, `year_of_study_id`) VALUES ('6', '1', 'Interakcija Čovek - Računar', '40', '45', '2', 'Principi i metode dizajna korisničkog interfejsa, evaluacija korisničkog iskustva.', '3');

--Softversko Inzenjerstvo 4. godina

INSERT INTO `subjects`.`subject` (`ects`, `mandatory_subject`, `name`, `number_of_lectures`, `number_of_practical_lectures`, `number_of_semesters`, `syllabus`, `year_of_study_id`) VALUES ('8','1', 'Softversko testiranje', '30', '30', '2', 'Metodologije testiranja, automatizacija testiranja, upravljanje greškama.','4');
INSERT INTO `subjects`.`subject` (`ects`, `mandatory_subject`, `name`, `number_of_lectures`, `number_of_practical_lectures`, `number_of_semesters`, `syllabus`, `year_of_study_id`) VALUES ('6','1', 'Sigurnost softvera', '30', '30', '1', 'Osnovni principi sigurnosti softvera, zaštita podataka, upravljanje bezbednošću.','4');
INSERT INTO `subjects`.`subject` (`ects`, `mandatory_subject`, `name`, `number_of_lectures`, `number_of_practical_lectures`, `number_of_semesters`, `syllabus`, `year_of_study_id`) VALUES ('8','1', 'Softversko projektovanje', '30', '30', '1', 'Principi dizajna softvera, arhitekturalni obrasci, dizajn interfejsa.','4');
INSERT INTO `subjects`.`subject` (`ects`, `mandatory_subject`, `name`, `number_of_lectures`, `number_of_practical_lectures`, `number_of_semesters`, `syllabus`, `year_of_study_id`) VALUES ('6','1','Softversko održavanje i evolucija', '40', '35', '1', 'Proces održavanja softvera, modifikacija i nadogradnja, refaktorisanje.','4');

--Matematika 1. godina

INSERT INTO `subjects`.`subject` (`ects`, `mandatory_subject`, `name`, `number_of_lectures`, `number_of_practical_lectures`, `number_of_semesters`, `syllabus`, `year_of_study_id`) VALUES ('6','1','Matematika 1', '45', '30', '1', 'Uvod u matematiku.','5');
INSERT INTO `subjects`.`subject` (`ects`, `mandatory_subject`, `name`, `number_of_lectures`, `number_of_practical_lectures`, `number_of_semesters`, `syllabus`, `year_of_study_id`) VALUES ('8','1','Analiza 1', '45', '30', '1', 'Osnovni pojmovi diferencijalnog i integralnog računa, kontinuitet, derivacija, integral.','5');
INSERT INTO `subjects`.`subject` (`ects`, `mandatory_subject`, `name`, `number_of_lectures`, `number_of_practical_lectures`, `number_of_semesters`, `syllabus`, `year_of_study_id`) VALUES ('8','0','Linearna algebra', '45', '30', '1', 'Vektori, matrice, linearni prostori, determinante, linearni operatori.','5');
INSERT INTO `subjects`.`subject` (`ects`, `mandatory_subject`, `name`, `number_of_lectures`, `number_of_practical_lectures`, `number_of_semesters`, `syllabus`, `year_of_study_id`) VALUES  ('6','1','Diskretna matematika', '45', '30', '1', 'Osnovni pojmovi teorije grafova, kombinatorika, matematička logika.','5');

--Matematika 2. godina

 INSERT INTO `subjects`.`subject` (`ects`, `mandatory_subject`, `name`, `number_of_lectures`, `number_of_practical_lectures`, `number_of_semesters`, `syllabus`, `year_of_study_id`) VALUES ('6','0','Matematička logika', '45', '30', '1', 'Osnovni pojmovi matematičke logike, sintaksa i semantika, matematički dokazi.','6');
 INSERT INTO `subjects`.`subject` (`ects`, `mandatory_subject`, `name`, `number_of_lectures`, `number_of_practical_lectures`, `number_of_semesters`, `syllabus`, `year_of_study_id`) VALUES ('6','1','Analiza 2', '45', '30', '1', 'Integrali više promenljivih, nizovi funkcija, redovi, Fourierova analiza.','6');
 INSERT INTO `subjects`.`subject` (`ects`, `mandatory_subject`, `name`, `number_of_lectures`, `number_of_practical_lectures`, `number_of_semesters`, `syllabus`, `year_of_study_id`) VALUES  ('8','1', 'Algebarske strukture', '45', '40', '1', 'Grupoidi, grupe, prstene, polja, linearni prostori.', '6');
 INSERT INTO `subjects`.`subject` (`ects`, `mandatory_subject`, `name`, `number_of_lectures`, `number_of_practical_lectures`, `number_of_semesters`, `syllabus`, `year_of_study_id`) VALUES  ('6','0','Teorija brojeva', '45', '30', '1', 'Deljivost, prosti brojevi, kongruencije, Diofantove jednačine.', '6');

--Matematika 3. godina

 INSERT INTO `subjects`.`subject` (`ects`, `mandatory_subject`, `name`, `number_of_lectures`, `number_of_practical_lectures`, `number_of_semesters`, `syllabus`, `year_of_study_id`) VALUES  ('6','1', 'Diferencijalne jednačine', '45', '30', '1', 'Osnovne metode rešavanja diferencijal','7');
 INSERT INTO `subjects`.`subject` (`ects`, `mandatory_subject`, `name`, `number_of_lectures`, `number_of_practical_lectures`, `number_of_semesters`, `syllabus`, `year_of_study_id`) VALUES  ('6','1', 'Matematička analiza','45','30', '1', 'Riemannov integral, Fourierove transformacije, merljive funkcije.','7');
 INSERT INTO `subjects`.`subject` (`ects`, `mandatory_subject`, `name`, `number_of_lectures`, `number_of_practical_lectures`, `number_of_semesters`, `syllabus`, `year_of_study_id`) VALUES  ('8','1', 'Topologija', '45', '30', '1', 'Osnovni pojmovi topologije, otvoreni i zatvoreni skupovi, kontinuitet, kompaktnost.', '7');
 INSERT INTO `subjects`.`subject` (`ects`, `mandatory_subject`, `name`, `number_of_lectures`, `number_of_practical_lectures`, `number_of_semesters`, `syllabus`, `year_of_study_id`) VALUES  ('6','1', 'Verovatnoća i statistika', '45', '30', '1', 'Osnovni pojmovi verovatnoće, slučajne promenljive, statistička analiza podataka.', '7');

--Bio Inzenjering 1. godina

INSERT INTO `subjects`.`subject` (`ects`, `mandatory_subject`, `name`, `number_of_lectures`, `number_of_practical_lectures`, `number_of_semesters`, `syllabus`, `year_of_study_id`) VALUES  ('6','1','Uvod u Bio Inženjering', '30', '30', '1', 'Osnovni principi bioinženjeringa, upotreba bioloških sistema u inženjeringu, etički i pravni aspekti.','8');
INSERT INTO `subjects`.`subject` (`ects`, `mandatory_subject`, `name`, `number_of_lectures`, `number_of_practical_lectures`, `number_of_semesters`, `syllabus`, `year_of_study_id`) VALUES  ('6','1','Osnove Molekularne Biologije', '30', '30', '1', 'Struktura i funkcija biomolekula, genska ekspresija, molekularne tehnike i metode.','8');
INSERT INTO `subjects`.`subject` (`ects`, `mandatory_subject`, `name`, `number_of_lectures`, `number_of_practical_lectures`, `number_of_semesters`, `syllabus`, `year_of_study_id`) VALUES  ('6','1','Bio Informatika', '30', '30', '1', ' Algoritmi za analizu bioloških sekvenci, baze podataka, analiza genoma.','8');
INSERT INTO `subjects`.`subject` (`ects`, `mandatory_subject`, `name`, `number_of_lectures`, `number_of_practical_lectures`, `number_of_semesters`, `syllabus`, `year_of_study_id`) VALUES  ('6','0','Biomedicinska instrumentacija', '30', '30', '1', 'Osnove medicinskih instrumenata, senzori, merenja u biomedicinskom inženjeringu.','8');

--Bio Inzenjering 2. godina

INSERT INTO `subjects`.`subject` (`ects`, `mandatory_subject`, `name`, `number_of_lectures`, `number_of_practical_lectures`, `number_of_semesters`, `syllabus`, `year_of_study_id`) VALUES  ('6','1','Bio Materijali', '30', '30', '1', 'Osnove biomaterijala, svojstva biomaterijala, aplikacije u medicini i bioinženjeringu.','9');
INSERT INTO `subjects`.`subject` (`ects`, `mandatory_subject`, `name`, `number_of_lectures`, `number_of_practical_lectures`, `number_of_semesters`, `syllabus`, `year_of_study_id`) VALUES  ('8','1','Medicinska elektronika', '30', '30', '1', 'Osnove elektronike, primene elektronike u medicini, medicinski instrumenti.','9');
INSERT INTO `subjects`.`subject` (`ects`, `mandatory_subject`, `name`, `number_of_lectures`, `number_of_practical_lectures`, `number_of_semesters`, `syllabus`, `year_of_study_id`) VALUES ('6','1', 'Bio Mehanika', '30','30', '1', 'Mekanika tela, biomehanika tkiva i organa, modeliranje bioloških sistema.', '9');
INSERT INTO `subjects`.`subject` (`ects`, `mandatory_subject`, `name`, `number_of_lectures`, `number_of_practical_lectures`, `number_of_semesters`, `syllabus`, `year_of_study_id`) VALUES ('6','1', 'Biološki Sistemi I Signali', '30', '30', '1', 'Osnove fiziologije, bioelektrični signali, obrada bioloških signala.', '9');

--Bio Inzenjering 3. godina

INSERT INTO `subjects`.`subject` (`ects`, `mandatory_subject`, `name`, `number_of_lectures`, `number_of_practical_lectures`, `number_of_semesters`, `syllabus`, `year_of_study_id`) VALUES ('8','1', 'Bio Tehnologija', '30', '30', '1', 'Osnove biotehnologije, manipulacija genima, biomedicinska primena biotehnologije.', '10');
INSERT INTO `subjects`.`subject` (`ects`, `mandatory_subject`, `name`, `number_of_lectures`, `number_of_practical_lectures`, `number_of_semesters`, `syllabus`, `year_of_study_id`) VALUES ('6','1', 'Medicinska Slika', '30', '30', '1', 'Vrste medicinskih slika, tehnike snimanja, analiza medicinskih slika.', '10');
INSERT INTO `subjects`.`subject` (`ects`, `mandatory_subject`, `name`, `number_of_lectures`, `number_of_practical_lectures`, `number_of_semesters`, `syllabus`, `year_of_study_id`) VALUES ('8','1', 'Bio Robotika', '30', '30', '1', 'Osnove robotike, primene robotike u biologiji i medicini, bioinspirisani roboti.', '10');
INSERT INTO `subjects`.`subject` (`ects`, `mandatory_subject`, `name`, `number_of_lectures`, `number_of_practical_lectures`, `number_of_semesters`, `syllabus`, `year_of_study_id`) VALUES ('6','1', 'Regulacija Genetskog Izraza', '30', '30', '1', 'Molekularni mehanizmi regulacije genetskog izraza, transkripcijski faktori, epigenetika.', '10');

-- Osnove Elektrotehnike 1.godina

INSERT INTO `subjects`.`subject` (`ects`, `mandatory_subject`, `name`, `number_of_lectures`, `number_of_practical_lectures`, `number_of_semesters`, `syllabus`, `year_of_study_id`) VALUES ('6','1','Osnove elektrotehnike', '45', '30', '1', 'Osnovni principi elektrotehnike, električne mreže, osnovni električni uređaji','11');
INSERT INTO `subjects`.`subject` (`ects`, `mandatory_subject`, `name`, `number_of_lectures`, `number_of_practical_lectures`, `number_of_semesters`, `syllabus`, `year_of_study_id`) VALUES ('6','0','Matematika za inženjere', '45', '30', '1', 'Matematičke metode i algoritmi primenjeni u inženjerskim disciplinama','11');
INSERT INTO `subjects`.`subject` (`ects`, `mandatory_subject`, `name`, `number_of_lectures`, `number_of_practical_lectures`, `number_of_semesters`, `syllabus`, `year_of_study_id`) VALUES ('8','1','Digitalna elektronika', '45', '30', '1', 'Osnove digitalnih sistema, logički sklopovi, digitalni brojači','11');
INSERT INTO `subjects`.`subject` (`ects`, `mandatory_subject`, `name`, `number_of_lectures`, `number_of_practical_lectures`, `number_of_semesters`, `syllabus`, `year_of_study_id`) VALUES ('8','1','Signali i sistemi', '45', '30', '1', 'Osnove analize signala i sistema, linearni i nelinearni sistemi, Fourierova transformacija','11');

-- Osnove Elektrotehnike 2.godina

INSERT INTO `subjects`.`subject` (`ects`, `mandatory_subject`, `name`, `number_of_lectures`, `number_of_practical_lectures`, `number_of_semesters`, `syllabus`, `year_of_study_id`) VALUES  ('8','1','Elektromagnetizam', '45', '30', '1', 'Osnove elektromagnetizma, Maxwellove jednačine, elektromagnetna polja','12');
INSERT INTO `subjects`.`subject` (`ects`, `mandatory_subject`, `name`, `number_of_lectures`, `number_of_practical_lectures`, `number_of_semesters`, `syllabus`, `year_of_study_id`) VALUES  ('6','1', 'Elektronički sklopovi', '45', '30', '1', 'Osnove elektroničkih sklopova, tranzistori, operacioni pojačavači','12');
INSERT INTO `subjects`.`subject` (`ects`, `mandatory_subject`, `name`, `number_of_lectures`, `number_of_practical_lectures`, `number_of_semesters`, `syllabus`, `year_of_study_id`) VALUES  ('8','1', 'Mikrokontroleri', '45', '30', '1', 'Arhitektura mikrokontrolera, programiranje mikrokontrolera, interfejsi', '12');
INSERT INTO `subjects`.`subject` (`ects`, `mandatory_subject`, `name`, `number_of_lectures`, `number_of_practical_lectures`, `number_of_semesters`, `syllabus`, `year_of_study_id`) VALUES  ('6','1', 'Analiza sistema', '45', '30', '1', 'Analiza linearnih sistema, stabilnost, Laplasova transformacija', '12');

-- Osnove Elektrotehnike 3.godina

INSERT INTO `subjects`.`subject` (`ects`, `mandatory_subject`, `name`, `number_of_lectures`, `number_of_practical_lectures`, `number_of_semesters`, `syllabus`, `year_of_study_id`) VALUES  ('6','1', 'Elektroenergetika', '45', '30', '1', 'Osnove elektroenergetike, energetski sistemi, prenos i distribucija električne energije', '13');
INSERT INTO `subjects`.`subject` (`ects`, `mandatory_subject`, `name`, `number_of_lectures`, `number_of_practical_lectures`, `number_of_semesters`, `syllabus`, `year_of_study_id`) VALUES  ('8','1', 'Elektronska merenja', '45', '30', '1', 'Osnove elektronskih mernih instrumenata, merenje električnih veličina, analogni i digitalni instrumenti', '13');
INSERT INTO `subjects`.`subject` (`ects`, `mandatory_subject`, `name`, `number_of_lectures`, `number_of_practical_lectures`, `number_of_semesters`, `syllabus`, `year_of_study_id`) VALUES  ('6','1', 'Električne mašine i pogoni', '45', '30', '1', 'Osnove električnih mašina, principi rada i primene, električni pogoni', '13');
INSERT INTO `subjects`.`subject` (`ects`, `mandatory_subject`, `name`, `number_of_lectures`, `number_of_practical_lectures`, `number_of_semesters`, `syllabus`, `year_of_study_id`) VALUES  ('8','1', 'Komunikacioni sistemi', '45', '30', '1', 'Osnove komunikacionih sistema, modulacije, šum u komunikacionim sistemima', '13');





