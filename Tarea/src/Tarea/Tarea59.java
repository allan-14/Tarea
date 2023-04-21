package Tarea;
import java.util.Scanner;
public class Tarea59 {

	/*Escribir un programa para averiguar si un número digitado por el usuario es perfecto. Un número es perfecto
	 *  si la suma de sus divisores distintos de el mismo es igual a este. Ejemplo: 6= 1+2+3. */
	public static void main (String[]args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Ingrese un número: ");
        int numero = input.nextInt();

        // Calcular la suma de los divisores del número
        int suma = 0;
        for (int i = 1; i < numero; i++) {
            if (numero % i == 0) {
                suma += i;
        }
        }
        // Verificar si el número es perfecto o no
        if (suma == numero) {
            System.out.println(numero + " es un número perfecto.");
        } else {
         System.out.println(numero + " no es un número perfecto.");
    }
    }
}