package Tarea;
import java.util.Scanner;
public class Tarea14 {

	/*Determinar la solución lineal que tiene la forma 
	ax + b =0 donde a y b son números reales.*/ 
	public static void main (String[]args) {
	Scanner scanner = new Scanner (System.in);
		
		//Pedimos al usuario los valores
		System.out.println("Ingrese el valor de a");
		   double a = scanner.nextDouble();
			System.out.println("Ingrese el valor de b");
			   double b = scanner.nextDouble();
	        double x = -b/a;
	        
	        System.out.println("La solucion lineal es: x = " +x);
	    }
	}