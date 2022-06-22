Algoritmo sin_titulo
	Definir num,promedio,max,min,suma,contador Como Entero
	Escribir "ingrese un numero entero: ";leer num
	max = 0
	contador = 0
	suma = 0
	promedio = 0
	min = num
	
	Hacer
		Escribir "ingrese un numero entero";leer num
		contador = contador + 1
		promedio = promedio + num
		
		si num > max Entonces
			max = num
		FinSi
		
		si num < min Y num > 0 Entonces
			min = num
		FinSi
		
	Mientras Que num <> 0
	contador = contador -1
	Escribir "promedio " ,promedio / contador
	Escribir "max ",max
	Escribir "min ",min
	
FinAlgoritmo
