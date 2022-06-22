Algoritmo sin_titulo
	
	Definir palabra, letra1 , letra2 como caracter

	Escribir " Porfavor ingrese una palabra " ;
	
	Leer palabra
	letra1 <- Subcadena(palabra,0,0)
	letra2 <- subcadena(palabra,Longitud(palabra)-1,Longitud(palabra)-1)
	
	Si letra1=letra2 Entonces
		escribir " verdadero "
	SiNo
		escribir "falso"
	Fin Si
FinAlgoritmo
