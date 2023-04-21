package Tarea;
import java.util.Scanner;
public class Tarea26 {

	/*Escriba un programa independiente para cada inciso considerando una lectura de distintos 
	 números tal como se detallan a continuación.  
	a) XY    b) XYZ     c) XYZW*/ 

	public static void main (String[]args) {
		Scanner scanner = new Scanner(System.in);
		
		//Preguntamos al usuario que lectura prefiera
		System.out.println("Ingrese con el numero correspondiente el inciso que desee efectuar");
		System.out.println("1) XY    2) XYZ     3) XYZW");
		int opt = scanner.nextInt();
		
		//Realizamos if junto con la operacion e impresion de datos
		if (opt == 1) {
			System.out.println("Ingrese el valor de X");
			double x = scanner.nextInt();
			System.out.println("Ingrese el valor de Y");
			double y = scanner.nextInt();
			double resultado = x *y ;
			
			System.out.println("***********************");
			System.out.println("Su resultado es : "+resultado);
			System.out.println("***********************");
			
		}else if (opt == 2){
			System.out.println("Ingrese el valor de X");
			double x = scanner.nextInt();
			System.out.println("Ingrese el valor de Y");
			double y = scanner.nextInt();
			System.out.println("Ingrese el valor de Z");
			double z = scanner.nextInt();
			double resultado = x *y*z ;
			
			System.out.println("***********************");
			System.out.println("Su resultado es : "+resultado);
			System.out.println("***********************");
			
		}else if (opt == 3){
			System.out.println("Ingrese el valor de X");
			double x = scanner.nextInt();
			System.out.println("Ingrese el valor de Y");
			double y = scanner.nextInt();
			System.out.println("Ingrese el valor de Z");
			double z = scanner.nextInt();
			System.out.println("Ingrese el valor de W");
			double w = scanner.nextInt();
			double resultado = x *y*z*w ;
			
			System.out.println("***********************");
			System.out.println("Su resultado es : "+resultado);
			System.out.println("***********************");
			
		}else {
			System.out.println("***********************************************");
			System.out.println("El dígito " +opt + " no está en las opciones" );
			System.out.println("***********************************************");
			
					
		}
	}
}
