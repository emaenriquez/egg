Algoritmo sin_titulo
	Algoritmo sin_titulo
		Definir num Como caracter
		Escribir "Ingrese un número: ";leer Sin Saltar num
		Escribir "La suma de los dígitos es: " nachos(num)
FinAlgoritmo
Funcion rr = nachos(num)
	Definir rr, decimal, largo, nuumero, resto, suma Como Entero
	largo = Longitud(num) 
	nuumero = ConvertirANumero(num)
	rr = 0
	mientras largo <> 0 Hacer
		resto = nuumero mod 10
		rr = rr + resto
		nuumero = trunc(nuumero / 10) 
		largo = largo - 1
	FinMientras
FinFuncion

FinAlgoritmo
