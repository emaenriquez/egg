Algoritmo sin_titulo
	//Dise�ar una funci�n que reciba un numero en forma de cadena y lo devuelva como numero 
	//entero. El programa podr� recibir n�meros de hasta 3 d�gitos. Nota: no poner n�meros con 
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
	