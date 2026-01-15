-- database: storage\Databases\antCiberDron.sqlite
DROP TABLE IF EXISTS mjAntCiberDron;
DROP TABLE IF EXISTS mjHormiga;
DROP TABLE IF EXISTS mjSexo;
DROP TABLE IF EXISTS mjEstado;
DROP TABLE IF EXISTS mjHormigaTipo;
DROP TABLE IF EXISTS mjAlimentoTipo; 
 
CREATE TABLE mjAlimentoTipo(
    IdmjAlimentoTipo INTEGER PRIMARY KEY AUTOINCREMENT
    ,mjNombre         VARCHAR(15)  NOT NULL UNIQUE
    ,mjDescripcion    VARCHAR(100) NULL
    ,mjEstado         VARCHAR(1)  NOT NULL DEFAULT 'A'
    ,mjFechaCreacion  DATETIME NOT NULL  DEFAULT (datetime('now','localtime'))
    ,mjFechaModifica  DATETIME NOT NULL  DEFAULT (datetime('now','localtime'))
);

CREATE TABLE mjHormigaTipo (
     IdmjHormigaTipo  INTEGER PRIMARY KEY AUTOINCREMENT
    ,mjNombre         VARCHAR(15)  NOT NULL UNIQUE
    ,mjDescripcion    VARCHAR(100) NULL
    ,mjEstado         VARCHAR(1)  NOT NULL DEFAULT 'A'
    ,mjFechaCreacion  DATETIME NOT NULL  DEFAULT (datetime('now','localtime'))
    ,mjFechaModifica  DATETIME NOT NULL  DEFAULT (datetime('now','localtime'))
);
CREATE TABLE mjEstado (
     IdmjEstado       INTEGER PRIMARY KEY AUTOINCREMENT
    ,mjNombre         VARCHAR(15)  NOT NULL UNIQUE
    ,mjDescripcion    VARCHAR(100) NULL
    ,mjEstado         VARCHAR(1)  NOT NULL DEFAULT 'A'
    ,mjFechaCreacion  DATETIME NOT NULL  DEFAULT (datetime('now','localtime'))
    ,mjFechaModifica  DATETIME NOT NULL  DEFAULT (datetime('now','localtime'))
);
CREATE TABLE mjSexo (
     IdmjSexo         INTEGER PRIMARY KEY AUTOINCREMENT
    ,mjNombre         VARCHAR(15)  NOT NULL UNIQUE
    ,mjDescripcion    VARCHAR(100) NULL
    ,mjEstado         VARCHAR(1)  NOT NULL DEFAULT 'A'
    ,mjFechaCreacion  DATETIME NOT NULL  DEFAULT (datetime('now','localtime'))
    ,mjFechaModifica  DATETIME NOT NULL  DEFAULT (datetime('now','localtime'))
);
CREATE TABLE mjHormiga (
     IdmjHormiga      INTEGER PRIMARY KEY AUTOINCREMENT
    ,IdmjHormigaTipo  INTEGER NOT NULL REFERENCES HormigaTipo (IdHormigaTipo)
    ,IdmjSexo         INTEGER NOT NULL REFERENCES Sexo        (IdSexo)
    ,IdmjEstado       INTEGER NOT NULL REFERENCES Estado      (IdEstado)
    ,mjNombre         VARCHAR(20) NOT NULL  UNIQUE
    ,mjDescripcion    VARCHAR(20) NULL

    ,mjEstado         VARCHAR(1)  NOT NULL DEFAULT 'A'
    ,mjFechaCreacion  DATETIME NOT NULL  DEFAULT (datetime('now','localtime'))
    ,mjFechaModifica  DATETIME NOT NULL  DEFAULT (datetime('now','localtime'))
);
CREATE TABLE mjAntCiberDron (
    IdmjAntCiberDron     INTEGER PRIMARY KEY AUTOINCREMENT
    ,mjSerie              VARCHAR(10) NOT NULL  UNIQUE
    ,mjEstado             VARCHAR(1)  NOT NULL DEFAULT 'A'
    ,mjFechaCreacion      DATETIME NOT NULL  DEFAULT (datetime('now','localtime'))
    ,mjFechaModifica      DATETIME NOT NULL  DEFAULT (datetime('now','localtime'))
);

-- Insert initial data into Sexo table
INSERT INTO mjSexo 
 (mjNombre, mjDescripcion)  VALUES 
 ('Macho'  ,' masculino')
