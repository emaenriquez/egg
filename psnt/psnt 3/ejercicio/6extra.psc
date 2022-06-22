Algoritmo sin_titulo
	Escribir "ingrese un numero"
	definir n,a, respuesta Como Real
	leer n
	respuesta <- parioni ( n )
FinAlgoritmo

Funcion respuesta <- parioni ( n )
	definir respuesta,a Como Real
	si n mod 2=0 Entonces
		Escribir "el numero " n " tiene al menos un digito par"
	SiNo
		Repetir
			a= n mod 10
			n=trunc(n/10)
		Mientras Que n>0  y a mod 2=1 
		si a mod 2=0 Entonces
			Escribir "algun digito es par"
		SiNo
			Escribir " FELICITACIONES ningun digito es par"
		FinSi
	FinSi
Fin Funcion

FinAlgoritmo
