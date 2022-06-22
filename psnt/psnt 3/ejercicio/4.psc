Funcion retorno <- BuscarLetra ( frase, l )
	definir buscar Como cadena
	definir i, contador, retorno Como Entero
	contador = 0
	para i = 0 hasta Longitud(frase) Hacer
		buscar = Subcadena(frase, i, i)
		si buscar = l Entonces
			contador = contador + 1
		FinSi
	FinPara
	retorno = contador
Fin Funcion

Algoritmo sin_titulo
	definir frase, letra como cadena
	Escribir "ingrese una frase:"; leer frase
	Escribir "ingrese letra a buscar en la frase:";leer letra
	Escribir BuscarLetra(frase, letra)
FinAlgoritmo

