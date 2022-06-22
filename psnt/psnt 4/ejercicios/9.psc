Algoritmo sin_titulo
	//	mostrar un msj en caso de no encontrar el valor
	Definir n,ma,f,i Como Entero
	
	Escribir "ingrese numero para buscarlo "
	Leer n
	
	Dimension ma(5,5)
	
	para f = 0 Hasta 5-1 Hacer
		
		para i = 0 Hasta 5-1 Hacer
			
			ma(f,i)= Aleatorio(0,1)
			Escribir ma(f,i)," " Sin Saltar
		
		FinPara
	
		Escribir ""
		
	FinPara
	
	para f = 0 Hasta 5-1 Hacer
		
		para i = 0 Hasta 5-1 Hacer
			
			si n = ma(f,i) Entonces
				Escribir "numeros encontrado en la posicion " "[",f,",",i,"]"
			SiNo
				Escribir "numero no encontrado"
			FinSi
			
		FinPara
		
		Escribir ""
	
	FinPara
FinAlgoritmo
