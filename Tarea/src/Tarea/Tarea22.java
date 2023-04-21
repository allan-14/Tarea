package Tarea;
import java.util.Scanner;
public class Tarea22 {

	/*Escribir un programa para calcular el interés de una capital conforme a la siguiente condición. 
	 * Si el capital prestado es mayor que 10,000 dólares entonces la tasa es del 7% en caso contrario del 6%, 
	 * debe imprimir el capital y su interés.*/ 
	 	public static void main (String[]args) {
		Scanner scanner = new Scanner(System.in);
		
		//Pedimos al usuario el capital que prestara
		
		System.out.println("Ingrese el capital de cuanto desea prestar");
		double capital = scanner.nextDouble();
		
		//Realizamos un if, de paso la operacion e imprimimos los datos
		if (capital > 10000) {
			double tasa1 = 0.7;
			double interes = capital * tasa1;
			System.out.println("******************************************************************************************************************");
			System.out.println("Su capital es de : " +capital+ " Por lo tanto el interés es del 7% lo que significa que corresponde a : " +interes);
			System.out.println("******************************************************************************************************************");
						
		} else {
					
			double tasa2 = 0.6;
			double interes = capital * tasa2;
			System.out.println("******************************************************************************************************************");
			System.out.println("Su capital es de : " +capital+ " Por lo tanto el interés es del 6% lo que significa que corresponde a : " +interes);
			System.out.println("******************************************************************************************************************");
			
		}
		
	}
}
