package Tarea;
import java.util.Scanner;
public class Tarea13 {

	//Convertir Y yardas, F pies y I pulgadas a Centímetros.
	
	public static void main (String[]args) {
		Scanner scanner = new Scanner (System.in);
		
	//Pedimos al usuario que defina que unidad de medicion quiere convertir.
		
		System.out.println("¿Qué unidad de medición desea convertir?");
		System.out.println("Si quiere convertir yardas ingrese (1)");
		System.out.println("Si quiere convertir pies ingrese (2)");
		System.out.println("Si quiere convertir pulgadas ingrese (3)");
		int opcion = scanner.nextInt();
		
		//Realizamos if else dependiendo de que elija el usuario	
		// Yardas
		if (opcion == 1) {
		
			System.out.print("Ingrese la longitud a convertir: ");
			double Y = scanner.nextDouble();
			double cm = Y * 91.44;
			System.out.println("*********************************");
			System.out.println("La longitud de :"+Y+ " 	yardas es :" +cm+" centimetros" );
			System.out.println("*********************************");
		//Pies	
		} else if (opcion == 2) {

			System.out.print("Ingrese la longitud a convertir: ");
			double F = scanner.nextDouble();
			double cm = F * 30.48;
			System.out.println("*********************************");
			System.out.println("La longitud de :"+F+ " pies es :" +cm+" centimetros" );
			System.out.println("*********************************");

		//Pulgadas
		} else if (opcion == 3) {

			System.out.print("Ingrese la longitud a convertir: ");
			double I = scanner.nextDouble();
			double cm = I * 2.54;
			System.out.println("*********************************");
			System.out.println("La longitud de :"+I+ " pulgadas es :" +cm+" centimetros" );
			System.out.println("*********************************");
		}
	}
}

			
				

