Algoritmo sin_titulo
	//Escribir un programa que calcule cuántos 
	//litros de combustible consumió un automóvil. El 
	//usuario ingresará una cantidad de litros de 
	//combustible cargados en la estación y una 
	//cantidad de kilómetros recorridos, después, 
	//el programa calculará el consumo (km/lt) y se lo 
	//mostrará al usuario
	
	// cuanto consumio el auto??
	
	// la cantidad de litros cargados en la estacion y 
	//la cantidad de km recorridos 
	// calcular el consumo de km/lt
	
	Definir litros_Cargados Como Entero
	Definir  km_Recoridos Como entero
	Definir resultado Como Real
	
	Escribir  "cuantos litros cargaste en la estacion"
	leer litros_Cargados
	
	Escribir  "cuantos k recorriste"
	Leer  km_Recoridos
	
	resultado = (litros_Cargados / km_Recoridos)
	Escribir "el consumo es: " resultado
	
FinAlgoritmo
