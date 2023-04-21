package Tarea;
import java.util.Scanner;
public class Tarea34 {

	//Escriba un programa que lea “n” números enteros y que los imprima. 
	public static void main (String[]args) {
	     Scanner scanner = new Scanner(System.in);
	        System.out.print("Ingrese la cantidad de números a leer: ");
	        int n = scanner.nextInt();
	        int[] numeros = new int[n];
	        for (int i = 0; i < n; i++) {
	            System.out.print("Ingrese el número " + (i+1) + ": ");
	            numeros[i] = scanner.nextInt();
	        }
	        System.out.println("Los números ingresados son:");
	        for (int numero : numeros) {
	            System.out.println(numero);
	        }
	    }
	}