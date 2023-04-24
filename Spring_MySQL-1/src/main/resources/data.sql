DROP TABLE IF EXISTS suministra;
DROP TABLE IF EXISTS proveedores;
DROP TABLE IF EXISTS piezas;

CREATE TABLE piezas(
	id INT NOT NULL AUTO_INCREMENT,
	nombre VARCHAR(100) DEFAULT NULL,
	PRIMARY KEY (id)
);

CREATE TABLE proveedores(
	id CHAR(4) NOT NULL,
	nombre VARCHAR(100) DEFAULT NULL,
	PRIMARY KEY(id)
);

CREATE TABLE suministra(
	id INT NOT NULL AUTO_INCREMENT,
	pieza INT NOT NULL,
	proveedor CHAR(4) NOT NULL,
	precio INT NOT NULL,
	PRIMARY KEY(id),
	CONSTRAINT FK_pieza FOREIGN KEY (pieza) REFERENCES piezas (id)
	ON UPDATE CASCADE ON DELETE CASCADE,
	CONSTRAINT FK_proveedor FOREIGN KEY (proveedor) REFERENCES proveedores (id)
	ON UPDATE CASCADE ON DELETE CASCADE
);

INSERT INTO piezas(nombre) VALUES ('Martillo');
INSERT INTO piezas(nombre) VALUES ('Taladro');
INSERT INTO piezas(nombre) VALUES ('Placa Metalica');
INSERT INTO piezas(nombre) VALUES ('JoyStick');
INSERT INTO piezas(nombre) VALUES ('Vidrio');

INSERT INTO proveedores(id, nombre) VALUES ('PRO1', 'Mash');
INSERT INTO proveedores(id, nombre) VALUES ('PRO2', 'Broch');
INSERT INTO proveedores(id, nombre) VALUES ('PRO3', 'MetalnMetal');
INSERT INTO proveedores(id, nombre) VALUES ('PRO4', 'Bolarary');
INSERT INTO proveedores(id, nombre) VALUES ('PRO5', 'Tomando Jar Abe');

INSERT INTO suministra(pieza, proveedor, precio) VALUES (1, 'PRO1', 23);
INSERT INTO suministra(pieza, proveedor, precio) VALUES (2, 'PRO2', 7);
INSERT INTO suministra(pieza, proveedor, precio) VALUES (3, 'PRO3', 2);
INSERT INTO suministra(pieza, proveedor, precio) VALUES (4, 'PRO4', 12);
INSERT INTO suministra(pieza, proveedor, precio) VALUES (5, 'PRO5', 6);