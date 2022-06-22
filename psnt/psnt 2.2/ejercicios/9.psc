Algoritmo sin_titulo
	
	definir lado , i , l como entero
	definir p  , pp Como Caracter
	escribir " ingrese el numero de lados de su cuadrado : " ; leer lado
	p="*"
	pp= " "
	para i=1 hasta lado Hacer
		para l=1 hasta lado hacer 
			si i>1 y i<lado y l>1 y l<lado entonces
				escribir sin saltar pp
			sino 
				escribir sin saltar p
			FinSi
		FinPara
		escribir ""
	FinPara

	
FinAlgoritmo
