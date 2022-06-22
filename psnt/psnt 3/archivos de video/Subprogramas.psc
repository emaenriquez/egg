Algoritmo sin_titulo
	// los subprogramas son un bloque de codigo que colocamos dentro de nuestro programa
	// y que podemos invocar todas las veces que queramos
	
	// los subprogramas deben tener un fin especifico
	
	// todo funcion como subprograma debe devolver un resultado
	
	//los parametros nos permite comumicar los distintos subprogramas
	
	// un subprogramas puede llamar a otro subprograma pasandole informacion a travez de los parametros
	
	Definir rad,resultado como real
	Escribir "ingrese el radio"
	leer rad
	resultado = area_circulo(rad)
	
	escribir "el area de un circulo",rad,"es",resultado
FinAlgoritmo

Funcion area <- area_circulo(radio)
	Definir area Como Real
	area = 3.14 * radio * radio
FinFuncion

