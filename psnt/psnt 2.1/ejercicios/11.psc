Algoritmo sin_titulo
	Definir torDef,torSinDef Como Entero
	Escribir "ingrese la cantidad de tornillos defectuosos"
	Leer torDef
	
	Escribir "ingrese la cantidad de tornillos sin defectos"
	Leer torSinDef
	
	si torDef <= 200 Y torSinDef >= 1000 Entonces
		Escribir "grado 8"
	SiNo
		si torDef >= 200 Y torSinDef >= 1000 Entonces
			Escribir "grado 7"
			
		SiNo
			si torDef <= 200 Y torSinDef <= 1000 Entonces
				Escribir "grado 6"
			SiNo
				si torDef >= 200 Y torSinDef<= 1000 Entonces
					Escribir "grado 5"
				FinSi
			FinSi
		FinSi
	FinSi
	
FinAlgoritmo
