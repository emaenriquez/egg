Algoritmo sin_titulo
	
	Definir m,n Como Entero
	Escribir "ingrese M"
	Leer m
	Escribir "ingrese n"
	Leer n
	Escribir "el numero " m "entra " nachos(m,n) "veces en " n
	
FinAlgoritmo

Funcion rr = nachos(m,n)
	
	Definir rr ,suma,a Como Entero
	suma = m
	rr = 0
	Mientras suma <= n
		suma = suma + m
		rr = rr +1
	FinMientras
	
FinFuncion
