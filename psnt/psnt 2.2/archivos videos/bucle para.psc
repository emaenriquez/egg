Algoritmo sin_titulo
	
	// palabra clave Para 
	// una variable numerica
	// valor inicial y valor final del contador
	// paso: forma en que varia inicial hasta el valor final
	
	Definir num,suma,i Como Entero
	
	hacer 
		Escribir "ingrese un numero positivo"
		leer num
	Mientras Que num <= 0
	
	suma = 0
	
	para i = 1 hasta num Hacer
		suma = suma + i
	FinPara
	
	Escribir "la suma de los ",num,"numeros naturales es " , suma
	
FinAlgoritmo