,('Hembra' ,' femenina') 
,('Hibrido',' Hibrido')
,('Asexual',' Asexual');

INSERT INTO mjAlimentoTipo
 (mjNombre, mjDescripcion)  VALUES
 ('Carnivoro'   ,'Azucar')
,('Herbívoro' ,'Proteina')
,('Omnívoro'  ,'Lipidico')
,('Nectarivoro','Vitaminico');

INSERT INTO mjHormigaTipo
 (mjNombre, mjDescripcion)  VALUES 
 ('Larva'     ,' en etapa de larva')
,('Soldado'   ,' encargada de la defensa')
,('Rastreadora',' encargada de buscar alimento')
,('Reina'     ,' encargada de la reproducción')
,('Zángano'   ,' macho para reproducción');

INSERT INTO mjEstado
 (mjNombre, mjDescripcion)  VALUES 
 ('Vive' ,' está viva'),
 ('Muere',' ha muerto'),
 ('Finge',' su muerte');

INSERT INTO mjAntCiberDron
(mjSerie)     VALUES 
('S001'),
('S002'),
('S003'),
('S004');
    
INSERT INTO mjHormiga
(IdmjHormigaTipo, IdmjSexo, IdmjEstado, mjNombre, mjDescripcion) values 
(1, 2, 1, 'Hormiga1', 'Primera hormiga'),
(2, 1, 1, 'Hormiga2', 'Segunda hormiga'),
(3, 2, 1, 'Hormiga3', 'Tercera hormiga'),
(4, 1, 1, 'Hormiga4', 'Cuarta hormiga');

select * from mjSexo;
select * from mjHormigaTipo;
select * from mjEstado;
select * from mjAlimentoTipo;
SELECT * FROM mjHormiga;


DROP VIEW IF EXISTS mjvwHormiga;

CREATE VIEW mjvwHormiga AS
SELECT 
     H.IdmjHormiga
    ,HT.mjNombre AS mjTipo
    ,S.mjNombre  AS mjSexo
    ,E.mjNombre  AS mjEstadoHormiga
    ,H.mjNombre  AS mjNombre
    ,H.mjDescripcion
    ,H.mjEstado
    ,H.mjFechaCreacion
    ,H.mjFechaModifica
FROM mjHormiga H
JOIN mjHormigaTipo    HT ON H.IdmjHormigaTipo = HT.IdmjHormigaTipo
JOIN mjSexo           S  ON H.IdmjSexo        = S.IdmjSexo
JOIN mjEstado         E  ON H.IdmjEstado      = E.IdmjEstado
WHERE H.mjEstado = 'A';

SELECT * FROM mjvwHormiga;

SELECT IdmjHormiga
,mjTipo
,mjSexo
,mjEstadoHormiga
,mjNombre
,mjDescripcion
,mjEstado
,mjFechaCreacion
,mjFechaModifica  
FROM mjvwHormiga;


SELECT * FROM mjHormiga;



UPDATE mjEstado   SET mjNombre = 'VIVA'
WHERE IdmjEstado = 1;

UPDATE mjEstado   SET mjNombre = 'MUERTA'
WHERE IdmjEstado = 2;

UPDATE mjEstado   SET mjEstado = 'X'
WHERE IdmjEstado = 3;

select * from mjEstado;
ALTER TABLE AlimentoTipo RENAME TO mjAlimentoTipo;
ALTER TABLE AntCiberDron RENAME TO mjAntCiberDron;
ALTER TABLE Estado RENAME TO mjEstado;
ALTER TABLE Hormiga RENAME TO mjHormiga;
ALTER TABLE HormigaTipo RENAME TO mjHormigaTipo;
ALTER TABLE Sexo RENAME TO mjSexo;

ALTER TABLE mjAlimentoTipo RENAME COLUMN IdAlimentoTipo TO IdmjAlimentoTipo;
ALTER TABLE mjAlimentoTipo RENAME COLUMN Nombre TO mjNombre;
ALTER TABLE mjAlimentoTipo RENAME COLUMN Descripcion TO mjDescripcion;
ALTER TABLE mjAlimentoTipo RENAME COLUMN Estado TO mjEstado;
ALTER TABLE mjAlimentoTipo RENAME COLUMN FechaCreacion TO mjFechaCreacion;
ALTER TABLE mjAlimentoTipo RENAME COLUMN FechaModifica TO mjFechaModifica;

