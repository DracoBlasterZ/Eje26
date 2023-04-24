
DROP TABLE IF EXISTS asignado_a;
DROP TABLE IF EXISTS cientificos;
DROP TABLE IF EXISTS proyectos;

CREATE TABLE cientificos(
	dni VARCHAR(9) NOT NULL,
	nombre_apellidos VARCHAR(255) DEFAULT NULL,
	PRIMARY KEY (dni)
);

CREATE TABLE proyectos(
	id CHAR(4) NOT NULL,
	nombre VARCHAR(255) DEFAULT NULL,
	horas INT DEFAULT NULL,
	PRIMARY KEY(id)
);

CREATE TABLE asignado_a(
	id INT NOT NULL AUTO_INCREMENT,
	cientifico VARCHAR(9) NOT NULL,
	proyecto CHAR(4) NOT NULL,
	PRIMARY KEY(id),
	CONSTRAINT FK_cientifico FOREIGN KEY (cientifico) REFERENCES cientificos (dni)
	ON UPDATE CASCADE ON DELETE CASCADE,
	CONSTRAINT FK_proyecto FOREIGN KEY (proyecto) REFERENCES proyectos (id)
	ON UPDATE CASCADE ON DELETE CASCADE
);

INSERT INTO cientificos(dni, nombre_apellidos) VALUES ('27791111A', 'Pepe Lotas');
INSERT INTO cientificos(dni, nombre_apellidos) VALUES ('78791111B', 'Juan Frenada');
INSERT INTO cientificos(dni, nombre_apellidos) VALUES ('77791111C', 'Pepo Pintame');
INSERT INTO cientificos(dni, nombre_apellidos) VALUES ('33391111D', 'Alexander Molinos');
INSERT INTO cientificos(dni, nombre_apellidos) VALUES ('77791341E', 'Alicia Miraculos');

INSERT INTO proyectos(id, nombre, horas) VALUES ('PRO1', 'Test prueba antigenos', 10);
INSERT INTO proyectos(id, nombre, horas) VALUES ('PRO2', 'Test prueba testosterona', 20);
INSERT INTO proyectos(id, nombre, horas) VALUES ('PRO3', 'Test prueba coagulos rojos', 30);
INSERT INTO proyectos(id, nombre, horas) VALUES ('PRO4', 'Test prueba antigenos 2', 40);
INSERT INTO proyectos(id, nombre, horas) VALUES ('PRO5', 'Test prueba 2', 50);

INSERT INTO asignado_a(cientifico, proyecto) VALUES ('27791111A', 'PRO1');
INSERT INTO asignado_a(cientifico, proyecto) VALUES ('78791111B', 'PRO2');
INSERT INTO asignado_a(cientifico, proyecto) VALUES ('77791111C', 'PRO3');
INSERT INTO asignado_a(cientifico, proyecto) VALUES ('33391111D', 'PRO4');
INSERT INTO asignado_a(cientifico, proyecto) VALUES ('77791341E', 'PRO5');