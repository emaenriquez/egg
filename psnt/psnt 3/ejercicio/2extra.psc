Algoritmo sin_titulo
	//Diseñar una función que reciba un numero en forma de cadena y lo devuelva como numero 
	//entero. El programa podrá recibir números de hasta 3 dígitos. Nota: no poner números con 
	//decimales
	
	Definir n Como Caracter
	Definir res Como Entero
	Escribir "ingrese un numero no mayor de tres digitos"
	
	Leer n
	
	res = numeroEntero(n)
	
	Escribir "el numero paso a entero" res
	
	
FinAlgoritmo

Funcion h <- numeroEntero(n Por Valor)
	Definir h Como Entero
	
	h = ConvertirANumero(n)
	
FinFuncion
	