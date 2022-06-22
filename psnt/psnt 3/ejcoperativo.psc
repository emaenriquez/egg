Algoritmo sin_titulo

	menu()
	
FinAlgoritmo

SubProceso menu()
	
	Definir num Como Entero
	
	Escribir "1-Calcular muro de ladrillo 2-Calcular viga de hormigón 3-columnas de hormigón 4-Calcular contrapisos"
	Escribir "5 - Calcular techo 7 - Calcular pintura 8 - Calcular iluminación 9 - Salir"
	
	Escribir "ingrese un el numero"
	Leer num
	
	si num == 1 Entonces
		calcularMuro()
	FinSi
	
FinSubProceso

SubProceso calcularMuro()
	
	Definir largo,alto,espesor Como Entero
	Definir res Como Real
	
	Escribir "ingrese el si el muro sera de 20 o 30 cm de espesor"
	Leer espesor
	Escribir "ingrese el largo del muro"
	Leer largo
	Escribir "ingrese el alto del muro"
	Leer alto
	
	res = (largo + alto) / espesor
	
	Escribir res

FinSubProceso
	