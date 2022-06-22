Algoritmo sin_titulo
	Definir vector, letra, frase Como Caracter
	Definir i, j Como Entero
		
	Dimension vector(20) 
		
	para i = 0 hasta  19 hacer 
		vector(i) =""
	FinPara
		
		Escribir "INGRESE FRASE"
		Leer frase
		
		para i = 0 hasta  Longitud(frase)-1 hacer 
			vector(i) = Subcadena(frase,i,i) 
		FinPara
		
		Escribir "que letra desea ingresar"
		Leer letra
		
		Escribir "En que lugar?"
		Leer j
		
		si vector(j-1) = "" O vector(j-1) = " " Entonces
			vector(j-1) = letra
		sino 
			Escribir "posicion ocupada"
		FinSi
		
		Escribir "*************"
		para i =0 Hasta  19 Hacer
			Escribir sin saltar vector(i) 
		FinPara
		
FinAlgoritmo

