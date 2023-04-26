DROP TABLE IF EXISTS ventas;
DROP TABLE IF EXISTS cajeros;
DROP TABLE IF EXISTS productos;
DROP TABLE IF EXISTS maquinas_registradoras;

CREATE TABLE cajeros(
	id INT NOT NULL AUTO_INCREMENT,
	nombre_apellidos VARCHAR(255) DEFAULT NULL,
	PRIMARY KEY (id)
);

CREATE TABLE productos(
	id INT NOT NULL AUTO_INCREMENT,
	nombre VARCHAR(100) DEFAULT NULL,
	precio INT DEFAULT NULL,
	PRIMARY KEY(id)
);

CREATE TABLE maquinas_registradoras(
	id INT NOT NULL AUTO_INCREMENT,
	piso INT DEFAULT NULL,
	PRIMARY KEY(id)
);

CREATE TABLE ventas(
	id INT NOT NULL AUTO_INCREMENT,
	cajero INT NOT NULL,
	producto INT NOT NULL,
	maquina_registradora INT NOT NULL,
	PRIMARY KEY(id),
	CONSTRAINT FK_cajero FOREIGN KEY (cajero) REFERENCES cajeros (id)
	ON UPDATE CASCADE ON DELETE CASCADE,
	CONSTRAINT FK_producto FOREIGN KEY (producto) REFERENCES productos (id)
	ON UPDATE CASCADE ON DELETE CASCADE,
	CONSTRAINT FK_maquina_registradora FOREIGN KEY (maquina_registradora)
	REFERENCES maquinas_registradoras (id) ON UPDATE CASCADE ON DELETE CASCADE
);

INSERT INTO cajeros(nombre_apellidos) VALUES ('Pedrito Piedra');
INSERT INTO cajeros(nombre_apellidos) VALUES ('Piedra Pedrito');
INSERT INTO cajeros(nombre_apellidos) VALUES ('Lorena Mian');
INSERT INTO cajeros(nombre_apellidos) VALUES ('Opera Senior');
INSERT INTO cajeros(nombre_apellidos) VALUES ('Kilote de Hierro');

INSERT INTO productos(nombre, precio) VALUES ('Sandia', 6);
INSERT INTO productos(nombre, precio) VALUES ('Ranita', 200);
INSERT INTO productos(nombre, precio) VALUES ('Dado', 10);
INSERT INTO productos(nombre, precio) VALUES ('Libro', 12);
INSERT INTO productos(nombre, precio) VALUES ('Revista porno', 25);

INSERT INTO maquinas_registradoras(piso) VALUES (1);
INSERT INTO maquinas_registradoras(piso) VALUES (2);
INSERT INTO maquinas_registradoras(piso) VALUES (1);
INSERT INTO maquinas_registradoras(piso) VALUES (2);
INSERT INTO maquinas_registradoras(piso) VALUES (1);

INSERT INTO ventas(cajero, producto, maquina_registradora) VALUES (1, 1, 1);
INSERT INTO ventas(cajero, producto, maquina_registradora) VALUES (2, 2, 2);
INSERT INTO ventas(cajero, producto, maquina_registradora) VALUES (3, 3, 3);
INSERT INTO ventas(cajero, producto, maquina_registradora) VALUES (4, 4, 4);
INSERT INTO ventas(cajero, producto, maquina_registradora) VALUES (5, 5, 5);