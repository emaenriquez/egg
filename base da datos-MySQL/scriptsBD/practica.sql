select codigo_director from departamento;
select cod_jefe from empleado;
select * from empleado;
select distinct codigo_director,nombre from empleado inner join departamento on departamento.codigo_director  = empleado.cod_jefe; ;