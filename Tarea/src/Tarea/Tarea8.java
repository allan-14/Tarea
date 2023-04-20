package Tarea;
import java.util.Scanner;
public class Tarea8 {

	//Calcular el área de un triángulo conociendo sus tres lados. 
	
	public static void main (String[]args) {
		Scanner scanner = new Scanner(System.in);
	
		//Pedimos al usuario que agregue el valor de los lados
		System.out.println("Agregue el valor de lado a");
		double a = scanner.nextDouble();
		System.out.println("Agregue el valor de lado b");
		double b = scanner.nextDouble();
		System.out.println("Agregue el valor de lado c");
		double c = scanner.nextDouble();
		
		//Realizamos operacion
		double P = a+b+c; //Perimetro
		double SP = P/2; //Semi_perimetro
	    double area = Math.sqrt(SP*(SP-a)*(SP-b)*(SP-c));
	    
		//Impresion de datos
		System.out.println("**************************************");
		System.out.println("El Perimetro del triangulo es: "+ P );
		System.out.println("El Area del triangulo es: " + area);
		System.out.println("**************************************");

	}
}
