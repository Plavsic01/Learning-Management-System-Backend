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


INSERT INTO `subjects`.`notification` (`date_of_notification`, `description`, `title`,`subject_id`) VALUES ('2023-06-22', 'Danas je održano predavanje o osnovnim konceptima programiranja. Obavezno pročitajte dodatnu literaturu koja je dostupna na kursnoj platformi.', 'Važno obaveštenje - Uvod u programiranje','1');
INSERT INTO `subjects`.`notification` (`date_of_notification`, `description`, `title`,`subject_id`) VALUES ('2023-06-22', 'Održaće se dodatna vežba iz Matematike za programere u četvrtak u 16:00h. Svi studenti su pozvani!', 'Dodatna vežba iz Matematike za programere','2');
INSERT INTO `subjects`.`notification` (`date_of_notification`, `description`, `title`,`subject_id`) VALUES ('2023-06-22', 'Napomena: Raspored časova za predmet Osnove baze podataka je ažuriran.', 'Ažuriranje rasporeda časova','3');
INSERT INTO `subjects`.`notification` (`date_of_notification`, `description`, `title`,`subject_id`) VALUES ('2022-08-14', 'Ovo je obaveštenje za predmet Web programiranje. Molimo vas da pažljivo pratite nastavu i radite zadatke redovno.', 'Važno obaveštenje: Web programiranje','4');
INSERT INTO `subjects`.`notification` (`date_of_notification`, `description`, `title`,`subject_id`) VALUES ('2021-08-07', 'Izmišljena notifikacija za predmet Objektno orijentisano programiranje', 'Naslov notifikacije za predmet Objektno orijentisano programiranje','5');
INSERT INTO `subjects`.`notification` (`date_of_notification`, `description`, `title`,`subject_id`) VALUES ('2022-02-04', 'Izmišljeno obaveštenje za predmet Algoritmi i strukture podataka', 'Naslov obaveštenja za predmet Algoritmi i strukture podataka','6');
INSERT INTO `subjects`.`notification` (`date_of_notification`, `description`, `title`,`subject_id`) VALUES ('2023-06-22', 'Ovo je obaveštenje za predmet Softversko inženjerstvo. Molimo sve studente da se pripreme za predstojeći ispit.', 'Obaveštenje za predmet Softversko inženjerstvo','7');
INSERT INTO `subjects`.`notification` (`date_of_notification`, `description`, `title`,`subject_id`) VALUES ('2023-06-22', 'Ovo je obaveštenje za predmet "Upravljanje projektima". Molimo sve studente da pažljivo prate nastavu i redovno izvršavaju zadatke. Hvala na saradnji!', 'Obaveštenje za predmet "Upravljanje projektima"','8');
INSERT INTO `subjects`.`notification` (`date_of_notification`, `description`, `title`,`subject_id`) VALUES ('2022-04-21', 'Opis obaveštenja za predmet Napredno Programiranje', 'Napredno Programiranje','9');
INSERT INTO `subjects`.`notification` (`date_of_notification`, `description`, `title`,`subject_id`) VALUES ('2023-06-22', 'Ovde ide opis obaveštenja za predmet Baze Podataka.', 'Obaveštenje o predmetu Baze Podataka','10');
INSERT INTO `subjects`.`notification` (`date_of_notification`, `description`, `title`,`subject_id`) VALUES (CURRENT_DATE(), 'Ovo je obaveštenje za predmet Kompajleri.', 'Obaveštenje','11');
INSERT INTO `subjects`.`notification` (`date_of_notification`, `description`, `title`,`subject_id`) VALUES ('2023-06-22', 'Ovde ide opis obaveštenja za predmet Interakcija Čovek - Računar.', 'Obaveštenje o predmetu','12');
INSERT INTO `subjects`.`notification` (`date_of_notification`, `description`, `title`,`subject_id`) VALUES ('2023-06-20', 'Napomena: Testiranje performansi u okviru predmeta Softversko testiranje bit će održano u srijedu, 23. lipnja 2023. Molimo sve studente da se pripreme i pristupe testiranju na vrijeme.', 'Obavijest o testiranju performansi','13');
INSERT INTO `subjects`.`notification` (`date_of_notification`, `description`, `title`,`subject_id`) VALUES ('2023-06-22', 'Opis obaveštenja za predmet Sigurnost softvera koji ima maksimalno 255 karaktera.', 'Obaveštenje o predmetu Sigurnost softvera','14');
INSERT INTO `subjects`.`notification` (`date_of_notification`, `description`, `title`,`subject_id`) VALUES ('2023-06-20', 'Odgovaraćemo na pitanja vezana za Softversko projektovanje.', 'Pitanja i odgovori','15');
INSERT INTO `subjects`.`notification` (`date_of_notification`, `description`, `title`,`subject_id`) VALUES ('2023-06-20', 'Održat će se predavanje o Softverskom održavanju i evoluciji u četvrtak u 14:00 sati.', 'Predavanje o Softverskom održavanju','16');
INSERT INTO `subjects`.`notification` (`date_of_notification`, `description`, `title`,`subject_id`) VALUES ('2023-06-20', 'Izmišljena notifikacija vezano za predmet Matematika 1', 'Naslov notifikacije','17')
INSERT INTO `subjects`.`notification` (`date_of_notification`, `description`, `title`,`subject_id`) VALUES ('2023-06-20', 'Nova obavijest za predmet Analiza 1.', 'Obavijest o promjeni rasporeda predavanja','18');
INSERT INTO `subjects`.`notification` (`date_of_notification`, `description`, `title`,`subject_id`) VALUES ('2023-06-20', 'Napomena: Sutra će biti održana dodatna tutorijalna sesija za predmet Linearna algebra od 14:00 do 16:00. Molimo sve studente da prisustvuju.', 'Dodatna tutorijalna sesija - Linearna algebra','19');
INSERT INTO `subjects`.`notification` (`date_of_notification`, `description`, `title`,`subject_id`) VALUES ('2023-06-20', 'Održat će se dodatna vježba iz Diskretne matematike u četvrtak.', 'Dodatna vježba','20');
INSERT INTO `subjects`.`notification` (`date_of_notification`, `description`, `title`,`subject_id`) VALUES ('2023-06-20', 'Nastava iz Matematičke logike će biti održana u učionici 203 u 10:00 sati.', 'Obavijest o nastavi','21');

