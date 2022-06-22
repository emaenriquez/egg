Algoritmo sin_titulo
	
	Definir ntx,i,j Como Entero
	
	
	Dimension ntx(3,3)
	
	i = 0
	j = 0
	
	r(ntx,i,j)
	
FinAlgoritmo

SubProceso r(ntx,i,j)
	
	para j = 0 Hasta 2
		Para i = 0 Hasta 2
			ntx(i,j) = Aleatorio(0,10)
			g(ntx)
		FinPara
	FinPara
	
	para j = 0 Hasta 2
		Para i = 0 Hasta 2
			Escribir Sin Saltar " " ntx(i,j)
		FinPara
	FinPara
	
FinSubProceso

SubProceso g(ntx)
	si i = j
		ntx(i,j)=0
	FinSi
FinSubProceso
	