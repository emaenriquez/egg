Algoritmo sin_titulo
	Definir No1, No2, No3,No4, Promdio, Neliminar como real
	
	Escribir "INGRESE LAS CUATROS NOTAS DEL PRACTICO A CONTROLAR"
	Leer No1, No2, No3,No4
	
	
	Si No1<No2 y No1<No3 y No1<No4 Entonces
		Neliminar<-No1
	SiNo
		Si No2<No1 y No2<No3 y No2<No4 Entonces
			Neliminar<-No2
		SiNo
			Si No3<No1 y No3<No3 y No3<No4 Entonces
				Neliminar<-No3
			SiNo
				Si No4<No1 y No4<No3 y No4<No2 Entonces
					Neliminar<-No4
				FinSi
			FinSi
		FinSi
		
	FinSi
	Promdio<-(No1+No2+No3+No4-Neliminar)/3
	Escribir "El promedio es: ", Promdio, " y la nota mas baja es: ", Neliminar

FinAlgoritmo