INSERT INTO `subjects`.`notification` (`date_of_notification`, `description`, `title`,`subject_id`) VALUES ('2023-06-22', 'Nova lekcija na raspolaganju - Pogledajte materijale za predmet Komunikacioni sistemi!', 'Nova lekcija dostupna','52');
INSERT INTO `subjects`.`notification` (`date_of_notification`, `description`, `title`,`subject_id`) VALUES ('2022-03-22', 'Obaveštenje: Promena rasporeda vežbi za narednu nedelju. Molimo sve studente da provere ažurirani raspored.', 'Izmenjen raspored vežbi','51');
INSERT INTO `subjects`.`notification` (`date_of_notification`, `description`, `title`,`subject_id`) VALUES ('2022-07-20', 'Nova laboratorijska vežba će se održati u četvrtak, 24. juna. Molimo sve studente da se pripreme i pristupe vežbi na vreme.', 'Obaveštenje o laboratorijskoj vežbi','50');
INSERT INTO `subjects`.`notification` (`date_of_notification`, `description`, `title`,`subject_id`) VALUES ('2022-06-18', 'Nova obavest o promeni rasporeda časova za predmet Elektroenergetika.', 'Promena rasporeda časova - Elektroenergetika','49');
INSERT INTO `subjects`.`notification` (`date_of_notification`, `description`, `title`,`subject_id`) VALUES ('2022-05-10', 'Obaveštenje: Izmenjen raspored časova za vežbe Analize sistema. Molimo vas da proverite ažurirane termine.', 'Izmena rasporeda vežbi','48');
INSERT INTO `subjects`.`notification` (`date_of_notification`, `description`, `title`,`subject_id`) VALUES ('2022-06-01', 'Notifikacija za predmet Mikrokontroleri: Obaveštavamo sve studente da će se održati dodatna vežba u petak, 25. juna u učionici 102. Molimo sve prisutne da dođu na vreme.', 'Dodatna vežba za predmet Mikrokontroleri','47');
INSERT INTO `subjects`.`notification` (`date_of_notification`, `description`, `title`,`subject_id`) VALUES ('2022-06-22', 'Obaveštavamo vas da će se predavanje iz predmeta Električni sklopovi održati u sali 202 u petak, 25. juna 2023. godine.', 'Izmenjeno vreme predavanja','46');
INSERT INTO `subjects`.`notification` (`date_of_notification`, `description`, `title`,`subject_id`) VALUES ('2022-03-20', 'Nastava iz predmeta Elektromagnetizam će se održati u online formatu sutra. Molimo vas da budete pripremljeni i pridružite se na odgovarajućem linku.', 'Obaveštenje: Online nastava Elektromagnetizma','45');
INSERT INTO `subjects`.`notification` (`date_of_notification`, `description`, `title`,`subject_id`) VALUES ('2022-01-05', 'Nova laboratorijska vežba zakazana za sledeći čas.', 'Obaveštenje: Signali i sistemi','44');
INSERT INTO `subjects`.`notification` (`date_of_notification`, `description`, `title`,`subject_id`) VALUES ('2022-08-17', 'Predavanje za predmet Digitalna elektronika će biti održano u učionici 203 u utorak, 25. juna u 10:00. Molimo sve studente da prisustvuju.', 'Obaveštenje: Predavanje o Digitalnoj elektronici','43');
INSERT INTO `subjects`.`notification` (`date_of_notification`, `description`, `title`,`subject_id`) VALUES ('2022-07-27', 'Nastava iz Matematike za inženjere će se održati sutra u 9:00h u učionici 302.', 'Obaveštenje - Nastava Matematike za inženjere','42');
INSERT INTO `subjects`.`notification` (`date_of_notification`, `description`, `title`,`subject_id`) VALUES ('2022-09-15', 'Obaveštenje o promeni rasporeda vežbi za predmet Osnove elektrotehike.', 'Promena rasporeda vežbi','41');

