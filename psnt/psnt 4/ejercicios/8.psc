Algoritmo sin_titulo
	
	Definir m,n,i,j Como Entero
	Escribir "ingrese la cardinalidad de m y n de la matriz original"
	Leer  m, n
	
	
	Definir original Como Real
	
	Dimension original(m,n)
	
	para i = 0 Hasta m-1
		Para j = 0 Hasta n-1
			Escribir "ingrese el valor del elemento [",i,",",j,"]" Sin Saltar
			Leer original(i,j)
		FinPara
	FinPara
	
	
	para i =0 Hasta m-1
		Para j=0 Hasta n-1
			Escribir original(i,j)," " Sin Saltar
		FinPara
		Escribir ""
	FinPara
	
FinAlgoritmo

