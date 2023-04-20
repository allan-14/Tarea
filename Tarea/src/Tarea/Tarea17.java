package Tarea;
import java.util.Scanner;
public class Tarea17 {

	/*Determinar la energía total que almacena un cuerpo si su energía 
	cinética es ½ de la masa por su velocidad al cuadrado y la energía 
	potencial es el producto de la masa, altura y la constante de gravedad. 
	Recuerde que ET = EC +EP.*/
	
	public static void main (String[]args) {
		Scanner scanner = new Scanner(System.in);
		
		//Pedimos al usuario los datos
		System.out.println("Ingrese el valor de la masa");
		double m = scanner.nextDouble();
		System.out.println("Ingrese el valor de la velocidad");
		double v = scanner.nextDouble();
		System.out.println("Ingrese el valor de la altura");
		double h = scanner.nextDouble();
		
		double g = 9.8; //constante de gravedad en la tierra
		
		//Realizamos la operación
		//Energía Cinetica
		double EC = (m * Math.pow(v, 2))/2;
		
		//Energía Potencial
		double EP = m * h * g;  
		
		//Energía Total
		double ET = EC + EP;

		//Impresion de datos
		System.out.println("**********************************");
		System.out.println("La energía cinética es de: "+EC);
		System.out.println("La energía potencial es de: "+EP);
		System.out.println("La energía total es de: "+ET);
		System.out.println("**********************************");
	}
	
}
