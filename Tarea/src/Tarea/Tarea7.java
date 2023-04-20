package Tarea;
import java.util.Scanner;
public class Tarea7 {
	
	/*Convertir X grados Fahrenheit a grados Celsius. 
	Celsius= 5/9 (Fahrenheit -323).*/

	public static void main (String[]args) {
		Scanner scanner = new Scanner(System.in);
		
		//Pedir al usuario el valor de X
		System.out.println("Ingrese el grado farenheit que desee convertir.");
		double F = scanner.nextDouble();
		
		//Procedemos con la operacion
		double C = (F - 32)*5 / 9; 
		
		//Impresion de datos
		System.out.println("****************************************");
		System.out.println(F+ " Equivale a " + C + " grado Celsius");
		System.out.println("****************************************");
	}
}

//(32 °F − 32) × 5/9 =  °C
