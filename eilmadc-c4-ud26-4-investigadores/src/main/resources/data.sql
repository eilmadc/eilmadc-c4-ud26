use data;

CREATE TABLE facultades (
  id int NOT NULL AUTO_INCREMENT, 
  nombre varchar(100),
  PRIMARY KEY (id)
);

LOCK TABLE facultades WRITE;
INSERT INTO facultades (nombre) VALUES ('Facultad de filologia'), ('Facultad de matematicas'), ('Facultad de telecomunicaciones');
UNLOCK TABLE;

CREATE TABLE investigadores (
  dni varchar(9) NOT NULL,
  nomapels varchar(100),
  id_facultad int,
  PRIMARY KEY (dni),
  FOREIGN KEY (id_facultad) REFERENCES facultades (id) ON DELETE CASCADE ON UPDATE CASCADE
);

LOCK TABLES investigadores WRITE;
INSERT INTO investigadores (dni, nomapels, id_facultad) VALUES
('11111111A' ,'Investigador 1', 1),
('22222222B' ,'Investigador 2', 2),
('33333333C','Investigador 3', 3);
UNLOCK TABLES;


CREATE TABLE equipos (
  id int NOT NULL AUTO_INCREMENT, 
  nombre varchar(100),
  id_facultad int,
  PRIMARY KEY (id),
  FOREIGN KEY (id_facultad) REFERENCES facultades (id) ON DELETE CASCADE ON UPDATE CASCADE
);


LOCK TABLES equipos WRITE;
INSERT INTO equipos (nombre, id_facultad) VALUES ('Equipo 1', 1), ('Equipo 2', 2), ('Equipo 3', 3);
UNLOCK TABLES;

CREATE TABLE reserva (
  id int NOT NULL AUTO_INCREMENT,
  comienzo date,
  fin date,
  dni_investigador varchar(9),
  id_equipo int,
  PRIMARY KEY (id),
  FOREIGN KEY (dni_investigador) REFERENCES investigadores (dni) ON DELETE CASCADE ON UPDATE CASCADE,
  FOREIGN KEY (id_equipo) REFERENCES equipos (id) ON DELETE CASCADE ON UPDATE CASCADE
  );

LOCK TABLES reserva WRITE;
INSERT INTO reserva (comienzo, fin, dni_investigador, id_equipo) VALUE
('2023-04-24 10:00:00', '2024-04-24 12:00:00', '111111A', 1),
('2023-04-25 11:00:00', '2024-04-25 12:00:00', '222222B', 2),
('2023-04-26 12:00:00', '2024-04-26 12:00:00', '333333C', 3);
UNLOCK TABLES;