package Tarea;
import java.util.Scanner;
public class Tarea25 {

	//Escribir un programa que lea un número cualquiera e imprima si el número leído es divisible por tres. 

	public static void main (String[]args) {
		Scanner scanner = new Scanner(System.in);
		
		//Pedimos al usuario el dato
		System.out.println("Ingrese un numero");
		double n = scanner.nextDouble();
		
		//Realizamos un if, e imprimimos resultado
		if (n %3 == 0 ) {
			System.out.println("******************************************");
			System.out.println("El valor: " +n+ " es divisible entre 3");
			System.out.println("******************************************");
			
		}else {
			System.out.println("******************************************");
			System.out.println("El valor: " +n+ " no es divisible entre 3");
			System.out.println("******************************************");
			
		}
		
	}
}
