package Tarea;
import java.util.Scanner;
public class Tarea55 {
	
		/*Hacer un programa que registre 20 números en un array de una dimensión y muestre posteriormente 
		 * los elementos que ocupan posiciones impares. */
	public static void main (String[]args) {
		Scanner scanner = new Scanner(System.in);
		
        // crear un arreglo para almacenar los números
		        int[] numeros = new int[20];

		        // pdir al usuario que ingrese los números y almacenarlos en el arreglo
		        Scanner input = new Scanner(System.in);
		        for (int i = 0; i < 20; i++) {
		            System.out.print("Ingrese el número " + (i+1) + ": ");
		            numeros[i] = input.nextInt();
		        }

		        //mostrar los elementos que ocupan posiciones impares
		        System.out.print("Los elementos que ocupan posiciones impares son: ");
		        for (int i = 1; i < 20; i += 2) {
		            System.out.print(numeros[i] + " ");
		        }
		
		}

	}

