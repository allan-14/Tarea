package Tarea;
import java.util.Scanner;
public class Tarea44 {

	/*Dada la edad de una persona escriba un programa que imprima “niño” si la edad es menor que 13 “joven” 
	 * si la edad es mayor que 13 y menor o igual 25 y “adulto” si la edad es mayor que 25. */
	public static void main (String[]args) {
	Scanner scanner = new Scanner(System.in);
	
	int edad;
	do {
		System.out.println("Ingrese su edad");
		edad= scanner.nextInt();
	}while (edad<0);
	
	if (edad<13) {
		System.out.println("********************");
		System.out.println("        Niño");
		System.out.println("********************");
		
	}else if (edad<=25){
		System.out.println("********************");
		System.out.println("        Joven");
		System.out.println("********************");
		
	}else{
		System.out.println("********************");
		System.out.println("        Adulto");
		System.out.println("********************");
		}
	}
}

