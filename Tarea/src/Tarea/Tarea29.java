package Tarea;
import java.util.Scanner;
public class Tarea29 {

	/*Escriba un programa que lea dos números enteros positivos distintos y escriba la diferencia 
	 * entre el mayor y el menor. Asegúrese que su programa escriba 
	 * por ejemplo 8 si los números son 10 y 2 o bien 2 y 10.*/ 

	public static void main (String[]args) {
		Scanner scanner = new Scanner(System.in);
		
		//Pedimos al usuario los numeros (Usamos do-while para asegurarnos que los numeros sean distintos)
		int x,y;
		do {
		System.out.println("Ingrese el valor del primer numero");
		x = scanner.nextInt();
		System.out.println("Ingrese el valor del segundo numero (distinto al primero)");
		y = scanner.nextInt();
		}while (x==y);
		
		//Realizamos operacion
		int dif = Math.abs(x-y);
		
		//Impresion de datos
		System.out.println("*******************************************************");
		System.out.println("     La diferencia de los numeros es de : " +dif);
		System.out.println("*******************************************************");
		
	}
}
