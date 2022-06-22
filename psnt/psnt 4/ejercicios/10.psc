Algoritmo sin_titulo
	
	Definir matriz,n,m ,suma Como Entero
	
	Escribir "ingrese m"
	Leer m
	Escribir "ingrese n"
	Leer n
	Dimension matriz(n,m)
	suma = 0
	nachos(matriz,n,m)
	pizza(matriz,n,m,suma)
	
	
FinAlgoritmo

SubProceso nachos(matriz,n,m,)
	Definir i,j Como Entero
	
	para j = 0 Hasta m-1 
		para i = 0 hasta n-1
			matriz(i,j) <- Aleatorio(0,10)
		FinPara
	FinPara
	
	para j = 0 Hasta m-1 
		para i = 0 hasta n-1
			Escribir Sin Saltar " " matriz(i,j) " "
		FinPara
	FinPara
	
FinSubProceso

SubProceso pizza(matriz,n,m,suma)
	
	Definir i ,j como entero
	
	para j = 0 Hasta m-1
		para i = 0 hasta n-1
			suma = suma + matriz(i,j)
		FinPara
	FinPara
	
	para j = 0 Hasta m-1
		para i = 0 hasta n-1
			Escribir matriz(i,j)
		FinPara
	FinPara
	
FinSubProceso
	


	
