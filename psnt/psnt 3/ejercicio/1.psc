Algoritmo sin_titulo
	//Realizar una funci�n que calcule la suma de dos n�meros. En el algoritmo principal le 
	//pediremos al usuario los dos n�meros para pas�rselos a la funci�n. Despu�s la funci�n 
	//calcular� la suma y lo devolver� para imprimirlo en el algoritmo
	
	Definir n1,n2 ,res Como Entero
	
	Escribir "deme un numero "
	Leer n1
	Escribir "deme un segundo numero "
	Leer n2
	
	res = sumar(n1,n2)
	
	Escribir "los numero sumados son " res
	
	
	
FinAlgoritmo

Funcion suma <- sumar (n1 Por Referencia,n2 Por Referencia)
	
	Definir suma Como Entero
	
	suma = n1 + n2
	
FinFuncion
	