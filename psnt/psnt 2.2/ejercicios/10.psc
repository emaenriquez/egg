Algoritmo sin_titulo
	
	Definir i, j, nroven_ , cantvent_ Como Entero
	Definir suelbase_ , prevent_ , ventasem_ Como Real
	Escribir "ingrese la cantidad de empleados"
	Leer nroven_
	ventasem_ = 0
	Para i = 1 Hasta nroven_ Hacer
		Escribir " ingrese su sueldo base del empleado nro: ", i
		leer suelbase_
		Escribir "ingrese la cantidad de ventas realizadas"
		leer cantvent_
		Para j = 1 Hasta  cantvent_ Hacer
			escribir "ingrese cuanto cobro por la venta nro: ",j
			leer  prevent_
			ventasem_ = ventasem_ + (prevent_ * 0.10)
			
		FinPara
		Escribir "la venta semana del empleado nro ",i,", es de: " ventasem_
		Escribir "el sueldo base es de: " , (suelbase_ + ventasem_)
	FinPara

FinAlgoritmo
