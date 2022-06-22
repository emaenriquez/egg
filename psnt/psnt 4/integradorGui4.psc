Algoritmo integradorGui4
	Definir tablero como cadena
	Definir vec Como Entero
	Dimension vec(9)
	Dimension tablero[9,12]
	inicializarMatriz(tablero,9,12)
	agregarPalabra(tablero, "vector", 0)
	agregarPalabra(tablero, "matrix", 1)
	agregarPalabra(tablero, "programa", 2)
	agregarPalabra(tablero, "subprograma", 3)
	agregarPalabra(tablero, "subproceso", 4)
	agregarPalabra(tablero, "variable", 5)
	agregarPalabra(tablero, "entero", 6)
	agregarPalabra(tablero, "para", 7)
	agregarPalabra(tablero, "mientras", 8)
	imprimirMatriz(tablero,9,12)
	buscarR(tablero,9,12,vec)
	acomodarPalabra(tablero,9,12,vec)
	imprimirMatriz(tablero,9,12)
FinAlgoritmo

SubProceso inicializarMatriz(tablero,9,12)
	Definir i,j Como Entero
	para i = 0 hasta 8 Hacer
		para j = 0 hasta 11 Hacer
			tablero(i,j)="*"
		FinPara
	FinPara
FinSubProceso

SubProceso imprimirMatriz(tablero,i,j)
	Definir m,n Como Entero
	para m = 0 hasta i-1
		para n = 0 hasta j-1
			Escribir Sin Saltar tablero(m,n) " "
		FinPara
		Escribir ""
	FinPara
FinSubProceso

SubProceso agregarPalabra(tablero,palabra,fila)
	Definir var,i Como entero
	var =longitud(palabra)
	para i = 0 hasta var -1
		tablero(fila,i) = Subcadena(palabra, i,i)
		
		
	FinPara
FinSubProceso

SubProceso buscarR(tablero,m,n,vec)
	Definir i,j Como Entero
	para i = 0 hasta 8
		j = 0
		Hacer
			j=j+1
		Mientras Que tablero(i,j) <> "r"
	    vec(i) = j
		Escribir sin saltar j " "
	FinPara
	Escribir ""
FinSubProceso

SubProceso acomodarPalabra(tablero,m,n,vec)
	Definir i,auxiliar,j Como Entero
	para i = 0 hasta m-1
		si vec(i) <> 5 Entonces
			auxiliar = 5 -vec(i)
			para j = n-1 hasta auxiliar con paso -1 Hacer
				tablero(i,j) = tablero(i,j-auxiliar)
			FinPara
			para j = 0 Hasta auxiliar-1
				tablero(i,j) = "*"
			FinPara
		FinSi
	FinPara
FinSubProceso
	