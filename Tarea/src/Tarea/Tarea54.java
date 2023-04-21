package Tarea;
import java.util.Scanner;
public class Tarea54 {

	/*Elaborar un programa que permita leer N números desde el teclado y calcule la media aritmética(promedio). */
	public static void main (String[]args) {
		Scanner input = new Scanner(System.in);
		
		//Pedimos los datos al usuario
		System.out.println("Agregue la cantidad de numeros a introducir");
        int N = input.nextInt();

        // Declarar un arreglo para almacenar los números
        double[] numeros = new double[N];

        // Pedir al usuario que ingrese los números y almacenarlos en el arreglo
        for (int i = 0; i < N; i++) {
            System.out.print("Ingrese el número " + (i+1) + ": ");
            numeros[i] = input.nextDouble();
        }

        // Calcular la suma de los números
        double suma = 0;
        for (int i = 0; i < N; i++) {
            suma += numeros[i];
        }

        // Calcular la media aritmética (promedio) y mostrar el resultado
        double media = suma / N;
        System.out.println("La media aritmética es: " + media);
    }
}


