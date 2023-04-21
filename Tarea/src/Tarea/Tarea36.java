package Tarea;
import java.util.Scanner;
public class Tarea36 {

	//Escriba un programa que lea “n” números que calcule su suma y su promedio. 
	public static void main (String[]args) {
		Scanner scanner = new Scanner(System.in);
		
		//Pedimos al usuario cuantas notas agregara
		System.out.println("Ingrese la cantidad de notas que agregará");
		int cntN = scanner.nextInt();//Cantidad de notas
		
		/*Creamos un ciclo for para que el usuario agregue la cantidad de notas 
		que quiere trabajar */
		double suma = 0;
		for (int i=1; i<=cntN; i++ ) {
			System.out.println("Ingrese la nota " +i );
			double notas = scanner.nextDouble();
		      suma = suma + notas;
		}
		 //Operacion para el promedio
		double pro = suma / cntN;
		
		//Impresión de datos
		System.out.println("****************************************");
		System.out.println("El promedio de las notas agregadas es de: " +pro);
		System.out.println("****************************************");
	
}		
		
	}

