Algoritmo sin_titulo
	// Realizar una función que valide si un número es impar o no. Si es impar la función debe 
	//devolver un verdadero, si no es impar debe devolver falso. Nota: la función no debe tener 
	//	mensajes que digan si es par o no, eso debe pasar en el Algoritmo
	
	Definir n1,res Como Entero 
	
	Escribir "deme un numero "
	Leer n1
	
	res = par(n1)
	si res = 0 Entonces
		Escribir "el numero es par"
	FinSi
	
	si res = 1 Entonces
		Escribir "el numero es impar"
	FinSi
	
FinAlgoritmo

Funcion parOimpar <- par (n1 Por Referencia)
	
	Definir parOimpar Como Entero
	
	parOimpar = n1 mod 2
	
FinFuncion
	