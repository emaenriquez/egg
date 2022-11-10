
CREATE TABLE departamento (
  id_depto INT UNSIGNED AUTO_INCREMENT PRIMARY KEY, 
  nombre_depto VARCHAR(20) NOT NULL
);

INSERT INTO `departamento` VALUES (1000,'GERENCIA');
INSERT INTO `departamento` VALUES (2000,'GERENCIA');
INSERT INTO `departamento` VALUES (3000,'GERENCIA');
INSERT INTO `departamento` VALUES (5000,'alsdqw');

select * from departamento