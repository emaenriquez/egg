Algoritmo sin_titulo
	definir matriz, may, mayTot Como Entero
	Dimension matriz(5,5)
	definir vProductos, vDias, dia, prod Como Caracter
	Dimension vProductos(5), vDias(5)
	Definir vTotalSemanas Como Entero
	Dimension vTotalSemanas(5)
	Definir vProdMasV como caracter
	Dimension vProdMasV(5)
	Definir vTotPro Como Entero
	Dimension vTotPro(5)
	definir i, j  como entero
	
	vProductos(0) = "  tv  "
	vProductos(1) = "radio "
	vProductos(2) = "  cel "
	vProductos(3) = "  pc  "
	vProductos(4) = " play "
	dia = ""
	prod = ""
	vDias(0)=" lun"
	vDias(1) = "mar"
	vDias(2)=" mie"
	vDias(3)= " jue"
	vDias(4)= "vie"
	
	
	
	Escribir "INGRESE VENTAS"
	para j=0 hasta 4 Hacer
		para i =0 hasta 4 Hacer
			Escribir vDias(j) " " vProductos(i)
			Leer matriz(i,J)
		FinPara
	FinPara
	
	
	
	para i = 0 Hasta 4 Hacer
		vTotalSemanas(i) = 0
		vTotPro(i) = 0
		vProdMasV(i) = ""
	FinPara
	
	
	para i = 0 Hasta 4 Hacer
		para j = 0 Hasta 4 Hacer
			
			vTotalSemanas(i) = vTotalSemanas(i) + matriz(i,j)
			vTotPro(j)	= vTotPro(j) + matriz(i,j)
			
		FinPara
	FinPara
	// ********************************CALCULO MAYOR
	mayTot= 0
	Para j = 0 Hasta 4 Hacer
		may = 0
		
		Para i = 0 hasta 4 hacer
			si may < matriz(i,j) Entonces
				
				may = matriz(i,j)
				vProdMasV(j) = vProductos(i)
				
			FinSi
			
		FinPara
	FinPara
		
	//vTotalSemanas(5
	Escribir Sin Saltar  "      "
	para i = 0 Hasta 4 Hacer
		Escribir Sin Saltar "   " vDias(i) " "
		FinPara
	Escribir " Tot. Prod"
	
	
	Escribir "******************************************"
	para j=0 hasta 4 Hacer
		Escribir sin saltar vProductos(j) "  "
		para i =0 hasta 4 Hacer
			
			Escribir Sin Saltar matriz(j,i) "     "
			
		FinPara
		Escribir " * " vTotalSemanas(j)
	FinPara
	
	Escribir "-----------------------------------------"
	Escribir Sin Saltar "         "
	para i = 0 Hasta 4 Hacer
		Escribir Sin Saltar vTotPro(i)   "      "
		
		
	FinPara
	Escribir ""
	
	Escribir "--------------------------------------------"
	Escribir sin saltar "        "
	Para i= 0 hasta 4 Hacer
		Escribir sin saltar vProdMasV(i) "   " 
	FinPara
	
	para i = 0 Hasta 4 Hacer
		para j = 0 Hasta 4 Hacer
			si mayTot < matriz(i,j)
				mayTot = matriz(i,J)
				dia = vDias(j)
				prod = vProductos(i)
			FinSi
		FinPara
	FinPara
	
	Escribir ""
	Escribir "EL PRODUCTOR MAS VENDIDO FUE: " 
	Escribir "   " prod " EL DIA " dia " con " mayTot " UNIDADES"
	
	
FinAlgoritmo