INSERT INTO `subjects`.`notification` (`date_of_notification`, `description`, `title`,`subject_id`) VALUES ('2022-06-22', 'Nova laboratorijska vežba za predmet Bio robotika je zakazana za sledeći četvrtak. Molimo sve studente da se pripreme i donesu potrebne materijale.', 'Obaveštenje: Zakazana laboratorijska vežba','39');
INSERT INTO `subjects`.`notification` (`date_of_notification`, `description`, `title`,`subject_id`) VALUES ('2022-07-13', 'Opis notifikacije za Medicinska slika', 'Naslov notifikacije za Medicinska slika','38');
INSERT INTO `subjects`.`notification` (`date_of_notification`, `description`, `title`,`subject_id`) VALUES ('2022-02-22', 'Obaveštenje: Izmenjen raspored predavanja za Bio Tehnologiju. Molimo vas da proverite ažurirane termine.', 'Izmena rasporeda predavanja','37');
INSERT INTO `subjects`.`notification` (`date_of_notification`, `description`, `title`,`subject_id`) VALUES ('2022-06-19', 'Novi materijali za predmet Biološki Sistemi i Signali su dostupni na kursnoj platformi. Molimo sve studente da ih pregledaju i pripreme za predstojeći test.', 'Novi materijali za Biološki Sistemi i Signali','36');
INSERT INTO `subjects`.`notification` (`date_of_notification`, `description`, `title`,`subject_id`) VALUES ('2022-04-13', 'Sutra održavanje praktičnog testa za predmet Bio Mehanika. Molimo sve studente da se pripreme i donesu svoje laboratorijske beleške.', 'Praktični test - Bio Mehanika','35');
INSERT INTO `subjects`.`notification` (`date_of_notification`, `description`, `title`,`subject_id`) VALUES ('2022-04-19', 'Poziv na predavanje o medicinskoj elektronici', 'Predavanje: Medicinska Elektronika','34');
INSERT INTO `subjects`.`notification` (`date_of_notification`, `description`, `title`,`subject_id`) VALUES ('2022-07-23', 'Ispit iz Bio Materijala je zakazan za sutra. Pripremite se i sretno!', 'Ispit iz Bio Materijala - Sutra','33');
INSERT INTO `subjects`.`notification` (`date_of_notification`, `description`, `title`,`subject_id`) VALUES ('2022-06-23', 'Poziv na predavanje o novim tehnologijama u biomedicinskoj instrumentaciji.', 'Predavanje o novim tehnologijama','32');
INSERT INTO `subjects`.`notification` (`date_of_notification`, `description`, `title`,`subject_id`) VALUES ('2022-05-23', 'Nastava iz Bioinformatike održava se sutra u 10:00 sati u učionici 203. Molimo sve studente da prisustvuju.', 'Nastava iz Bioinformatike - Sutra u 10:00 sati','31');
INSERT INTO `subjects`.`notification` (`date_of_notification`, `description`, `title`,`subject_id`) VALUES ('2022-06-21', 'Obavještavamo vas da će se iduća predavanja iz predmeta Osnove Molekularne Biologije održati u online formatu putem Zoom platforme.', 'Promjena načina održavanja predavanja','30');
INSERT INTO `subjects`.`notification` (`date_of_notification`, `description`, `title`,`subject_id`) VALUES ('2022-04-23', 'Danas je održano predavanje na temu Uvoda u Bio Inženjering. Molimo vas da pregledate materijale i pripremite se za narednu sedmicu.', 'Obavještenje: Predavanje Uvod u Bio Inženjering','29');
INSERT INTO `subjects`.`notification` (`date_of_notification`, `description`, `title`,`subject_id`) VALUES ('2022-03-23', 'Zakazano je ponavljanje gradiva iz poglavlja 4 za predmet Verovatnoća i statistika. Molim vas da se pripremite i donesete svoje beleške na čas.', 'Ponavljanje gradiva iz poglavlja 4','28');
INSERT INTO `subjects`.`notification` (`date_of_notification`, `description`, `title`,`subject_id`) VALUES ('2022-07-20', 'Danas je održano predavanje o Eulerovom teoremu u vezi s grafima.', 'Predavanje o Eulerovom teoremu','27');
INSERT INTO `subjects`.`notification` (`date_of_notification`, `description`, `title`,`subject_id`) VALUES ('2022-03-20', 'Održat će se dodatna vježba iz Matematičke analize u petak u 15:00 sati.', 'Dodatna vježba','26');
INSERT INTO `subjects`.`notification` (`date_of_notification`, `description`, `title`,`subject_id`) VALUES ('2022-05-19', 'Održaće se dodatna vežba za rešavanje diferencijalnih jednačina u sredu, 28. juna. Budite sigurni da prisustvujete.', 'Dodatna vežba za diferencijalne jednačine','25');
INSERT INTO `subjects`.`notification` (`date_of_notification`, `description`, `title`,`subject_id`) VALUES ('2022-06-23', 'Predavanje o Teoriji brojeva je zakazano za sutra u 14:00 sati. Molimo sve studente da budu prisutni i pripreme se za predavanje.', 'Obavijest o predavanju','24');
INSERT INTO `subjects`.`notification` (`date_of_notification`, `description`, `title`,`subject_id`) VALUES ('2022-04-19', 'Pregled gradiva iz Algebarskih struktura je zakazan za sutra. Molimo pripremite se i donesite svoje beleške.', 'Pregled gradiva','23');
INSERT INTO `subjects`.`notification` (`date_of_notification`, `description`, `title`,`subject_id`) VALUES ('2023-06-23', 'Danas održana predavanja o drugom parcijalnom ispitu.', 'Obavijest o predavanjima','22');


