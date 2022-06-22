Algoritmo sin_titulo
	//Realizar una función que calcule la suma de dos números. En el algoritmo principal le 
	//pediremos al usuario los dos números para pasárselos a la función. Después la función 
	//calculará la suma y lo devolverá para imprimirlo en el algoritmo
	
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
	