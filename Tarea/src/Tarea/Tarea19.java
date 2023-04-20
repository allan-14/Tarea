package Tarea;
import java.util.Scanner;
public class Tarea19 {

	/*Escriba un programa que lea la edad de una persona e imprima es votante dado que tiene 16 o 
	 * más años de edad.*/ 
	
	public static void main (String[]args) {
		Scanner scanner = new Scanner(System.in);
	
		//Pedimos la edad al usuario
		System.out.println("Ingrese su edad");
		int edad = scanner.nextInt();
		
		if (edad >=16) {
			System.out.println("*********************************************");
		System.out.println("Es votante dado que tiene 16 o mas años de edad");
		System.out.println("*********************************************");
		
	}else {		
		System.out.println("*********************************************");
		System.out.println("Usted no es votante ya que es menor de 16 años");
		System.out.println("*********************************************");
	}
}
}