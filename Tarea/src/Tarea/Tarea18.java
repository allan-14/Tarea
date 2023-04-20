package Tarea;
import java.util.Scanner;
public class Tarea18 {

	/*Leer un número de tres cifras e imprimirlo en orden invertido
	 *  Ejemplo Entrada: 567   Salida 765.*/ 
	public static void main (String[]args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número de tres cifras: ");
        int numero = scanner.nextInt();

        int pri = numero / 100;      // Primera cifra
        int segundo = (numero / 10) % 10; // Segunda cifra
        int tercero = numero % 10;       // Tercera cifra

        System.out.printf("El número invertido es: %d%d%d\n", tercero, segundo, pri);
    }
}

