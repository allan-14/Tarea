package Tarea;
import java.util.Scanner;
public class Tarea48 {

	/*48.	Dado un arreglo Bidimensional de orden “N” escriba un programa por cada inciso que determine: 
a)	Que lea el arreglo y lo imprima en el orden dado. 
b)	Que imprima los elementos que están sobre la diagonal principal. 
c)	Que imprima los elementos que están encima de la diagonal principal. 
d)	Que imprima los elementos que están por debajo y sobre la diagonal principal.*/ 
	public static void main (String[]args) {
		Scanner scanner = new Scanner(System.in);

		        // Pedir al usuario que ingrese el valor de N
		        System.out.print("Ingrese el valor de N: ");
		        int N = scanner.nextInt();

		        // Definir el arreglo bidimensional de orden N
		        int[][] arreglo = new int[N][N];

		        // Pedir al usuario que ingrese los valores del arreglo
		        System.out.println("Ingrese los valores del arreglo:");
		        for (int i = 0; i < N; i++) {
		            for (int j = 0; j < N; j++) {
		                arreglo[i][j] = scanner.nextInt();
		            }
		        }

		        // a) Imprimir el arreglo en el orden dado
		        System.out.println("Arreglo en el orden dado:");
		        for (int i = 0; i < N; i++) {
		            for (int j = 0; j < N; j++) {
		                System.out.print(arreglo[i][j] + " ");
		            }
		            System.out.println();
		        }

		        // b) Imprimir los elementos sobre la diagonal principal
		        System.out.println("Elementos sobre la diagonal principal:");
		        for (int i = 0; i < N; i++) {
		            for (int j = i; j < N; j++) {
		                System.out.print(arreglo[i][j] + " ");
		            }
		        }
		        System.out.println();

		        // c)Imprimir los elementos encima de la diagonal principal
		        System.out.println("Elementos encima de la diagonal principal:");
		        for (int i = 0; i < N; i++) {
		            for (int j = 0; j < i; j++) {
		                System.out.print(arreglo[i][j] + " ");
		            }
		        }
		        System.out.println();

		        // d) Imprimir los elementos por debajo y sobre la diagonal principal
		        System.out.println("Elementos por debajo y sobre la diagonal principal:");
		        for (int i = 0; i < N; i++) {
		            for (int j = 0; j < N; j++) {
		                if (i == j || i < j) {
		                    System.out.print(arreglo[i][j] + " ");
		                }
		            }
		        }
		        System.out.println();
		    }
	

		
	}
}
