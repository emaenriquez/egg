Algoritmo sin_titulo
	
	Definir opinion Como Entero
	
	Escribir "clasificar la peli 1 a 5 estrella"
	Leer  opinion
	
	// los condicionales permiten alterar el orden secuencial
	// del programa ejecutando acciones en Funcion 
	// de si uns condicion se cumple o no
	
	// si la condicion es verdadera
	// ser realizan cierto conjunto de acciones
	
	// si la condicion es falsa
	// se realizara otro conjunto de acciones
	
	si opinion >= 1 y opinion <= 5 Entonces
		Escribir "usted clasifico la pelicula como ", opinion 
	SiNo
		Escribir "el valor ", opinion ," no es valida nose tomara en cuenta"
	FinSi
	
FinAlgoritmo
