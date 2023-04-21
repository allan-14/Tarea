package Tarea;
import java.util.Scanner;
public class Tarea57 {

	//Dado un número determinar la suma de sus dígitos. */
	public static void main (String[]args) {
	Scanner scanner = new Scanner(System.in);
	
	 // Pedir al usuario que ingrese el número
    Scanner input = new Scanner(System.in);
    System.out.print("Ingrese un número: ");
    int numero = input.nextInt();

    // Calcular la suma de los dígitos
    int suma = 0;
    while (numero != 0) {
        int digito = numero % 10;
        suma += digito;
        numero /= 10;
    }

    // Mostrar la suma de los dígitos
    System.out.println("La suma de los dígitos es: " + suma);
}
}

