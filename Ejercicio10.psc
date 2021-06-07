Algoritmo Ejercicio10
	
	suma = 0
	
	Mientras suma <= 1000 Hacer
		Escribir "Ingrese un numero"
		leer num
		
		multiplos = num MOD 6
		
		Si multiplos = 0 Entonces
			contadorMultiplos = contadorMultiplos + 1
		SiNo
			Si num > 0 &num  <11 Entonces
				acciones_por_verdadero
			SiNo
				acciones_por_falso
			Fin Si
		Fin Si
	Fin Mientras
	
FinAlgoritmo
