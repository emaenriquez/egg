Algoritmo sin_titulo
	Definir mtx, palabra Como Caracter
	Definir i, j,n,m Como Entero
	Dimension mtx(3,3)
	Escribir " Ingrese una palabra de 9 letras: ";leer Sin Saltar palabra
	n = 0
	m = 0
	para j = 0 hasta 2
		para i = 0 hasta 2
			mtx(i,j) = Subcadena(palabra,n,m)
			n = n + 1
			m = m + 1
		FinPara
	FinPara
	
	para j = 0 hasta 2
		para i = 0 hasta 2
			Escribir Sin Saltar mtx(i,j) " "
		FinPara
		Escribir " "
	FinPara
FinAlgoritmo
