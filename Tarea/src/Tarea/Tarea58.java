package Tarea;
import java.util.Scanner;
public class Tarea58 {

	/*Hacer un programa que registre 20 números en un array de una dimensión y muestre posteriormente los elementos 
	 * que contienen números múltiplos de 5. */
	
	public static void main (String[]args) {
        Scanner input = new Scanner(System.in);
		
	       // Declarar un array de una dimensión con 20 elementos
        int[] numeros = new int[20];

        // Pedir al usuario que ingrese los 20 números
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Ingrese el número " + (i+1) + ": ");
            numeros[i] = input.nextInt();
        }

        // Mostrar los elementos que contienen múltiplos de 5
        System.out.println("Elementos que contienen múltiplos de 5:");
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] % 5 == 0) {
                System.out.println(numeros[i]);
            }
        }
    }


	}

