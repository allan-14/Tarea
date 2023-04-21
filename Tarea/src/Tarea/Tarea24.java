package Tarea;
import java.util.Scanner;
public class Tarea24 {

	/*Escriba un programa que lea un numero A, si A es un número positivo calcule Y=2^A, 
	 * si es negativo calcule Y=A+5 imprimir el resultado de Y.*/ 
		public static void main (String[]args) {
		Scanner scanner = new Scanner(System.in);

		//Pedimos al usuario el valor de A
		System.out.println("Ingrese el valor de A");
		double A = scanner.nextDouble();
		
		//Procedemos con un if, realizando operacion e imprimiendo datos
		if (A >0 ) {
			double y = Math.pow(2, A);
			System.out.println("*********************************************************");
			System.out.println("Dado a que es un numero positivo, el valor de Y es : "+y);
			System.out.println("*********************************************************");
					
		}else { 
			double y = A + 5;
			System.out.println("*********************************************************");
			System.out.println("Dado a que es un numero negativo, el valor de Y es : "+y);
			System.out.println("*********************************************************");
			
		}
	}
}
