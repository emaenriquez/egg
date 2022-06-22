Algoritmo sin_titulo
	
FinAlgoritmo


	Proceso  diez	
		Definir num_ como real
		leer num_
		Escribir suma(num_)
		
		
FinProceso

Funcion s <- suma(num_)
	Definir  s Como entero
	si num_ = 1 o num_ = 0 Entonces
		s = 1
	sino 
		si num_ < 0 Entonces
			s = (num_ + suma(num_ + 1))
		SiNo
			s = (num_ + suma(num_ - 1))
		FinSi
		
	FinSi
FinFuncion

