Algoritmo sin_titulo
	Definir vec,i,a,suma,resta Como Real
	Dimension vec(10)
	a = 0
	suma = 0
	para i = 0 hasta 2
		Escribir " Ingrese un número: ";leer vec(i)
		suma = suma + vec(i)
		si a = 0 entonces
			resta = vec(i)
			a = 500
		sino
			resta = resta - vec(i)
		finsi
		
	FinPara
	Escribir " suma = " suma
	Escribir " resta = " resta
FinAlgoritmo
