Algoritmo sin_titulo
	// Realizar una funci�n que valide si un n�mero es impar o no. Si es impar la funci�n debe 
	//devolver un verdadero, si no es impar debe devolver falso. Nota: la funci�n no debe tener 
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
	