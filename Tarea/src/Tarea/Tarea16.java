package Tarea;
import java.util.Scanner;
public class Tarea16 {

	/*Determinar las soluciones de N sistema de ecuaciones lineales 
	  con dos incógnitas aplicando el método de Cramer.  
	 * ax + by = c dx + ey = f Donde a,b,c,e,f son números reales. */ 

	public static void main (String[]args) {
		Scanner scanner = new Scanner(System.in);
		
		//Pedimos el valor al usuario
		System.out.print("Ingrese el valor de a: ");
		double a = scanner.nextDouble();
		System.out.print("Ingrese el valor de b: ");
		double b = scanner.nextDouble();
		System.out.print("Ingrese el valor de c: ");
		double c = scanner.nextDouble();
		System.out.print("Ingrese el valor de d: ");
		double d = scanner.nextDouble();
		System.out.print("Ingrese el valor de e: ");
		double e = scanner.nextDouble();
		System.out.print("Ingrese el valor de f: ");
		double f = scanner.nextDouble();
		
		//Realizamos la operacion
		//a)Determinante del sistema
		double detS = a*e - b*d;
		
		//b)Determinante de x
		double detx = c*e - b*f;
		
		//c)Determinate de y
		double dety = a*f - c*d;
		
		//Valor de X y Y
		double x = detx / detS;
		double y = dety / detS;
		
			
		//Impresion de datos
		System.out.println("********************************");
		System.out.println("El determinante del Sistema es: "+detS);
		System.out.println("El determinante de x es: "+detx);
		System.out.println("El determinante de y es: "+dety);
		System.out.printf("La respuesta es ("+x+","+y+") (x,y)");
		System.out.println("********************************");
	}
	
}
