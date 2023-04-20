package Tarea;
import java.util.Scanner;
public class Tarea20 {

	//Escriba un programa que lea un número cualquiera e imprima si es par o impar. 
	public static void main (String[]args) {
		Scanner scanner = new Scanner(System.in);
		
		//Pedimos al usuario el numero
		System.out.println("Ingrese un numero");
		int x = scanner.nextInt();
		
		
		if (x % 2 == 0) {
			System.out.println("*********************************");
			System.out.println("El numero " +x+ " es par");
			System.out.println("*********************************");
			
			
		} else { 
			System.out.println("*********************************");
			System.out.println("El numero " +x +  " es impar");
			System.out.println("*********************************");
		}
	}
	
}
