Algoritmo sin_titulo
	// una Funcion  es recursiva cuando se invoca a si misma para resolver el problema que tieneque solucionar
	
	
	Proceso FactorialRecusivo
		Definir num Como Entero
		Escribir "ingrese un n "
		Leer num
		Escribir "el fac de ",num,"es ",factorial(num)
	FinProceso

FinAlgoritmo


Funcion f <- factorial(n)
	Definir f como entero
	si n = 0 o n = 1 Entonces
		f = 1
	SiNo
		f = n * factorial(n-1)
	FinSi
FinFuncion


