package Tarea;
import java.util.Scanner;
public class Tarea56 {

	/*Hacer un programa que registre 20 números en un array de una dimensión y muestre posteriormente
	 *  los elementos que contienen números múltiplos de 3. */
	
	public static void main (String[]args) {
		Scanner scanner = new Scanner(System.in);
		
		   // Crear un arreglo para almacenar los números
        int[] numeros = new int[20];

        // Pedir al usuario que ingrese los números y almacenarlos en el arreglo
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < 20; i++) {
            System.out.print("Ingrese el número " + (i+1) + ": ");
            numeros[i] = input.nextInt();
        }

        // Mostrar los elementos que contienen números múltiplos de 3
        System.out.print("Los elementos que contienen números múltiplos de 3 son: ");
        for (int i = 0; i < 20; i++) {
            if (numeros[i] % 3 == 0) {
                System.out.print(numeros[i] + " ");
            }
        }
    }
}