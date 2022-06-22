Algoritmo sin_titulo
	Definir vocal_secreta, vocal_secreta_usuario Como Caracter
	
	Escribir "Escriba la vocal secreta"
	Leer vocal_secreta_usuario
	
	vocal_secreta = "a"
	
	Hacer
		Escribir "Ingrese otra vocal"
		Leer vocal_secreta_usuario
	Mientras Que vocal_secreta <> vocal_secreta_usuario
	
	
	Escribir "has encontrado la vocal secreta"
	
FinAlgoritmo
