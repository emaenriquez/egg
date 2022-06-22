Algoritmo sin_titulo
	
	Definir n Como Entero
	Escribir "por favor ingrese n:"
	leer n
	Escribir hotdog(n)
	
FinAlgoritmo

Funcion rr <- hotdog(n)
	Definir a,b,c,i Como Real
	Definir rr Como Caracter
	
	rr= "fibonacci:)"
	a=0
	b=1
	Mientras a<= n
		Escribir "" a
		
		c = a + b
		a = b
		b = c
		
	FinMientras
	
FinFuncion
	