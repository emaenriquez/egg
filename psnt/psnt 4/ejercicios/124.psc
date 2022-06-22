Algoritmo jun914exM
//	Realizar un programa que permita visualizar el resultado del producto de una matriz de 
//	enteros de 3x3 por un vector de 3 elementos. Los valores de la matriz y el vector pueden 
//	inicializarse evitando así el ingreso de datos por teclado. 
	definir i,j,k,vector,matriz,result Como Entero
	dimension vector(3),matriz(3,3),result(3)
	para i=0 hasta 2 Hacer
		para j=0 hasta 2 Hacer
			matriz(i,j)=azar(3)
			Escribir sin saltar matriz(i,j) "  "
		FinPara
		Escribir ""
	FinPara
	Escribir ""
	para i=0 hasta 2 Hacer
		vector(i)=azar(3)
		Escribir Sin Saltar vector(i) "  "
	FinPara
	Escribir ""
	para i=0 hasta 2 Hacer
		result(i)=0
	FinPara
	para j=0 hasta 2 Hacer
		para i=0 Hasta 2 Hacer
			result(j)=result(j)+(vector(i)*matriz(i,j))
		FinPara
	FinPara
	Escribir ""
	para i=0 hasta 2 Hacer
		Escribir Sin Saltar result(i) "  "
	FinPara
FinAlgoritmo
