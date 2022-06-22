Algoritmo vector_PorMatriz
	Definir i,j,vector,matriz,vectorC Como Entero
	Dimension matriz(3,3) , vector(3) , vectorC(3)
	
	para j=0 Hasta 2
		para i=0 Hasta 2
			matriz(i,j)=3
			vector(i)=2
			vectorC(i)=0
		FinPara
	FinPara
	
	para j=0 Hasta 2
		para i=0 Hasta 2
			
			vectorC(i)= vectorC(i)+matriz(i,j)*vector(i) 
			
		FinPara
	FinPara
	para j=0 Hasta 2
		para i=0 Hasta 2
			Escribir Sin Saltar matriz(i,j) " " 
			
		FinPara
		Escribir " "
	FinPara
	Escribir " "
	para i=0 Hasta 2
		
		Escribir Sin Saltar vector(i) " "
		
	FinPara
	Escribir " " 
	para i=0 Hasta 2
		
		Escribir Sin Saltar vectorC(i) " "
		
	FinPara
FinAlgoritmo