ALTER TABLE mjAntCiberDron RENAME COLUMN IdAntCiberDron TO IdmjAntCiberDron;
ALTER TABLE mjAntCiberDron RENAME COLUMN Serie TO mjSerie;
ALTER TABLE mjAntCiberDron RENAME COLUMN Estado TO mjEstado;
ALTER TABLE mjAntCiberDron RENAME COLUMN FechaCreacion TO mjFechaCreacion;
ALTER TABLE mjAntCiberDron RENAME COLUMN FechaModifica TO mjFechaModifica;

ALTER TABLE mjEstado RENAME COLUMN IdEstado TO IdmjEstado;
ALTER TABLE mjEstado RENAME COLUMN Nombre TO mjNombre;
ALTER TABLE mjEstado RENAME COLUMN Descripcion TO mjDescripcion;
ALTER TABLE mjEstado RENAME COLUMN Estado TO mjEstado;
ALTER TABLE mjEstado RENAME COLUMN FechaCreacion TO mjFechaCreacion;
ALTER TABLE mjEstado RENAME COLUMN FechaModifica TO mjFechaModifica;

ALTER TABLE mjHormiga RENAME COLUMN IdHormiga TO IdmjHormiga;
ALTER TABLE mjHormiga RENAME COLUMN IdHormigaTipo TO IdmjHormigaTipo;
ALTER TABLE mjHormiga RENAME COLUMN Descripcion TO mjDescripcion;
ALTER TABLE mjHormiga RENAME COLUMN IdSexo TO IdmjSexo;
ALTER TABLE mjHormiga RENAME COLUMN IdEstado TO IdmjEstado;
ALTER TABLE mjHormiga RENAME COLUMN Nombre TO mjNombre;
ALTER TABLE mjHormiga RENAME COLUMN Estado TO mjEstado;
ALTER TABLE mjHormiga RENAME COLUMN FechaCreacion TO mjFechaCreacion;
ALTER TABLE mjHormiga RENAME COLUMN FechaModifica TO mjFechaModifica;

ALTER TABLE mjHormigaTipo RENAME COLUMN IdHormigaTipo TO IdmjHormigaTipo;
ALTER TABLE mjHormigaTipo RENAME COLUMN Nombre TO mjNombre;
ALTER TABLE mjHormigaTipo RENAME COLUMN Descripcion TO mjDescripcion;
ALTER TABLE mjHormigaTipo RENAME COLUMN Estado TO mjEstado;
ALTER TABLE mjHormigaTipo RENAME COLUMN FechaCreacion TO mjFechaCreacion;
ALTER TABLE mjHormigaTipo RENAME COLUMN FechaModifica TO mjFechaModifica;

ALTER TABLE mjSexo RENAME COLUMN IdSexo TO IdmjSexo;
ALTER TABLE mjSexo RENAME COLUMN Nombre TO mjNombre;
ALTER TABLE mjSexo RENAME COLUMN Descripcion TO mjDescripcion;
ALTER TABLE mjSexo RENAME COLUMN Estado TO mjEstado;
ALTER TABLE mjSexo RENAME COLUMN FechaCreacion TO mjFechaCreacion;
ALTER TABLE mjSexo RENAME COLUMN FechaModifica TO mjFechaModifica;

DROP VIEW IF EXISTS mjvwHormiga;

CREATE VIEW mjvwHormiga AS
SELECT 
     H.IdmjHormiga                    AS IdmjHormiga
    ,HT.mjNombre                     AS mjTipo
    ,S.mjNombre                      AS mjSexo
    ,E.mjNombre                      AS mjEstadoHormiga
    ,H.mjNombre                      AS mjNombre
    ,H.mjDescripcion                 AS mjDescripcion
    ,H.mjEstado                      AS mjEstado
    ,H.mjFechaCreacion               AS mjFechaCreacion
    ,H.mjFechaModifica               AS mjFechaModifica
FROM mjHormiga H
JOIN mjHormigaTipo HT ON H.IdmjHormigaTipo = HT.IdmjHormigaTipo
JOIN mjSexo        S  ON H.IdmjSexo        = S.IdmjSexo
JOIN mjEstado      E  ON H.IdmjEstado      = E.IdmjEstado
WHERE H.mjEstado = 'A';









