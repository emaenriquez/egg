Algoritmo sin_titulo
	Definir num, suma, contador Como Real
	Escribir "Ingrese un número: "; leer num
	contador = 0
	suma = 0
	Mientras num <> -1
		Escribir "Ingrese un número: "; leer num
		si num <> -1
			contador = contador + 1
			suma = suma + num
		FinSi
	FinMientras
	Escribir "Su promedio es: " suma / contador

FinAlgoritmo