-- Marko Petrovic

INSERT INTO `subjects`.`subject_enrollment` (`final_grade`, `number_of_attempts`, `points`, `student_id`, `subject_id`) VALUES ('8', '1', '77', '1', '1');
INSERT INTO `subjects`.`subject_enrollment` (`final_grade`, `number_of_attempts`, `points`, `student_id`, `subject_id`) VALUES ('10', '2', '96', '1', '2');
INSERT INTO `subjects`.`subject_enrollment` (`number_of_attempts`, `points`, `student_id`, `subject_id`) VALUES ('3', '40', '1', '3');
INSERT INTO `subjects`.`subject_enrollment` (`number_of_attempts`, `points`, `student_id`, `subject_id`) VALUES ('2', '45', '1', '4');

-- Ana Jovanovic

INSERT INTO `subjects`.`subject_enrollment` (`final_grade`, `number_of_attempts`, `points`, `student_id`, `subject_id`) VALUES ('6', '2', '51', '2', '9');
INSERT INTO `subjects`.`subject_enrollment` (`final_grade`, `number_of_attempts`, `points`, `student_id`, `subject_id`) VALUES ('7', '2', '61', '2', '10');
INSERT INTO `subjects`.`subject_enrollment` (`final_grade`, `number_of_attempts`, `points`, `student_id`, `subject_id`) VALUES ('9', '1', '88', '2', '11');
INSERT INTO `subjects`.`subject_enrollment` (`number_of_attempts`, `points`, `student_id`, `subject_id`) VALUES ('3', '30', '2', '12');

-- Stefan Nikolic

INSERT INTO `subjects`.`subject_enrollment` (`final_grade`, `number_of_attempts`, `points`, `student_id`, `subject_id`) VALUES ('7', '1', '61', '3', '13');
INSERT INTO `subjects`.`subject_enrollment` (`final_grade`, `number_of_attempts`, `points`, `student_id`, `subject_id`) VALUES ('8', '1', '75', '3', '14');
INSERT INTO `subjects`.`subject_enrollment` (`final_grade`, `number_of_attempts`, `points`, `student_id`, `subject_id`) VALUES ('9', '1', '81', '3', '15');
INSERT INTO `subjects`.`subject_enrollment` (`final_grade`, `number_of_attempts`, `points`, `student_id`, `subject_id`) VALUES ('9', '1', '90', '3', '16');

