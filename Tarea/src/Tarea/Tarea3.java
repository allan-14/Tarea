package Tarea;
import java.util.Scanner;
public class Tarea3 {

	public static void main (String[]args) {
		/*Determine el valor de Y= X*C-2 donde C es una constante con valor C=2.5. 
	*/

		Scanner scanner = new Scanner(System.in);
		
		double C = 2.5;
		
		//a)Considerando que x=2
		double x =2;
		double y1 = x*C-2;
		
		System.out.println("****************************************");
		System.out.println("El valor de Y cuando X es = 2 es: "+y1);
		System.out.println("****************************************");
		
		//b)Considerando a X un valor cualquiera. 
		//Pedimos el valor de X
		System.out.println("Si quiere calcular Y con otro numero, Ingrese el nuevo valor de X");
		double X = scanner.nextDouble();
		
		double Y = X*C-2;
		
		System.out.println("****************************************");
		System.out.println("El valor de Y es: "+Y);
		System.out.println("****************************************");
		
	}
}
	