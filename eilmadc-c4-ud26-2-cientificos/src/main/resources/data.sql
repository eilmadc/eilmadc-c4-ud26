
/* Entidad CIENTIFICOS */
CREATE TABLE  cientificos(
DNI char(8) PRIMARY KEY,
NomApels char(255)
);

/* Entidad PROYECTO */
CREATE TABLE proyecto (
id char(4) PRIMARY KEY,
Nombre char(255),
Horas int
);

/* Entidad ASIGNADO_A */
CREATE TABLE asignado_a (
id int PRIMARY KEY NOT NULL AUTO_INCREMENT,
Cientifico char(8),
Proyecto char(50),
FOREIGN KEY (Cientifico) REFERENCES cientificos (DNI)
ON DELETE CASCADE ON UPDATE CASCADE,
FOREIGN KEY (Proyecto) REFERENCES proyecto (id)
ON DELETE CASCADE ON UPDATE CASCADE
);

/* Insercion de valores a la tabla CIENTIFICOS */
LOCK TABLES cientificos WRITE;
INSERT INTO cientificos VALUES	
('111111A','Cientifico 1'),
('2222222B','Cientifico 2'),
('3333333C','Cientifico 3'),
('4444444A','Cientifico 4'),
('5555555B','Cientifico 5'),
('6666666C','Cientifico 6'),
('7777777A','Cientifico 7'),
('8888888B','Cientifico 8'),
('9999999C','Cientifico 9'),
('1010101C','Cientifico 10')
;
UNLOCK TABLES;

/* Insercion de valores a la tabla PROYECTO */
LOCK TABLES proyecto WRITE;
INSERT INTO proyecto VALUES	
('1','Proyecto 001', '200'),
('2','Proyecto 002', '3200'),
('3','Proyecto 003', '1500'),
('4','Proyecto 004', '2200'),
('5','Proyecto 005', '65400'),
('6','Proyecto 006', '4200'),
('7','Proyecto 007', '6800'),
('8','Proyecto 008', '2400'),
('9','Proyecto 009', '234300'),
('10','Proyecto 010', '34300')
;
UNLOCK TABLES;

/* Insercion de valores a la tabla ASIGNADO_A */
LOCK TABLES asignado_a WRITE;
INSERT INTO asignado_a (cientifico, proyecto) VALUES
('111111A','1'),
('2222222B','2'),
('3333333C','3'),
('4444444A','4'),
('5555555B','5'),
('6666666C','6'),
('7777777A','7'),
('8888888B','8'),
('9999999C','9'),
('1010101C','10')
;
UNLOCK TABLES;
