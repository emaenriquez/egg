Algoritmo sin_titulo
	
	Definir  n_dias, i,min,max  Como Entero
	Definir tmedia Como Real
	
	Escribir "ingrese la cantidad de dias "
	Leer n_dias
	
	Para i<-1 Hasta n_dias Hacer
		
		Escribir "ingrese la min de ese dia" i
		Leer min
		
		Escribir "ingrese la max"
		Leer max
		
		mediaDelDias(tmedia,min,max)
		
		Escribir "la media fue de " tmedia
		
	Fin Para
	
	
FinAlgoritmo

SubProceso mediaDelDias (tmedia Por Referencia,min Por Referencia,max Por Referencia)
	
	tmedia = (min+max) / 2  
	
FinSubProceso


	