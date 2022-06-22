Algoritmo sin_titulo
	Definir num1_, num2_, residuo_, cociente_ , resto_ Como Real
	Escribir  "ingrese un numero"
	Leer  num1_
	Escribir "ingrese otro numero"
	Leer num2_
	division(num1_, num2_   , residuo_  , cociente_  , resto_  )
	Escribir " la division de ", num1_ , "/", num2_ ," da por resultado: "
	Escribir "cociente: ", cociente_
	Escribir "residuo: ", residuo_
	Escribir  "resto: ", resto_
	
FinAlgoritmo

SubProceso division(num1_ Por valor , num2_ Por valor , residuo_ Por Referencia, cociente_ Por Referencia, resto_ Por Referencia)
	residuo_ = num1_ - num2_
	si residuo_ >= num2_ Entonces
		
		Mientras residuo_ > num2_ 
			residuo_ = residuo_ - num2_ 
			Escribir residuo_
		FinMientras
		
	FinSi
	
	cociente_ = num1_ / num2_
	resto_ = num1_ mod num2_
	
	
FinSubProceso

