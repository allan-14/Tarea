package Tarea;
import java.util.Scanner;
public class Tarea9 {

	//Calcular el volumen de un cilindro conociendo su radio y altura. 
	public static void main (String[]args) {
		Scanner scanner = new Scanner(System.in);
		

		//Pedimos al usuario los datos 
		System.out.println("Ingrese el valor de Radio del cilindro");
		double r = scanner.nextDouble();
		System.out.println("Ingrese el valor de la Altura del cilindro");
		double h = scanner.nextDouble();
		
		//Realizamos la operacion 		//π r² h,
		double Volumen = Math.PI * Math.pow(r, 2)* h;
		
		//Impresion de datos 
		System.out.println("********************************");
		System.out.println("El Volumen del Cilindro es :"+ Volumen);
		System.out.println("********************************");
	}
	
}