-- Milica Djordjevic

INSERT INTO `subjects`.`subject_enrollment` (`final_grade`, `number_of_attempts`, `points`, `student_id`, `subject_id`) VALUES ('6', '3', '60', '4', '21');
INSERT INTO `subjects`.`subject_enrollment` (`final_grade`, `number_of_attempts`, `points`, `student_id`, `subject_id`) VALUES ('7', '1', '70', '4', '22');
INSERT INTO `subjects`.`subject_enrollment` (`number_of_attempts`, `points`, `student_id`, `subject_id`) VALUES ('2', '30', '4', '23');
INSERT INTO `subjects`.`subject_enrollment` (`final_grade`, `number_of_attempts`, `points`, `student_id`, `subject_id`) VALUES ('9', '3', '82', '4', '24');

-- Aleksandar Simic

INSERT INTO `subjects`.`subject_enrollment` (`number_of_attempts`, `points`, `student_id`, `subject_id`) VALUES ('1', '39', '5', '25');
INSERT INTO `subjects`.`subject_enrollment` (`number_of_attempts`, `points`, `student_id`, `subject_id`) VALUES ('1', '45', '5', '26');
INSERT INTO `subjects`.`subject_enrollment` (`number_of_attempts`, `points`, `student_id`, `subject_id`) VALUES ('1', '50', '5', '27');
INSERT INTO `subjects`.`subject_enrollment` (`number_of_attempts`, `points`, `student_id`, `subject_id`) VALUES ('0', '0', '5', '28');

-- Tamara Lukic

INSERT INTO `subjects`.`subject_enrollment` (`final_grade`, `number_of_attempts`, `points`, `student_id`, `subject_id`) VALUES ('6', '1', '60', '6', '37');
INSERT INTO `subjects`.`subject_enrollment` (`final_grade`, `number_of_attempts`, `points`, `student_id`, `subject_id`) VALUES ('7', '1', '77', '6', '38');
INSERT INTO `subjects`.`subject_enrollment` (`final_grade`, `number_of_attempts`, `points`, `student_id`, `subject_id`) VALUES ('6', '1', '54', '6', '39');
INSERT INTO `subjects`.`subject_enrollment` (`final_grade`, `number_of_attempts`, `points`, `student_id`, `subject_id`) VALUES ('7', '1', '63', '6', '40');

-- Marko Djuric

INSERT INTO `subjects`.`subject_enrollment` (`number_of_attempts`, `points`, `student_id`, `subject_id`) VALUES ('1', '0', '7', '29');
INSERT INTO `subjects`.`subject_enrollment` (`number_of_attempts`, `points`, `student_id`, `subject_id`) VALUES ('1', '0', '7', '30');
INSERT INTO `subjects`.`subject_enrollment` (`final_grade`, `number_of_attempts`, `points`, `student_id`, `subject_id`) VALUES ('7', '2', '66', '7', '31');
INSERT INTO `subjects`.`subject_enrollment` (`final_grade`, `number_of_attempts`, `points`, `student_id`, `subject_id`) VALUES ('8', '2', '78', '7', '32');

-- Jovana Simic

INSERT INTO `subjects`.`subject_enrollment` (`final_grade`, `number_of_attempts`, `points`, `student_id`, `subject_id`) VALUES ('7', '1', '63', '8', '49');
INSERT INTO `subjects`.`subject_enrollment` (`final_grade`, `number_of_attempts`, `points`, `student_id`, `subject_id`) VALUES ('6', '2', '52', '8', '50');
INSERT INTO `subjects`.`subject_enrollment` (`final_grade`, `number_of_attempts`, `points`, `student_id`, `subject_id`) VALUES ('6', '2', '58', '8', '51');
INSERT INTO `subjects`.`subject_enrollment` (`number_of_attempts`, `points`, `student_id`, `subject_id`) VALUES ('1', '40', '8', '52');

-- Stefan Djordjevic

INSERT INTO `subjects`.`subject_enrollment` (`final_grade`, `number_of_attempts`, `points`, `student_id`, `subject_id`) VALUES ('10', '1', '95', '9', '45');
INSERT INTO `subjects`.`subject_enrollment` (`final_grade`, `number_of_attempts`, `points`, `student_id`, `subject_id`) VALUES ('10', '1', '100', '9', '46');
INSERT INTO `subjects`.`subject_enrollment` (`number_of_attempts`, `points`, `student_id`, `subject_id`) VALUES ('1', '50', '9', '47');
INSERT INTO `subjects`.`subject_enrollment` (`final_grade`, `number_of_attempts`, `points`, `student_id`, `subject_id`) VALUES ('7', '1', '68', '9', '48');


