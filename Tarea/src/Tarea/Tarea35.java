package Tarea;
import java.util.Scanner;
public class Tarea35 {

	//Escriba un programa que lea tres números cualesquiera y que calcule la suma de ellos y su promedio. 
	public static void main (String[]args) {
		Scanner scanner = new Scanner(System.in);

//Pedimos los datos
		System.out.println("Ingrese nota 1");
		double nota1 = scanner.nextDouble();
		System.out.println("Ingrese nota 2");
		double nota2 = scanner.nextDouble();
		System.out.println("Ingrese nota 3");
		double nota3 = scanner.nextDouble();
		
		//Realizamos operacion e impresion de datos
		double suma = nota1+nota2+nota3;
		double promedio = suma/3;
		
		System.out.println("***************************************");
		System.out.println("La suma de los datos es : "+suma);
		System.out.println("El promedio de los datos es: "+promedio);
		System.out.println("***************************************");
	}
}
