Algoritmo sin_titulo
	Definir llantas Como Entero
	Escribir "ingrese la cantidad de llantas que va a comprar"
	Leer llantas
	
	si llantas < 5 Entonces
		Escribir "el precio es de $3000 cada una"
	SiNo
		si llantas >= 5 Y llantas <= 10 Entonces
			Escribir " el precio es de $2500"
		SiNo
			si llantas >= 11 Entonces
				Escribir " precio es $2000"
			FinSi
		FinSi
	FinSi
	
	
FinAlgoritmo
