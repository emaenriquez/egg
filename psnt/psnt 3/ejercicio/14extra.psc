Algoritmo sin_titulo
	
	Definir frase Como Caracter
	
	Escribir "ingrese frase "
	leer frase
	
	f(frase)
	
FinAlgoritmo

SubProceso f(frase)
	
	Definir cant_letras Como entero
	
	
	cant_letras <- Longitud(frase)
	
	para i<-1 Hasta cant_letras Hacer
		frase_nueva <- Subcadena(frase,i,i)
		Segun (frase_nueva) Hacer
			
 		FinSegun
	FinPara
	
FinSubProceso
	