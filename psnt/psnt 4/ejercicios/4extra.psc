Algoritmo sin_titulo
	
	Definir vector , i,contador Como Entero
	
	Dimension vector(10)
	
	contador = 0
	
	Para i = 0 Hasta 9 Hacer
		vector(i) = Aleatorio(1,10)
		Escribir vector(i)	
		
		si  vector(i) <= 5 Entonces
			contador =  vector(i) + contador
			Escribir "los total de regulares son " contador
		FinSi
		
	FinPara
	
FinAlgoritmo
