Algoritmo sin_titulo
	
//	Ahora es tu turno. Llena uno de los vectores que definiste y dimensionaste anteriormente, de 
//	forma manual y el otro con un Bucle Para.
	
	Definir vector , i ,vector_manual Como Entero
	
	Dimension vector(10)
	Dimension vector_manual(5)
	
	Escribir "vector llenado con un bucle"
	
	Para i = 0 Hasta 9 Hacer
		vector(i) = i
		
		Escribir  vector(i) 
	FinPara
	
	Escribir "vector llenado de forma manual"
	
	vector_manual(0)=10
	vector_manual(1)=10
	vector_manual(2)=10
	vector_manual(3)=10
	vector_manual(4)=10
	
	para i = 0 Hasta 4 Hacer
		Escribir vector_manual(i)
	FinPara
	
FinAlgoritmo
