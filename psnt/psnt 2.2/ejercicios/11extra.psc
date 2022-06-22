Algoritmo sin_titulo
	
	Definir n,multiplo_2,multiplo_3,cant Como Entero

	multiplo_2 = 0
	multiplo_3 = 0
	n = 1
	cant = 100
	
	para n <- 1 Hasta cant Hacer
		si n mod 2 == 0 Entonces
			
			multiplo_2 = multiplo_2 +1
			
			Escribir "estos numero son multiplos de 2 " multiplo_2
		FinSi
		
		si n mod 3 == 0 Entonces
			multiplo_3 = multiplo_3 +1
			Escribir "estos numero son multiplos de 3 " multiplo_3
		FinSi
	
	FinPara
		
	
FinAlgoritmo
