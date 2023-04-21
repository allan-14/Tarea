package Tarea;
import java.util.Scanner;
public class Tarea21 {
	
	/*Escriba un programa que lea un número que verifique si X es negativo que calcule X^4 
	en caso contrario que calcule X^2.*/
		public static void main (String[]args) {
		Scanner scanner = new Scanner(System.in);
		
		//Pedimos al usuario que agregue el valor de x
		System.out.println("Ingrese el valor de X");
		double x = scanner.nextDouble();
		
		if (x < 0) {
			double opt1 = Math.pow(x, 4);
			System.out.println("***************************************************");
			System.out.println("El valor de X cuando es negativo corresponde a :" +opt1);
			System.out.println("***************************************************");
			
		} else {
			double opt2 = Math.pow(x, 2);
			System.out.println("***************************************************");
			System.out.println("El valor de X cuando es positivo corresponde a : " +opt2);
			System.out.println("***************************************************");
			
		}
		
	}
}
