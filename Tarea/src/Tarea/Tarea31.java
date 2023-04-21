package Tarea;
import java.util.Scanner;
public class Tarea31 {

	/*Un triángulo es equilátero si posee sus tres lados iguales, es Isósceles si tiene solamente dos lados iguales 
	y es escaleno cuando todos sus lados son desiguales. Escribir un programa que lea las dimensiones de los lados 
	del triángulo y presente como salida el mensaje de su clasificación de triangulo.*/
	
	public static void main (String[]args) {
		Scanner scanner = new Scanner(System.in);
		
		//Pedimos los datos al usuario usando do-while para que no agregue numeros negativos
		double a,b,c;
		do {
		System.out.println("Ingrese lado a del triangulo");
		a = scanner.nextDouble();
		} while (a<0);
		do {
		System.out.println("Ingrese lado b del triangulo");
		b = scanner.nextDouble();
		} while (b<0);
		do {
		System.out.println("Ingrese lado c del triangulo");
		c = scanner.nextDouble();
		} while (c<0);
		
		//Realizamos if para imprimir que tipo de traingulo es 
		if (a==b && b==c) {
			
			System.out.println("******************************");
			System.out.println("El triangulo es equilatero");
			System.out.println("******************************");
			
		} else if (a==b && a!=c || a == c && a!=b || b==c && a!=c){ 
			System.out.println("******************************");
			System.out.println("El triangulo es isosceles");
			System.out.println("******************************");
			
		}else if (a != b && b != c) {
			System.out.println("******************************");
			System.out.println("El triangulo es escaleno");
			System.out.println("******************************");
			
			
		}
	}
}
