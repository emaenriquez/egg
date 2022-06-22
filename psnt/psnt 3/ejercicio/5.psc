Algoritmo sin_titulo

	Definir n1 Como Entero
	
	Escribir "deme un numero"
	Leer n1
	
	Escribir numeroPrimo(n1)
	
FinAlgoritmo

Funcion n <- numeroPrimo(n1)

	Definir n,i,cont Como Entero
		
	cont = 0
	para i <- 1 Hasta n1 Hacer
		si n1 % i = 0 Entonces
			cont <- cont + 1
		FinSi
	FinPara
	
	si cont = 2 Entonces
		Escribir n1," es un numero primo"
	SiNo
		Escribir "el numero no es primo"
	FinSi
	
FinFuncion
	