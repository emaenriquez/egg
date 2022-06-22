Algoritmo sin_titulo
	Definir m,n,i,j Como Entero
	Escribir "ingrese la cardinalidad de m y n de la matriz original"
	Leer  m, n
	
	Dimension original(m,n),transpuesta(n,m)
	
	Definir original , transpuesta Como Real
	
	para i = 0 Hasta m-1
		Para j = 0 Hasta n-1
			Escribir "ingrese el valor del elemento [",i,",",j,"]" Sin Saltar
			Leer original(i,j)
		FinPara
	FinPara
	
	imprimeMatriz(original,m,n)
	
	Para i = 0 Hasta m-1
		para j = 0 Hasta n-1
			transpuesta(j,i) = original(i,j)
		FinPara
	FinPara
	
	Imprimir "tamaño: ",(m*n),"matriz transpuesta"
	
	imprimeMatriz(transpuesta,n,m)
	
FinAlgoritmo

SubProceso imprimeMatriz(matriz,m,n)
	
	Definir i,j Como Entero
	
	para i =0 Hasta m-1
		Para j=0 Hasta n-1
			Escribir matriz(i,j)," " Sin Saltar
		FinPara
		Escribir ""
	FinPara
	
FinSubProceso
