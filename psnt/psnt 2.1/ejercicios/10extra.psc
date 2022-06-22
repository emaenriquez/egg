Algoritmo sin_titulo
	Definir kilos_manzanas Como Entero
	
	Escribir "cuantos kilos de manzana va a querer"
	leer kilos_manzanas
	
	si kilos_manzanas <= 2 Entonces
		Escribir "usted tiene 0% de descuento"
	SiNo
		si kilos_manzanas >= 2 o kilos_manzanas <= 5 Entonces
			Escribir "usted tiene 10% de descuento"
		SiNo
			si kilos_manzanas >= 6 o kilos_manzanas <= 10 Entonces
				Escribir "usted tiene 15% de descuento"
			FinSi
		FinSi
	FinSi
	
FinAlgoritmo
