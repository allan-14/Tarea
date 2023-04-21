package Tarea;
import java.util.Scanner;
public class Tarea23 {

	/*Escribir un programa que lea la calificación de un alumno e imprima el mensaje de aprobado 
	si su calificación es mayor o igual a 60, en caso contrario imprima reprobado.*/ 
	public static void main (String[]args) {
		Scanner scanner = new Scanner(System.in);
		
		//Pedimos la informacion al usuario
		System.out.println("Por favor ingrese la nota del alumno");
		double nota = scanner.nextDouble();
		
		//Realizamos un if e impresion de datos
		if (nota >= 60) {
			System.out.println("***************************************");
			System.out.println("       Este alumno ha aprobado");
			System.out.println("***************************************");
			
		}else { 
			System.out.println();
			System.out.println("***************************************");
			System.out.println("       Este alumno ha reprobado");
			System.out.println("***************************************");
			
		}
	}
	
}
