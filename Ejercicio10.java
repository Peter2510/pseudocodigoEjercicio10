import java.util.Scanner;

public class Ejercicio10{


	public static void main(String [] args){


	int suma=0;
	int contadorMultiplos =0;
	int sumaIntervalo=0;
	

		Scanner sc = new Scanner(System.in);
	
		do{

				
				System.out.println("\nIngresa un numero: ");
				int num = sc.nextInt();

				int multiplos = num % 6;

				if (multiplos == 0) {


				 	
				 	contadorMultiplos = contadorMultiplos + 1;
					suma = suma + num;
				
				 }  

				 else{

				 	if ( num > 0 && num  <11) {

				 		
				 		
						sumaIntervalo = sumaIntervalo + num;
						suma = suma + num;
				 	}

				 	else{
				 		suma = suma + num;
				 		System.out.println(suma);
				 	}
				 }
			
				System.out.println(" La cantidad de numeros multiplos de 6 es: "+ contadorMultiplos+ " , la suma de los números entre 1 y 10 incluyendolos es de: "+ sumaIntervalo+ " y la suma total es de: "+ suma);
			

	
			} while (suma <= 1000 ); {
				System.out.println(" La cantidad de numeros multiplos de 6 es: "+ contadorMultiplos+ " , la suma de los números entre 1 y 10 incluyendolos es de: "+ sumaIntervalo+ " y la suma total es de: "+ suma);
			}

		
				

	
		
	



	}


} 