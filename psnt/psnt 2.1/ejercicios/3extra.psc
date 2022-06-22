Algoritmo sin_titulo
	
	Definir n1,n2 Como Entero
	
	Escribir "dame un numero"
	Leer n1
	
	Escribir "dame un segundo numero"
	Leer n2
	
	si n1 mod 2 == 0 Y n2 mod 2 == 0 Entonces
		
		Escribir "Ambos números son pares"
		
	SiNo
		si n1 mod 2 == 0 o n1 mod 2 == 1 Entonces
			Escribir "Los números no son pares, o uno de ellos no es par"
		FinSi
		
	FinSi
	
FinAlgoritmo
