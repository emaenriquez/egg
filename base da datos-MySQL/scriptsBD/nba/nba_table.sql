SELECT COUNT(*)
FROM estadistica
WHERE Asistencias_por_partido = (SELECT MAX(Asistencias_por_partido)
                                FROM estadistica);
/* resultado 2*/

SELECT SUM(jugador.peso)
FROM jugador
INNER JOIN equipo
ON jugador.nombre_equipo = equipo.nombre
WHERE equipo.conferencia = "East" AND jugador.posicion LIKE "%C%";
/* resultado 14043*/

select * from jugador;

SELECT COUNT(*)
FROM estadistica
WHERE Asistencias_por_partido > (SELECT COUNT(*) FROM jugador WHERE nombre_equipo = "Heat");
/*resultado 3*/

SELECT count(*)
FROM partido
WHERE temporada LIKE "%99%";
/*resultado 3480*/


SELECT COUNT(*)
FROM jugador 
INNER JOIN equipo 
ON jugador.nombre_equipo = equipo.nombre
WHERE jugador.procedencia LIKE "%Michigan%" AND equipo.conferencia = "West";
/*resultado 1*/

SELECT (AVG(e.Puntos_por_partido)+COUNT(e.Asistencias_por_partido)+SUM(e.Tapones_por_partido))
FROM estadistica 
INNER JOIN jugador
ON equipo.jugador = jugador.codigo
INNER JOIN equipo
ON jugador.nombre_equipo = equipo.nombre
WHERE equipo.division = "Central";
/*resultado 631*/

SELECT SUM(e.Tapones_por_partido)
FROM estadistica
INNER JOIN jugador
ON equipo.jugador = jugador.codigo
WHERE jugador.nombre = "Corey Maggette" AND equipo.temporada = "00/01";
/*resultado 4*/


SELECT SUM(estadisticas.Puntos_por_partido)
FROM estadistica
INNER JOIN jugador
ON estadistica.jugador = jugador.codigo
WHERE jugador.procedencia = "Argentina";
/*resultado 191    */