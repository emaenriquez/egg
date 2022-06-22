Algoritmo sin_titulo
	
	Definir num1,num2 Como Entero
	
	Escribir "deme un numero"
	Leer num1
	
	Escribir "deme un segundo numero"
	Leer num2
	
	Si EsMultiplo(num1,num2) Entonces
		Escribir num1," es múltiplo de ",num2;
	SiNo
		Escribir num1," no es múltiplo de ",num2;
	FinSi
	
FinAlgoritmo

Funcion mul <- EsMultiplo(num1,num2)
	
	Definir mul Como Logico
	
	Si num1 % num2 = 0 Entonces
		mul <- Verdadero;
	SiNo
		mul <- Falso;
	FinSi
	
FinFuncion
	