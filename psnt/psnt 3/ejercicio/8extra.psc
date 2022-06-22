Algoritmo sin_titulo
	Definir num Como Entero
	
	Escribir "ingrese un numero: "
	Leer num
	
	Escribir walter(num)
	
FinAlgoritmo

Funcion rr <- walter(num)
	Definir n,a,b Como Real
	Definir rr Como Caracter
	
	si num < 3 Entonces
		Escribir "mas de dos mas"
	FinSi
	
	b = num mod 10
	a = trunc(num/100)
	
	si a = b
		Escribir "capicua"
	SiNo
		Escribir "no capicua :("
	FinSi
	
FinFuncion
	