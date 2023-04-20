package Tarea;
import java.util.Scanner;
public class Tarea4 {

	public static void main (String[]args) {
		
		Scanner scanner = new Scanner(System.in);
		
		//Determine la raíz Cuadrada de un número cualquiera.
//srqrt		
	    //Procedemos a pedir el valor a sacar la raiz cuadrada
		
		System.out.println("Ingrese el numero que quiera conocer su raíz cuadrada");
		double x = scanner.nextDouble();
		
		//Procedemos a sacar raiz
		
		double rx = Math.sqrt(x);
		
		System.out.println("La raiz cuadrada de su numero es " +rx);
	}
}
