Algoritmo sin_titulo

	Definir n,vector_1,nombre_longitud,i como entero
	Definir nombre,vector_2 como caracter
	
	Escribir "deme el tamaño del vector"
	Leer n
	
	Escribir "deme su nombre"
	Leer nombre	
	
	nombre_longitud = Longitud(nombre)
	
	Dimension vector_1(n)
	Dimension vector_2(n)
	
	para i = 1 Hasta 1 Hacer
		vector_1(i)= nombre_longitud
		Escribir vector_1(i)
	FinPara
	
	para i = 0 Hasta n-1 hacer
		vector_2(i) = SubCadena(nombre,i,i)
		Escribir Sin Saltar vector_2(i)
	FinPara
	
FinAlgoritmo
