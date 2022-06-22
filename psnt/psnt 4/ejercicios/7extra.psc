Algoritmo sin_titulo
	Definir vector, i, n, nro Como Entero
	Dimension vector(10)
	Escribir "INGRESE VALORES"
	
	para i = 0 hasta 9 Hacer
		
		Leer vector(i)
	FinPara
	Escribir "LA SUMA DE LOS VALORES DEL ARREGLO ES: " suma(vector,i-1)
	
FinAlgoritmo

Funcion r <- suma(vector, i)
	Definir r como entero
	
	si i >= 0 Entonces
		r = vector(i) + suma(vector, i-1)
	FinSi
	
FinFuncion
