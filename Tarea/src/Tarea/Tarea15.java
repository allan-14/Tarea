package Tarea;
import java.util.Scanner;
public class Tarea15 {

	//Determinar el valor del determinante de segundo orden. 
	public static void main (String[]args) {
		Scanner scanner = new Scanner(System.in);
		
		//Pedimos al usuario los valores
		System.out.print("Ingrese el valor de a: ");
		double a = scanner.nextDouble();
		System.out.print("Ingrese el valor de b: ");
		double b = scanner.nextDouble();
		System.out.print("Ingrese el valor de c: ");
		double c = scanner.nextDouble();
		System.out.print("Ingrese el valor de d: ");
		double d = scanner.nextDouble();
		
		//Realizamos la operacion usando de referencia 	ad-bc
		double det2 = a*d - b*c;
		
		//Impresion de datos
		System.out.println("***************************************************************");
		System.out.println("El determinante en segundo order de los valores agredados es: "+det2);
		System.out.println("***************************************************************");
				
	}
}
