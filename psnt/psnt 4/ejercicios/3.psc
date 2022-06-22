Algoritmo sin_titulo
	
	Definir vector,n,d,i,valor_elemento como entero
	
	Escribir "dime el tamaño del vector"
	Leer n
	
	Dimension vector(n)
	
	para i = 0 hasta n-1
		
		Escribir "deme los valores del vector"
		Leer d
		
		vector(i)= d
		
	FinPara
	
	Escribir "deme el valor del elemento para buscar"
	Leer valor_elemento
	
	Para  i = 0 Hasta 1
	
		si valor_elemento=vector(i) Entonces
			Escribir "el valor del elemento se ha encontrado en la posicion: ", i
		SiNo
			Escribir "no se ha encontrado valor"
		FinSi
		
	FinPara
	
FinAlgoritmo
