Algoritmo sin_titulo
	// estructuras anidadas
	// es una caracteristicas que nos permite
	// los lenguajes de programacion para que una
	// estructura puede estar dentro de otra estructura
	
	Definir num,suma ,i,j Como Entero
	Definir confirma Como Caracter
	
	Hacer
		Escribir "ingrese un numero entero positivo"
		Leer num
		confirma = 's'
		si num > 100 Entonces
			Escribir "este programa puede tardar mucho"
			Leer confirma
		FinSi
	Mientras Que num <= 0 o confirma <> "s"
	
	para i = 2 Hasta num Con Paso  2 Hacer
		suma = 0
		para j = i hasta i Hacer
			suma = suma + j
		FinPara
		
		Escribir "la suma de los ", i , "numeros naturales es ",suma
	FinPara
	
FinAlgoritmo
