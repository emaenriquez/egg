Algoritmo nueve
	Definir  i Como Entero
	Definir  palabra_, aux_, cadena_, cadenaf_ como cadena
	Escribir "ingrese una cadena finaliza con un punto "
	leer palabra_
	aux_ = palabra_
	cadena_ = aux_
	Mientras palabra_ <> "."
		leer palabra_
		aux_ = palabra_
		cadena_ = Concatenar(cadena_, aux_)
		
	FinMientras

	cadenass(cadena_ , i, cadenaf_  )
   Escribir  cadenaf_
	
FinAlgoritmo


SubProceso cadenass(cadena_ Por referencia, i Por Referencia, cadenaf_ Por Referencia)
	Definir aux_ Como Caracter
	cadenaf_ = ""
	para i = 0 hasta Longitud(cadena_) Hacer
		aux_ = SubCadena(cadena_,i,i);
	 
		segun SubCadena(cadena_,i,i) Hacer
			"A", "a" :
				
				aux_ = "@"
				cadenaf_ = Concatenar(cadenaf_, aux_) 
		
			"E", "e" :
				
				aux_ = "#"
				cadenaf_ = Concatenar(cadenaf_, aux_) 
			"I", "i" :
				
					aux_ = "$"
					cadenaf_ = Concatenar(cadenaf_, aux_) 
				"O", "o" :
					
				aux_ = "%"
				cadenaf_ = Concatenar(cadenaf_, aux_) 
			"U", "u":
				
				aux_ = "*"
				cadenaf_ = Concatenar(cadenaf_, aux_) 
				
			de otro modo:
				
 			aux_ = SubCadena(cadena_,i,i);
			cadenaf_ = Concatenar(cadenaf_ , aux_)
 		
		FinSegun
	
	
	FinPara

	
FinSubProceso
