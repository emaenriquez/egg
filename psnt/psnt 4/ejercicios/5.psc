Algoritmo sin_titulo
//	Realizar un programa que rellene un vector de tama�o N, con valores ingresados por el 
//	usuario. A continuaci�n, se deber� crear una funci�n que reciba el vector y devuelva el valor 
	//	m�s grande del vector
	
	Definir vector ,vector_longitud ,i Como Entero
	
	Escribir "ingrese valor de dqni"
	Leer vector_longitud
	
	Dimension vector(vector_longitud)
	
	
	Para i = 0 Hasta vector_longitud -1
		
		Escribir "ingrese numeros"
		Leer vector(i)		
		
	FinPara
	
	Escribir "el numero del mas grande de vector es " ff(vector,vector_longitud)
	
FinAlgoritmo

Funcion mayor= ff(vector,vector_longitud )
	Definir mayor,i Como Entero
	
	mayor = 0
	
	Para i = 0 Hasta vector_longitud -1
		
		si mayor < vector(i) Entonces
			mayor = vector(i) 
		FinSi
		
	FinPara
	
FinFuncion
