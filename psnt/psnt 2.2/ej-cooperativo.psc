Algoritmo sin_titulo
	definir usuario, contra, menu, acepta1 como cadena
	definir saldo, botellas, contador, i, nroB Como Real
	definir valor1, valor2, valor3 Como Real
	definir login Como Logico
	contador = 0
	saldo = 0
	
	Mientras contador < 3 Hacer
		Escribir "ingrese usuario";leer usuario
		Escribir "ingrese contraseña";leer contra
		si usuario = "Albus_D" y contra = "caramelosDeLimon" Entonces
			login = Verdadero
			contador = 3
		SiNo
			Escribir "usuario y/o contraseña incorrecto"
		FinSi
		contador = contador + 1
		si contador = 3 Entonces
			login = Falso
		FinSi
	FinMientras
	
	si login Entonces
		
		Hacer
			Escribir "elija una opcion: botellas - saldo - salir"; leer menu
			si menu = "salir" Entonces
				login = Falso
				Escribir "finalizo el programa"
			FinSi
			si menu = "botellas" Entonces
				Escribir "cuantas botellas va a ingresar?"; leer botellas
				para i = 1 hasta botellas Hacer
					nroB = aleatorio(100,3000)
					si nroB < 500 Entonces
						Escribir "el valor es de $50, acepta ? s/n "; leer acepta1
						si acepta1 = "s" Entonces
							saldo = saldo + 50
							Escribir "su saldo es de $",saldo
						sino 
							Escribir "Devolviendo material"
						FinSi
					FinSi
					si nroB > 501 y nroB < 1500 Entonces
						Escribir "el valor es de $125, acepta? s/n"; leer acepta1
						si acepta1 = "s" Entonces
							saldo = saldo + 125
							Escribir "su saldo es de $", saldo
						SiNo
							Escribir "Devolviendo material"
						FinSi
					FinSi
					si nroB > 1501 Entonces
						Escribir "el valor es de $200, acepta? s/n"; leer acepta1
						si acepta1 = "s" Entonces
							saldo = saldo + 200
							Escribir "su saldo es de $", saldo
						SiNo
							Escribir "Devolviendo material"
						FinSi
					FinSi
				FinPara
			SiNo
				si menu = "saldo" Entonces
					Escribir "su saldo disponible es de $", saldo
				FinSi
			FinSi
		Mientras Que login = Verdadero
		
		
	FinSi
	
	
	
	
	
	
	
	
FinAlgoritmo
