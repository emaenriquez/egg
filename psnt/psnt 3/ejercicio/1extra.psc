Algoritmo sin_titulo
	//Realizar una función que calcule y retorne la suma de todos los divisores del número n 
	//distintos de n. El valor de n debe ser ingresado por el usuario.
	
	Definir number,i,suma Como entero
	
	Escribir "deme un numero y devuelvo toda las sumas de sus numeros divisores"
	Leer number

	suma = 0
	
	para i <- 1 Hasta number Hacer
		si number % i = 0 Entonces 
			suma = suma+i
			Escribir suma
		FinSi
	FinPara
	
FinAlgoritmo