package Tarea;
import java.util.Scanner;
public class Tarea50 {

	//Escribir un programa para averiguar todos los divisores de un número digitado por el usuario. 
	public static void main (String[]args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Agregue un numero");
		int n = scanner.nextInt();
		
		System.out.println("Los divisores de: " +n+ " son: ");
		
		for(int i=1; i<n; i++) {
			if (n%i==0) {
				System.out.print(i+ ",");
			}
		}
		
		
	}
}
