Algoritmo sin_titulo
	definir num , al como entero 
	
	escribir " ingrese un numero aleatorio entre 1 y 10 " ; leer num
	al = aleatorio (0,10)
	hacer 
		escribir al
		si num < al Entonces
			escribir " numero incorrecto, ingrese un numero mayor " ; leer num
			si num > al entonces 
				escribir " numero incorrecto, ingrese un numero menor " ; leer num
			FinSi
		FinSi
		
	Mientras Que  num <> al

	
FinAlgoritmo