INSERT INTO `subjects`.`subject_material` (`author`, `isbn`, `number_of_pages`, `publisher`, `title`) VALUES ('Milos Petrovic','978-86-123456-0-1','300','Programski svet','Uvod u programiranje');
INSERT INTO `subjects`.`subject_material` (`author`, `isbn`, `number_of_pages`, `publisher`, `title`) VALUES ('Ana Jovanovic','978-86-123456-1-8','250','Racunarski izdavac','Matematika za programera');
INSERT INTO `subjects`.`subject_material` (`author`, `isbn`, `number_of_pages`, `publisher`, `title`) VALUES ('Marko Simic','978-86-123456-2-5','400','DataPress','Osnove baze podataka');
INSERT INTO `subjects`.`subject_material` (`author`, `isbn`, `number_of_pages`, `publisher`, `title`) VALUES ('Jovana Stojanovic','978-86-123456-3-2','350','Programerska knjiga','Web programiranje');
INSERT INTO `subjects`.`subject_material` (`author`, `isbn`, `number_of_pages`, `publisher`, `title`) VALUES ('Marko Djordjevic','978-86-123456-4-9','500','Programirajte s nama','Objektno orijentisano programiranje');
INSERT INTO `subjects`.`subject_material` (`author`, `isbn`, `number_of_pages`, `publisher`, `title`) VALUES ('Nikola Jankovic', '978-86-123456-5-6', '450', 'Programiranje plus', 'Algoritmi i strukture podataka');
INSERT INTO `subjects`.`subject_material` (`author`, `isbn`, `number_of_pages`, `publisher`, `title`) VALUES ('Sanja Stanic', '978-86-123456-6-3', '400', 'Tehnicka knjiga', 'Softversko inzenjerstvo');
INSERT INTO `subjects`.`subject_material` (`author`, `isbn`, `number_of_pages`, `publisher`, `title`) VALUES ('Ivan Petrovic','978-86-123456-7-0','350','Projektno izdanje','Upravljanje projektima');
INSERT INTO `subjects`.`subject_material` (`author`, `isbn`, `number_of_pages`, `publisher`, `title`) VALUES ('Jelena Milicevic','978-86-123456-8-7','450','Razvojni centar','Napredno programiranje');
INSERT INTO `subjects`.`subject_material` (`author`, `isbn`, `number_of_pages`, `publisher`, `title`) VALUES ('Marko Stankovic','978-86-123456-9-4','200','Programiranje i baze','Baze podataka');

INSERT INTO `subjects`.`subject_material` (`author`, `isbn`, `number_of_pages`, `publisher`, `title`) VALUES ('Alfred V. Aho, Monica S. Lam, Ravi Sethi, Jeffrey D. Ullman','978-8652114123','1008','Racunarski fakultet, Beograd','Kompajleri - Principi, tehnike i alati');
INSERT INTO `subjects`.`subject_material` (`author`, `isbn`, `number_of_pages`, `publisher`, `title`) VALUES ('Jenny Preece, Yvonne Rogers, Helen Sharp','978-8686527056','668','Mikro knjiga, Beograd','Interakcija covek - racunar');
INSERT INTO `subjects`.`subject_material` (`author`, `isbn`, `number_of_pages`, `publisher`, `title`) VALUES ('Elfriede Dustin, Jeff Rashka, John Paul','978-8652125914','640','Mikro knjiga, Beograd','Softversko testiranje');
INSERT INTO `subjects`.`subject_material` (`author`, `isbn`, `number_of_pages`, `publisher`, `title`) VALUES ('William Stallings, Lawrence Brown','978-8652112730','784','Racunarski fakultet, Beograd','Sigurnost softvera');
INSERT INTO `subjects`.`subject_material` (`author`, `isbn`, `number_of_pages`, `publisher`, `title`) VALUES ('Ian Sommerville','978-8611146280','832','CET, Beograd','Softversko projektovanje');
INSERT INTO `subjects`.`subject_material` (`author`, `isbn`, `number_of_pages`, `publisher`, `title`) VALUES ('Meir Lehman, Joanne Turner','978-8611146280','624','CET, Beograd','Softversko odrzavanje i evolucija');
INSERT INTO `subjects`.`subject_material` (`author`, `isbn`, `number_of_pages`, `publisher`, `title`) VALUES ('Ivan Nastic','978-8611175211','368','CET, Beograd','Matematika 1');

