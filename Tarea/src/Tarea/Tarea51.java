package Tarea;
import java.util.Scanner;
public class Tarea51 {

	//Diseñar un programa para averiguar su un número digitado por el usuario es primo. 
	public static void main (String[]args) {
		Scanner scanner = new Scanner (System.in);
		
		System.out.println("Ingrese un numero");
		int n = scanner.nextInt();
		
        boolean esPrimo = true;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                esPrimo = false;
                break;
            }
        }
        
        // Imprimir resultado
        if (esPrimo) {
            System.out.println(n + " es un número primo");
        } else {
            System.out.println(n + " no es un número primo");
        }
    }

		
	}
