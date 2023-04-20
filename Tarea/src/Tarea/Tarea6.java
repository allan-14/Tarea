package Tarea;
import java.util.Scanner;
public class Tarea6 {
	
	public static void main (String[]args) {
		Scanner scanner = new Scanner(System.in);
		
		//Convertir N kilogramos a Libras.
		
		//Pedimos al usuario la cantidad que quiera convertir
		
		System.out.println("Ingrese la cantidad en Kilogramos para convertir a libras");
		double K = scanner.nextDouble();
		double L = K*2.20;
		
		System.out.println("******************************************");
        System.out.println(K + " kilogramos son " + L + " libras");
        System.out.println("******************************************");
	}
}