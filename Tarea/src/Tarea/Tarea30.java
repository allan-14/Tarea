package Tarea;
import java.util.Scanner;
public class Tarea30 {

	/*	Escriba un programa que tenga como entrada la lectura de dos números llamados “X” y “Y” 
	 * y que imprima una salida que corresponda a cada uno de los pares.*/ 
	public static void main (String[]args) {
		Scanner scanner = new Scanner(System.in);
		
		//Pedimos al usuario los numeros
				System.out.println("Ingrese el valor del primer numero");
				double x = scanner.nextInt();
				System.out.println("Ingrese el valor del segundo numero");
				double y = scanner.nextInt();
				
			//(-X, -Y) Entonces sumar los cuadrados de cada componente. 
					 if (x%2 != 0 && y%2 != 0){
					double resultado = Math.pow(x, 2)+ Math.pow(y, 2);
					System.out.println("***********************************");
					System.out.println("El resultado es: "+resultado);
					System.out.println("***********************************");
					
				//(X, -Y) Entonces dividir X entre Y 
				} else if (x%2 == 0 && y%2 != 0){
					double resultado = x/y;
					System.out.println("***********************************");
					System.out.println("El resultado es: "+resultado );
					System.out.println("***********************************");
					
				//(-X, Y) Entonces restar al valor Y el valor de X. 
				} else if (x%2 != 0 && y%2 == 0){
					double resultado = y - x;
					System.out.println("***********************************");
					System.out.println("El resultado es: "+resultado);
					System.out.println("***********************************");		
					
					/*(X, Y) Entonces verificar si X es mayor que Y, si es así 
					sumarle a X el valor de Y, si no obtener la raíz cuadrada de X. */
				} else if (x%2 == 0 && y%2 == 0) {
						if (x>y) {
							double resultado = x+y;
							System.out.println("***********************************");
							System.out.println("El resultado es: "+resultado);
							System.out.println("***********************************");
								
						}else {
							double resultado = Math.sqrt(x);
							System.out.println("***********************************");
							System.out.println("El resultado es: "+resultado);
							System.out.println("***********************************");
			
	
	}
	}
	}}