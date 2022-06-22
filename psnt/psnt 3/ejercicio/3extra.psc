Algoritmo sin_titulo
	//Crear una función llamada "Login", que recibe un nombre de usuario y una contraseña y que 
	//devuelve Verdadero si el nombre de usuario es "usuario1" y si la contraseña es "asdasd". 
	//Además, la función calculara el número de intentos que se ha usado para loguearse, tenemos 
	//solo 3 intentos, si nos quedamos sin intentos la función devolverá Falso
	
	Definir nombre_usuario , password , res Como Caracter
	
	Escribir "ingrese su nombre de usuario solo tiene tres intentos"
	Leer nombre_usuario
	
	Escribir "ingrese la contraseña"
	Leer password
	
	res = login(nombre_usuario,password)
	
	Escribir res
	
FinAlgoritmo

Funcion h <- login(nom_usuario Por Referencia,password Por Referencia)
	
	Definir contador Como entero

	contador = 1
	
	Mientras contador <= 3 Hacer
		
		si nom_usuario == "usuario1" y password == "asdasd"
			Escribir "verdadero"
			contador = 3
		SiNo
			
			Escribir "ingrese de nuevo su nombre de usuario solo tiene tres intentos"
			Leer nom_usuario
			
			Escribir "ingrese la contraseña"
			Leer password
			
		FinSi
		
		contador = contador + 1
		
	Fin Mientras
	
FinFuncion
	