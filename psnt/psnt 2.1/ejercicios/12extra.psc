Algoritmo sin_titulo
	Definir modalidad Como caracter
	Definir ventas, phora, horat, com, salfcom, salf, pagar, horaextra como real
	Escribir "Ingrese su modalidad de sueldo: "
	Escribir "A: Comisión"
	Escribir "B: Salario Fijo + Comisión"
	Escribir "C: Salario Fijo"
	leer modalidad
	segun modalidad hacer
		"a"o"A":
			Escribir"Ingrese el monto total de ventas de la semana: ";leer ventas
			com = (ventas * 40) / 100
			Escribir "Su comisión es de: $",com
		"b"o"B":
			Escribir "Ingrese el valor que se paga por hora: ";leer phora
			Escribir "Ingrese la cantidad de horas trabajadas en la semana: ";leer horat
			si horat <=40 Y horat >= 0 entonces
				Escribir"Ingrese el monto total de ventas de la semana: ";leer ventas
				salfcom = (ventas * 25) / 100
				pagar = salfcom + horat * phora
				Escribir "Va a cobrar: $",pagar
			sino
				Escribir "El máximo de horas semanales es de 40"
			FinSi
		"c"o"C":
			Escribir "Ingrese el valor que se paga por hora: ";leer phora
			Escribir "Ingrese la cantidad de horas trabajadas en la seman"
	FinSegun

FinAlgoritmo
