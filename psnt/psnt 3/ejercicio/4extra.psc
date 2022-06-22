Algoritmo sin_titulo
	
	Definir h_diurno , h_nocturna , f_diurno, f_nocturno , h_trabajadas,res Como Entero
	Definir nombre , dia_semana ,dia_festivo,turno Como Caracter
	
	h_diurno = 90
	h_nocturna = 125
	
	Escribir "ingrese su nombre"
	Leer nombre
	Escribir "dia de la semana "
	Leer dia_semana
	Escribir "ese dia hera festivo si o no"
	Leer dia_festivo
	Escribir "ingrese el turno diurno o nocturno"
	Leer turno

	res = turnos(dia_semana,h_diurno,h_nocturna,f_diurno, f_nocturno , h_trabajadas ,turno)
	
	Escribir res
	
FinAlgoritmo

Funcion h <- turnos(d_semana, h_diurno , h_nocturna , f_diurno, f_nocturno , h_trabajadas ,turno)
	
	Definir h Como entero
	
	si turno == "diurno" 
		h = h_trabajadas * h_diurno
		
		si f_diurno == "si"
			h = h_trabajadas * h_diurno % 10
		FinSi
		
	FinSi

	si turno == "nocturo" 

		h = h_trabajadas * h_nocturo
		
		si f_nocturno == "si"
			h = h_trabajadas * h_nocturno % 15
		FinSi
		
	FinSi
	
FinFuncion
