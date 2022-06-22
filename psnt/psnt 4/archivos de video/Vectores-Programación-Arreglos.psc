Algoritmo sin_titulo
	// un areglo es una estructura que nos permite guardar multiples valores del mismo tipo
	// elemento cada uno de los valores que puede guardar un vector
	
	Dimension valores(5)
	Definir i , valores como entero
	
	Escribir "ingreesa 5 valores enteros "
	
	para i = 0 Hasta 4 Hacer
		Leer valores(i)
	FinPara
	
	Escribir "los valores de forma invertidad son "
	
	para i =4 Hasta 0 Con Paso -1 Hacer
		si i = 0
			Escribir valores(i)
		SiNo
			Escribir valores(i) ", " Sin Saltar
		FinSi
		
	FinPara
	
FinAlgoritmo
