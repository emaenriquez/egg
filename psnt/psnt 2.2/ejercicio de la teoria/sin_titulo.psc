Algoritmo sin_titulo
	
	Definir num,cant, i, mayor Como Real
	Escribir "Ingrese la cantidad de n�meros: "; leer cant
	
	mayor = 0
	
	para i = 1 hasta cant hacer
		Escribir "Ingrese un n�mero: ";leer num
		si num > mayor
			mayor = num
		FinSi
	FinPara
	
	Escribir "El mayor es: ",mayor


FinAlgoritmo
