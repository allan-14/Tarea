package Tarea;
import java.util.Scanner;
public class Tarea2 {
	

	public static void main (String[]args) {
	    Scanner scanner = new Scanner(System.in);
	/* Determinar el Perímetro de una circunferencia y el área de un círculo.*/
	
	//Pedimos el valor al usuario

	   
		System.out.print("Ingrese el radio del circulo");
		double R = scanner.nextDouble();
		
		//Calculamos el Perimetro y Area respectivamente
		
double Per = 2* Math.PI*R;

double Area = Math.PI*(R*R);

		// Imprimimos respuestas

		System.out.println("*********************************************");
		System.out.println("El valor del Perímetro de la circuferencia es: " +Per);
		System.out.println("El valor del Area de la circuferencia es: " +Area);
		System.out.println("*********************************************");
	}
}
