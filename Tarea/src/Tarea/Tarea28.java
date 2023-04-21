package Tarea;
import java.util.Scanner;
public class Tarea28 {

	/*Escriba un programa que lea dos números enteros como entrada y escriba el mensaje signos opuestos 
	 * si y solo si uno de los enteros es positivo y el otro negativo.*/ 
	public static void main (String[]args) {
		Scanner scanner = new Scanner(System.in);
		
		//Pedimos al usuario el valor de ambos numeros
		System.out.println("Ingrese el valor del primer numero");
		int x = scanner.nextInt();
		System.out.println("Ingrese el valor del segundo numero");
		int y = scanner.nextInt();
		
		//Realizamos operacion
		if (x>0 && y<0 || x<0 && y>0 ) {
			System.out.println("********************************************");
			System.out.println("     Los numeros tienen signos opuestos");
			System.out.println("********************************************");
			
		} else {
			System.out.println("********************************************");
			System.out.println("     Los numeros tienen signos iguales");
			System.out.println("********************************************");
			
		}
		
		
	}
}
