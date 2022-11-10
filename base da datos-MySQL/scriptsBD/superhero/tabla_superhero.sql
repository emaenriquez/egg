select * from creador;
select * from personaje;

select * from personaje where nombre_real like "b%";

select inteligencia from personaje order by inteligencia asc;
select inteligencia from personaje order by inteligencia desc;

select max(inteligencia) from personaje;
select min(inteligencia) from personaje;
select avg(inteligencia) from personaje;
select round(avg(inteligencia)) from personaje;

select count(id_personaje) from personaje;

select sum(inteligencia) from personaje;

select id_creador,nombre_real from personaje group by nombre_real
having id_creador = 2;

select id_creador,nombre from creador group by nombre
having id_creador = 2;

select personaje as Personaje_de_comic from personaje;

select * from personaje limit 10;

select nombre_real,personaje,creador.nombre from personaje inner join creador on  personaje.id_creador = creador.id_creador; 

select nombre_real,personaje,creador.nombre from personaje left join creador on personaje.id_creador <> creador.id_creador;