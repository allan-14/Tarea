package Tarea;
import java.util.Scanner;
public class Tarea41 {

	//Calcule e imprima el producto de “N” números. 
	public static void main (String[]args) {
		Scanner scanner = new Scanner(System.in);
		
		//Pedimos valor
		System.out.println("Ingrese cuantos numeros agregara");
		int n = scanner.nextInt();
		int[] numeros = new int [n];
		
		for (int i = 0; i < n; i++) {
            System.out.print("Ingrese el número " + (i+1) + ": ");
            numeros[i] = scanner.nextInt();
      	}
		int producto = 1;
		for (int res:numeros) {
			producto = producto * res;
		}
		System.out.println("******************************************************");
		System.out.println("El producto de los "+n+" agregados es de: "+producto);
		System.out.println("******************************************************");
		}
}
