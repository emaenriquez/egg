Algoritmo sin_titulo
	Definir codigo,codigo_usuario, password,password_usuario Como Entero
	
	codigo = 1024
	password = 4567
	
	Hacer
		
		Escribir "ingrese el codigo de usuario";Leer codigo_usuario
		Escribir "ingrese la contraseña: ";Leer password_usuario
		
	Mientras Que codigo <> codigo_usuario Y password <> password_usuario
	
FinAlgoritmo