INSERT INTO `subjects`.`subject_material` (`author`, `isbn`, `number_of_pages`, `publisher`, `title`) VALUES ('Dusan Djukic, Vladimir Jankovic, Ivan Matic', '978-8611175235', '584', 'CET, Beograd', 'Analiza 1');
INSERT INTO `subjects`.`subject_material` (`author`, `isbn`, `number_of_pages`, `publisher`, `title`) VALUES ('Milan Merkle', '978-8611175214', '432', 'CET, Beograd', 'Linearna algebra');
INSERT INTO `subjects`.`subject_material` (`author`, `isbn`, `number_of_pages`, `publisher`, `title`) VALUES ('Veljko Milutinovic, Ivan Petrovic', '978-8611146358', '416', 'CET, Beograd', ' Diskretna matematika');
INSERT INTO `subjects`.`subject_material` (`author`, `isbn`, `number_of_pages`, `publisher`, `title`) VALUES ('Petar Markovic', '978-8672884481', '282', 'Akademska misao, Beograd', 'Matematicka logika');
INSERT INTO `subjects`.`subject_material` (`author`, `isbn`, `number_of_pages`, `publisher`, `title`) VALUES ('Dusan Djukic, Vladimir Jankovic, Ivan Matic', '978-8611175245', '644', 'CET, Beograd', 'Analiza 2');
INSERT INTO `subjects`.`subject_material` (`author`, `isbn`, `number_of_pages`, `publisher`, `title`) VALUES ('Milan Hladnik', '978-8611175290', '384', 'CET, Beograd', 'Algebarske strukture');
INSERT INTO `subjects`.`subject_material` (`author`, `isbn`, `number_of_pages`, `publisher`, `title`) VALUES ('Zoran Kadelburg, Aleksandar Torgasev', '978-8611175368', '424', 'CET, Beograd', 'Teorija brojeva');

INSERT INTO `subjects`.`subject_material` (`author`, `isbn`, `number_of_pages`, `publisher`, `title`) VALUES ('Dragoslav Herceg','978-86-17-18425-3','320','Naucna knjiga','Diferencijalne jednacine');
INSERT INTO `subjects`.`subject_material` (`author`, `isbn`, `number_of_pages`, `publisher`, `title`) VALUES ('Dusan Djukic','978-86-17-16636-2','480','Akademska misao','Matematička analiza');
INSERT INTO `subjects`.`subject_material` (`author`, `isbn`, `number_of_pages`, `publisher`, `title`) VALUES ('Miodrag Mateljevic','978-86-17-11277-7','240','Akademska knjiga','Topologija');
INSERT INTO `subjects`.`subject_material` (`author`, `isbn`, `number_of_pages`, `publisher`, `title`) VALUES ('Nenad Petrovic','978-86-17-10285-9','400','Zavod za udzbenike','Verovatnoca i statistika');
INSERT INTO `subjects`.`subject_material` (`author`, `isbn`, `number_of_pages`, `publisher`, `title`) VALUES ('Jovan Adamov','978-86-17-18894-7','280','Akademska misao','Uvod u bio inzenjering');
INSERT INTO `subjects`.`subject_material` (`author`, `isbn`, `number_of_pages`, `publisher`, `title`) VALUES ('Milica Jovanovic','978-86-17-16537-2','360','Akademska knjiga','Osnove molekularne biologije');
INSERT INTO `subjects`.`subject_material` (`author`, `isbn`, `number_of_pages`, `publisher`, `title`) VALUES ('Nikola Stojanovic','978-86-17-17658-8','420','Data Status','Bio Informatika');
INSERT INTO `subjects`.`subject_material` (`author`, `isbn`, `number_of_pages`, `publisher`, `title`) VALUES ('Aleksandar Petrovic','978-86-17-10274-3','300','Zavod za udžbenike','Biomedicinska instrumentacija');

