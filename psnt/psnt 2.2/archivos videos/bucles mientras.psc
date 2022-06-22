Algoritmo sin_titulo
	
	// las estructura repetitivas
	// permite que cierto codigo se ejecute mas de una vez
	// mi entras se cumpla la condicion
	
	Definir num,suma,i Como Entero
	
	Escribir "ingrese un numero"
	Leer num
	
	suma = 0
	i = 1
	
	//palabra reservada Mientras 
	//una expresion que condicion logica
	//un conjunto de secuencia de acciones
	
	Mientras i <= num Hacer
		suma = suma + i
		i = i + 1
	FinMientras
	
	Escribir "la suma de los ",num,"numeros naturales es " , suma
	
	// la variable i es una variable centinela
	// es la variable que esta dento de la expresion logica
	// pero que se modifica dentro del bloque de acciones
	
FinAlgoritmo
