package Tarea;
import java.util.Scanner;
public class Tarea11 {

	 //Obtener el valor del Coseno de un número cualquiera.
	public static void main (String[]args) {
		 Scanner scanner = new Scanner (System.in);
		 
		 //Pedimos a usuario el valor 
		 System.out.println("Ingrese el número para obtener su valor en coseno");
		 double x = scanner.nextDouble();
		 
		 //Realizamos operación
		 double cos = Math.cos(x);
		 
		 //Impresión de datos
		 System.out.println("****************************************");
		 System.out.println("El valor en coseno de: " +x + " es de: " + cos);
		 System.out.println("****************************************");
	}
}
