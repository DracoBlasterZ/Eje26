create table facultad(
	codigo int NOT NULL,
    nombre nvarchar(100),
    PRIMARY KEY(codigo)
);
create table investigadores(
	dni varchar(8) NOT NULL,
    nom_apels nvarchar(255),
    facultad int NOT NULL,
    PRIMARY KEY(dni),
    FOREIGN KEY(facultad) REFERENCES facultad(codigo)ON UPDATE RESTRICT
);
create table equipos(
	num_serie char(4) NOT NULL,
    nombre nvarchar(100),
    facultad int NOT NULL,
    PRIMARY KEY(num_serie),
    FOREIGN KEY(facultad) REFERENCES facultad(codigo)ON UPDATE RESTRICT
);
create table reserva(
	dni varchar(8) NOT NULL,
    num_serie char(4) NOT NULL,
    comienzo datetime,
    fin datetime,
    PRIMARY KEY(dni, num_serie),
    KEY(num_serie,dni),
    FOREIGN KEY(dni) REFERENCES investigadores(dni)ON UPDATE RESTRICT,
    FOREIGN KEY(num_serie) REFERENCES equipos(num_serie)ON UPDATE RESTRICT
);
INSERT INTO facultad VALUES
(340,'project'),
(012,'tgn'),
(130,'tlian'),
(740,'la limonada era un exprim'),
(420,'fantasmas'),
(540,'esto es un test'),
(345,'IES Tarragona'),
(380,'Yuotube Morado'),
(440,'Hodwagards'),
(020,'GogGogGog');

INSERT INTO investigadores VALUES
('0238491J','Test numero 1823aby',012),
('9233412Z','Test numero 3454hyu',345),
('9438491M','Test numero 5436kut',380),
('5739856Q','Test numero 1267uyt',020),
('4575491J','Test numero 9086tnm',012),
('4638459P','Test numero 6969tqm',540),
('4548563U','Test numero 3604thy',440),
('4364857L','Test numero 1097yui',020),
('6295672F','Test numero 9064tam',340),
('5823650R','Test numero 0001aaa',740);

INSERT INTO equipos VALUES
('AENR','Pedro',345),
('RTYN','Paula',540),
('RTUN','Marc',420),
('QAWS','Alberto',380),
('GTFD','Jaime',130),
('SDEW','Alicia',340),
('AAAA','Andres',012),
('POLK','Julia',740),
('UJIK','Harry',440),
('ZASX','Eva',020);

INSERT INTO reserva VALUES
('0238491J','AENR','20181107','20230110'),
('9233412Z','ZASX','20170320','20180319'),
('5823650R','RTYN','20160218','20170320'),
('4638459P','AAAA','20170114','20181212'),
('9438491M','UJIK','20170412','20181107'),
('5739856Q','SDEW','20180910','20221023'),
('4575491J','POLK','20180323','20191211'),
('4548563U','SDEW','20150412','20200715'),
('4364857L','GTFD','20170116','20161101'),
('6295672F','QAWS','20161101','20161212');