package Tarea;
import java.util.Scanner;
public class Tarea10 {

	/*Determine el valor de la fuerza de un cuerpo que tiene por masa “M”
	y aceleración “A”.*/ //F = ma
	
	public static void main (String[]args) {
		Scanner scanner = new Scanner(System.in);
		
		//Pedimos al usuario que agregue los datos 
		System.out.println("Ingrese el valor de Masa");
		double m = scanner.nextDouble();
		System.out.println("Ingrese el valor de Aceleración");
		double a = scanner.nextDouble();
		
		//Realizamos la operación
		double f = m*a; //fuerza
		
		//Impresion de datos
		System.out.println("***************************************");
		System.out.println("El valor de la Fuerza es de: "+f);
		System.out.println("***************************************");
	}
}
