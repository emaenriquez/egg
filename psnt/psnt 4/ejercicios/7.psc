Algoritmo sin_titulo

	Definir vector,vector2,n2,n1,i,j Como Entero

	Escribir "TAMAÑO DEL VECTOR "
	Leer n1
	Leer n2
	
	Dimension vector(n1)
	Dimension vector2(n2)
	
	h(vector,vector2,n1,n2)
	
	Escribir valores(vector,n1,vector2)
	
FinAlgoritmo

Funcion ff <- valores(vector Por Referencia,n1,vector2 Por Referencia,)
	
	Definir i,f como entero
	
	para i = 0 Hasta n1-1 Hacer
	
		si vector(i) = vector2(i) entonces
			Escribir "los valores " vector(i) " " vector2(i) " son iguales"
		SiNo
			Escribir "los valores " vector(i) " " vector2(i) " no son iguales"
		FinSi
		
	FinPara
	
Fin Funcion

SubProceso h(vector,vector2,n1,n2)
	
	Definir f,j Como Entero
	
	Para f = 0 Hasta n1-1 Hacer
        vector(f) = Aleatorio(0,100)
        Escribir vector(f), " "
	FinPara
	
	Escribir "*********"
	
	Para j = 0 Hasta n2-1 Hacer
        vector2(j) = Aleatorio(0,100)
        Escribir  vector2(j), " "
	FinPara
	
FinSubProceso


	