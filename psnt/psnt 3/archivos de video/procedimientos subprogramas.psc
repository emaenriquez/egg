Algoritmo sin_titulo
	// los procedimientos no nos obliga a retornar un valor 
	//  el procedimiento subprograma que noes necesario que devuelva un valor
	Definir rad,per,diam Como Real
	Escribir "ingrese un radio de un circulo"
	leer rad
	perimetroYdiametro(rad,per,diam)
	Escribir "parametro: ",per,"diametro ",diam,"area ",area_circulo(rad)
	
	
FinAlgoritmo

// paso por referencia tanto el progrma que invoco como el programa invocado comparten una referencia en memoria
// paso por valor es la menera por defecto / realiza una copia del valor
SubProceso perimetroYdiametro(rad por valor,perimetro por referencia,diametro por referencia)
	perimetro = 3.14 * rad
	diametro = rad * 2
FinSubProceso

Funcion area <- area_circulo(radio)
	Definir area Como Real
	area = 3.14 * radio * radio
FinFuncion

