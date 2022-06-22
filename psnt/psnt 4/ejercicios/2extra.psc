Algoritmo sin_titulo
	Definir vector,i,t,n Como Entero
	Escribir "escriba el tamaño del vector"
	Leer t
	
	Dimension vector(t)
	n=0
	
	Para i = 0 Hasta t-1
		Escribir "ingrese el numero para rellenar el vector"
		Leer vector(i)
	FinPara
	
	
	para i = 0 Hasta t-1
		n = n + vector(i)
	FinPara
	
	Escribir "el promedio es " n / t
	
	
FinAlgoritmo
