Algoritmo sin_titulo
	
	Definir vocal_secreta, vocal_secreta_usuario Como Caracter
	
	Escribir "Escriba la vocal secreta"
	Leer vocal_secreta_usuario
	
	vocal_secreta = "a"
	
	Mientras vocal_secreta <> vocal_secreta_usuario Hacer
		Escribir "Ingrese otra vocal"
		Leer vocal_secreta_usuario
	FinMientras
	
	Escribir "has encontrado la vocal secreta"
	
FinAlgoritmo
