Algoritmo sin_titulo
	
	Definir total,descuento Como Real
	Definir mes Como Caracter
	
	Escribir "seleciona el mes de su compra: septiembre, octubre y noviembre"
	Leer mes
	
	si mes == "septiembre" O mes == "octubre" o mes == "noviembre" Entonces
		
		Escribir "su compra fue en ",mes," ingrese el total de la compra"
		Leer total
		descuento = total * .10
		Escribir "total de pagar es: ",total - descuento
		Escribir "total con el descuento es: ",descuento
	FinSi
	
	
FinAlgoritmo
