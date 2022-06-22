Algoritmo sin_titulo
	
	definir matriz Como Entero
	Dimension matriz(5,5)
	definir vProductos, vDias Como Caracter
	Dimension vProductos(5), vDias(5)
	Definir vTotalSemanas Como Entero
	Dimension vTotalSemanas(5)
	Definir vProdMasV como caracter
	Dimension vProdMasV(5)
	Definir vTotPro Como Entero
	Dimension vTotPro(5)
	definir i, j como entero
	
	vProductos(0) = "tv"
	vProductos(1) = "radio"
	vProductos(2) = "celular"
	vProductos(3) = "pc"
	vProductos(4) = "play"
	
	vDias(0)="lunes"
	vDias(1) = "martes"
	vDias(2)=" miercoles"
	vDias(3)= "jueves"
	vDias(4)= "viernes"
	
	Escribir "INGRESE VENTAS"
	para j=0 hasta 4 Hacer
		para i =0 hasta 4 Hacer
			Escribir vDias(j) " " vProductos(i)
			Leer matriz(i,J)
		FinPara
	FinPara
	
	Escribir "*****************************"
	para j=0 hasta 4 Hacer
		para i =0 hasta 4 Hacer
			Escribir Sin Saltar matriz(i,j) " "
		FinPara
		Escribir ""
	FinPara
	
	Escribir "********************************"
	
	Definir suma Como Entero

	suma=0
	
	para i = 0 Hasta 4 Hacer
		suma = suma + matriz(0,i)
	FinPara
	
	Escribir Sin Saltar suma " "
	
	para i = 0 Hasta 4 Hacer
		suma = suma + matriz(1,i)
	FinPara
	
	Escribir Sin Saltar suma " "
	
FinAlgoritmo