INSERT INTO `subjects`.`subject_material` (`author`, `isbn`, `number_of_pages`, `publisher`, `title`) VALUES ('Marija Jankovic', '978-86-17-12632-3', '280', 'Akademska misao', 'Bio materijali');
INSERT INTO `subjects`.`subject_material` (`author`, `isbn`, `number_of_pages`, `publisher`, `title`) VALUES ('Vladimir Popovic', '978-86-17-15689-1', '360', 'Akademska knjiga', 'Medicinska elektronika');
INSERT INTO `subjects`.`subject_material` (`author`, `isbn`, `number_of_pages`, `publisher`, `title`) VALUES ('Jelena Ivanovic', '978-86-17-14586-7', '420', 'Data Status', 'Bio mehanika');
INSERT INTO `subjects`.`subject_material` (`author`, `isbn`, `number_of_pages`, `publisher`, `title`) VALUES ('Marko Petrovic', '978-86-17-12556-2', '320', 'Naucna knjiga', 'Bioloski sistemi i signali');
INSERT INTO `subjects`.`subject_material` (`author`, `isbn`, `number_of_pages`, `publisher`, `title`) VALUES ('Ana Simic', '978-86-17-10485-3', '360', 'Akademska misao', 'Biotehnologija');
INSERT INTO `subjects`.`subject_material` (`author`, `isbn`, `number_of_pages`, `publisher`, `title`) VALUES ('Luka Jovanovic', '978-86-17-16158-8', '280', 'Akademska knjiga', 'Medicinska slika');
INSERT INTO `subjects`.`subject_material` (`author`, `isbn`, `number_of_pages`, `publisher`, `title`) VALUES ('Aleksandar Simic', '978-86-17-11976-6', '420', 'Data Status', 'Bio-robotika');
INSERT INTO `subjects`.`subject_material` (`author`, `isbn`, `number_of_pages`, `publisher`, `title`) VALUES ('Milena Radovanovic', '978-86-17-14765-6', '320', 'Naucna knjiga', 'Regulacija genetskog izraza');

INSERT INTO `subjects`.`subject_material` (`author`, `isbn`, `number_of_pages`, `publisher`, `title`) VALUES ('Branislav M. Notaros','978-86-17-18096-4','400','Akademska misao','Osnove elektrotehnike');
INSERT INTO `subjects`.`subject_material` (`author`, `isbn`, `number_of_pages`, `publisher`, `title`) VALUES ('Dragan Masulovic','978-86-7994-387-4','600','Akademska knjiga','Matematika za inženjere');
INSERT INTO `subjects`.`subject_material` (`author`, `isbn`, `number_of_pages`, `publisher`, `title`) VALUES ('Zoran Stamenkovic','978-86-17-18541-9','320','Akademska misao','Digitalna elektronika');
INSERT INTO `subjects`.`subject_material` (`author`, `isbn`, `number_of_pages`, `publisher`, `title`) VALUES ('Dragan Jankovic','978-86-7994-604-2','450','Akademska knjiga','Signali i sistemi');
INSERT INTO `subjects`.`subject_material` (`author`, `isbn`, `number_of_pages`, `publisher`, `title`) VALUES ('Milan Damnjanovic','978-86-17-18745-1','550','Akademska misao','Elektromagnetizam');
INSERT INTO `subjects`.`subject_material` (`author`, `isbn`, `number_of_pages`, `publisher`, `title`) VALUES ('Zoran Jovanovic','978-86-7994-776-6','380','Akademska knjiga','Elektronički sklopovi');

INSERT INTO `subjects`.`subject_material` (`author`, `isbn`, `number_of_pages`, `publisher`, `title`) VALUES ('Aleksandar Milenkovic', '978-86-17-18982-0', '420', 'Akademska misao', 'Mikrokontroleri');
INSERT INTO `subjects`.`subject_material` (`author`, `isbn`, `number_of_pages`, `publisher`, `title`) VALUES ('Milan Radojcic', '978-86-7994-875-6', '500', 'Akademska knjiga', 'Analiza sistema');
INSERT INTO `subjects`.`subject_material` (`author`, `isbn`, `number_of_pages`, `publisher`, `title`) VALUES ('Nikola Rajaković', '978-86-17-19211-0', '470', 'Akademska misao', ' Elektroenergetika');
INSERT INTO `subjects`.`subject_material` (`author`, `isbn`, `number_of_pages`, `publisher`, `title`) VALUES ('Rade Gajic', '978-86-7994-937-1', '360', 'Akademska knjiga', ' Elektronska merenja');
INSERT INTO `subjects`.`subject_material` (`author`, `isbn`, `number_of_pages`, `publisher`, `title`) VALUES ('Radomir S. Stankovic', '978-86-17-19561-6', '550', 'Akademska misao', ' Električne masine i pogoni');
INSERT INTO `subjects`.`subject_material` (`author`, `isbn`, `number_of_pages`, `publisher`, `title`) VALUES ('Dejan V. Tosic', '978-86-7994-020-0', '480', 'Akademska knjiga', 'Komunikacioni sistemi');


