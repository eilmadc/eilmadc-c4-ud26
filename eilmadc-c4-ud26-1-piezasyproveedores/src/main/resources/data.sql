
DROP TABLE IF EXISTS piezas;
CREATE TABLE piezas (
	codigo int PRIMARY KEY NOT NULL AUTO_INCREMENT,
    nombre char(100) DEFAULT NULL
);

DROP TABLE IF EXISTS proveedores;
CREATE TABLE proveedores (
	id char(4) PRIMARY KEY,
    nombre char(100) DEFAULT NULL
);

DROP TABLE IF EXISTS suministra;
CREATE TABLE suministra (
 	id int NOT NULL AUTO_INCREMENT,
	codigo_pieza int ,
	id_proveedor char(4),
	precio int,
	PRIMARY KEY(id),
	FOREIGN KEY (codigo_pieza) REFERENCES piezas (codigo) ON DELETE CASCADE ON UPDATE CASCADE,
	FOREIGN KEY (id_proveedor) REFERENCES proveedores (id) ON DELETE CASCADE ON UPDATE CASCADE
);

LOCK TABLES piezas WRITE;
INSERT INTO piezas (nombre) VALUES 
	('Amortiguador'), 
	('Caja cambios'), 
	('Disco freno'), 
	('Bujia'), 
	('Luz delantera'), 
	('Luz trasera'), 
	('Intermitente'), 
	('Pneumatico'), 
	('Retrovisor'), 
	('Escape');
UNLOCK TABLES;

LOCK TABLES proveedores WRITE;
INSERT INTO proveedores VALUES 
	('yama','Yamaha'), 
	('hond','Honda'), 
	('duca','Ducati'), 
	('apri','Aprilia'), 
	('kawa','Kawasaki'),
	('bmw','BMW'),
	('audi','Audi'),
	('opel','Opel'),
	('ford','Ford'),
	('chev','Chevrolet');
UNLOCK TABLES;

LOCK TABLES suministra WRITE;
INSERT INTO suministra (codigo_pieza, id_proveedor,precio) VALUES 
	(1, 'yama', 1250),
	(2, 'duca', 750),
    	(3, 'hond', 150),
    	(4, 'kawa', 35),
    	(5, 'apri', 980),
    	(7, 'opel', 1980),
	(8, 'ford', 950),
	(9, 'ford', 70),
	(9, 'bmw', 85),
	(6, 'hond', 430);
UNLOCK TABLES;