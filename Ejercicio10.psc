Algoritmo Ejercicio10
	
	suma = 0
	
	Mientras suma <= 1000 Hacer
		Escribir "Ingrese un numero"
		leer num
		
		multiplos = num MOD 6
		
		Si multiplos = 0 Entonces
			contadorMultiplos = contadorMultiplos + 1
			suma = suma + num
		SiNo
			Si num > 0 &num  <11 Entonces
				sumaIntervalo = sumaIntervalo + num
				suma = suma + num
			SiNo
				suma = suma + num
				Escribir suma
			Fin Si
		Fin Si
		
		
	Fin Mientras
	
FinAlgoritmo
