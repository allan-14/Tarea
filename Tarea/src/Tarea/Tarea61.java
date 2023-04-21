package Tarea;
import java.util.Scanner;
public class Tarea61 {

	/*Elabore un programa que calcule los 20 primeros números de la serie de Fibonacci: 0,1,1,2,3,5,8,13, 
	 * Esta serie empieza con 0 y 1 y tiene la propiedad que cada número Fibonacci subsecuente es la suma 
	 * de dos números Fibonacci previos. */
	public static void main (String[]args) {
        int[] fib = new int[20]; // arreglo para almacenar los números Fibonacci
        fib[0] = 0; // primer número Fibonacci
        fib[1] = 1; // segundo número Fibonacci

        // calcular los siguientes 18 números Fibonacci
        for (int i = 2; i < fib.length; i++) {
            fib[i] = fib[i-1] + fib[i-2]; // sumar los dos números anteriores
        }

        // imprimir los números Fibonacci
        System.out.println("Los primeros 20 números de la serie de Fibonacci son:");
        for (int i = 0; i < fib.length; i++) {
            System.out.print(fib[i] + " ");
        }
    }

}
