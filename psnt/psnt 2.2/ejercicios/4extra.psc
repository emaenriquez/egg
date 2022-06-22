Algoritmo sin_titulo
	Definir nota_1, nota_2, nota_3,promedio Como Entero
	Definir nombre_alumno Como Caracter
	
	Escribir "ingrese el nombre del alumno";Leer nombre_alumno
	
	Mientras nombre_alumno <> "" Hacer
		
		Escribir "ingrese la primera nota";Leer nota_1
		Escribir "ingrese la segunda nota";Leer nota_2
		Escribir "ingrese la tercera nota";Leer nota_3
		
		promedio = (nota_1+ nota_2+nota_3) / 3
		Escribir "su promedio es: " promedio
		
		Escribir "escribir el nombre del siguente alumno"
		Leer nombre_alumno
		
	FinMientras
	
FinAlgoritmo
