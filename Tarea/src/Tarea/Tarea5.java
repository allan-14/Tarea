package Tarea;
import java.util.Scanner;
public class Tarea5 {

public static void Main (String[]args) {
		
		Scanner scanner = new Scanner(System.in);
		
	//Evaluar la Función Y= 5X^4 + 2X^3 + 3X^2 + 7 para el valor de  
	 
	 
		
	//a) Considerando	x=1;*/
	
	double x1 = 1;
	double y1 = 5*Math.pow(x1, 4)+2*Math.pow(x1, 3)+3*Math.pow(x1, 2)+7;
	
	System.out.println("****************************************");
	System.out.println("Cuando X = 1, Y ="+y1);
	System.out.println("****************************************");
	
	//b) Considerando X un número cualquiera.
		
	System.out.println("Si quiere calcular  con otro numero, Ingrese el nuevo valor de X");
	
		//Pedimos el valor "x" al usuario
		
	
		System.out.println("Ingrese el valor de X");
		double x = scanner.nextDouble();
		
		// Realizamos operacion
		double y = 5*Math.pow(x, 4)+2*Math.pow(x, 3)+3*Math.pow(x, 2)+7;
		
		System.out.println("****************************************");
		System.out.println("Cuando X ="+x);
		System.out.print("Y ="+y);
		System.out.println("****************************************");

	}
}
