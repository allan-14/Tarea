package Tarea;
import java.util.Scanner;
public class Tarea32 {

	/*Las calificaciones de los alumnos en un instituto son consideradas de la siguiente forma
	 Escriba un programa que considere la entrada de nota en número e imprima su codificación en letra.
	 	/*A es 90 o más. 
		b)	B es al menos 80 pero menos de 90. 
		c)	C es al menos 70 pero menos de 80. 
		d)	D es al menos 65 pero menos de 70. 
		e)	E es menos de 65.*/ 
	public static void main (String[]args) {
		Scanner scanner = new Scanner(System.in);
		
	//Pedimos al usuario que ingrese la nota, con do while para que no de numero negativo
		int nota;
		do {
		System.out.println("Ingrese la nota del estudiante ");
		nota = scanner.nextInt();
		}while (nota < 0);
		
			if (nota >=90) {
				System.out.println("***********************");
				System.out.println("La nota es A");
				System.out.println("***********************");
			
			}else if (nota >=80 && nota <	90) {
			System.out.println("***********************");
			System.out.println("La nota es B");
			System.out.println("***********************");
	
			}else if(nota >=70 && nota <80){
			System.out.println("***********************");
			System.out.println("La nota es C");
			System.out.println("***********************");
			
			}else if(nota >=65 && nota<70){
			System.out.println("***********************");
			System.out.println("La nota  es D");
			System.out.println("***********************");

			}else if(nota >65){
			System.out.println("***********************");
			System.out.println("La nota  es E");
			System.out.println("***********************");

		}
		}
	

	
}

