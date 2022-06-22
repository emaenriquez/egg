Funcion m <- MuestraVal(muestra, dim)
	Definir i Como Entero
	Definir m Como Logico
	Si dim <> trunc(dim) Entonces
		m = Falso
	SiNo
		m = Verdadero
		Para i = 0 Hasta Longitud(muestra) - 1 Hacer
			Segun Subcadena(muestra, i, i) Hacer
				"A","B","C","D":
					m = m & Verdadero
				De Otro Modo:
					m = Falso
			FinSegun
		FinPara
	FinSi
FinFuncion

Subproceso GenZ(gen_matr Por Referencia, muestra, dim, gen_z Por Referencia)
	Definir cont,cont_diag2,i,j Como Entero
	Definir ant1,act1,ant2,act2 Como Caracter
	cont = -1
	cont_diag2 = -1
	gen_z = Verdadero
	Para i = 0 Hasta dim - 1 Hacer
		Para j = 0 Hasta dim - 1 Hacer
			cont = cont + 1
			gen_matr[i,j] = Subcadena(muestra, cont, cont)
			Si i = j Entonces
				Si i = 0 Entonces
					ant1 = gen_matr[i,j]
					act1 = gen_matr[i,j]
				SiNo
					act1 = gen_matr[i,j]
					Si ant1 = act1 Entonces
						gen_z = gen_z & Verdadero
					SiNo
						gen_z = Falso
					FinSi
					ant1 = act1
				FinSi
				Si j = dim - 1 Entonces
					cont_diag2 = cont_diag2 + 1
					act2 = gen_matr[i,j - cont_diag2]
					Si ant2 = act2 Entonces
						gen_z = gen_z & Verdadero
					SiNo
						gen_z = Falso
					FinSi
					ant2 = act2
				FinSi
			SiNo
				Si j = dim - 1 Entonces
					cont_diag2 = cont_diag2 + 1
					Si cont_diag2 = 0 Entonces
						act2 = gen_matr[i,j - cont_diag2]
						ant2 = gen_matr[i,j - cont_diag2]
					SiNo
						act2 = gen_matr[i,j - cont_diag2]
						Si ant2 = act2 Entonces
							gen_z = gen_z & Verdadero
						SiNo
							gen_z = Falso
						FinSi
						ant2 = act2
					FinSi
				FinSi
			FinSi
		FinPara
	FinPara
	Para i = 0 Hasta dim -1 Hacer
		Para j = 0 Hasta dim - 1 Hacer
			Escribir  Sin Saltar gen_matr[i,j]," "
		FinPara
		Escribir ""
	FinPara
	Si gen_z Entonces
		Escribir "Se ha detectado el gen Z."
	SiNo
		Escribir "No se ha detectado el gen Z"
	FinSi
FinSubProceso

Algoritmo ej_integrador
	Definir muestra,gen_matr Como Caracter
	Definir dim Como Numerico
	Definir gen_z Como Logico
	Limpiar Pantalla
	Escribir "LABORATORIO DE MUESTRAS DEL DR. GALARD"
	Escribir ""
	Escribir Sin Saltar "» Ingrese la muestra: "
	Leer muestra
	dim = raiz(Longitud(muestra))
	
	Si MuestraVal(muestra, dim) Entonces
		Dimension gen_matr[dim,dim]
		gen_z = Verdadero
		GenZ(gen_matr, muestra, dim, gen_z)
	SiNo
		Limpiar Pantalla
		Escribir "Error: La muestra ingresada no es válida. Verifique lo siguiente: "
		Escribir ""
		Escribir "·Que la muestra pueda ser representada con una matriz cuadrada (MxM)."
		Escribir "·Que la muestra contenga las bases (A,B,C,D)."
	FinSi
FinAlgoritmo