Algoritmo sin_titulo
	Definir palabra_usuario, cadena1 Como Caracter
	
	Escribir "escribir su palabra"
	Leer palabra_usuario
	
	cadena1 = SubCadena(palabra_usuario,0,0)
	
	si cadena1 == "a" Entonces
		Escribir "coreecto"
	SiNo
		Escribir "Incorecto"
	FinSi
	
FinAlgoritmo
