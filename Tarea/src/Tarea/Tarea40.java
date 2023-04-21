package Tarea;
import java.util.Scanner;
public class Tarea40 {

	//Escribir un programa que calcule la factorial de un número entero. 
	public static void main (String[]args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Numero a calcular su factorial");
		int n = scanner.nextInt();
		int factorial = 1;
		for(int i=1; i<=n; i++) {
            factorial = factorial * i;
	}
		System.out.println("*********************************************");
		System.out.println("El factorial de: "+n+ " es: " +factorial);
		System.out.println("*********************************************");
}
}
