Algoritmo sin_titulo
	Definir opinion Como Entero
	
	Escribir "clasificar la peli 1 a 5 estrella"
	Leer  opinion
	
	// pretendemos dar un msj especifico para 
	// cada una de las opciones que ingrese el usuario
	
	// solo se ejecuta el bloque de codigo
	// asociado a la opcion que se cumpla
	
	segun opinion Hacer
		1,2: 
			Escribir "nos sentimos que"
		3:
			Escribir "mas o menos"
		4:
			Escribir "esta buena"
		5:
			Escribir"la mejor peli del mundo"
		De Otro Modo:
			Escribir "el valor",opinion,"no es valida y no se tomara en cuenta :("
	FinSegun
	
	
	
FinAlgoritmo
