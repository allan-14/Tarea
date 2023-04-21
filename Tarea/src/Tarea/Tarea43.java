package Tarea;
import java.util.Scanner;
public class Tarea43 {

	/*En un curso de 25 alumnos se practican 3 exámenes los datos de cada estudiante se registran así: 
	Nombre, Nota1, Nota2, Nota3. Escriba un programa que calcule por cada estudiante el promedio de las notas.*/ 
	 
	public static void main (String[]args) {
		Scanner scanner = new Scanner(System.in);
		
		//Pedimos datos
		double Nota1,Nota2,Nota3,promedio;
		int n = 25;
		String  nombre;
		for (int i=0; i<n; i++) {
			System.out.println("Alumno: "+(i+1));
			System.out.print("Nombre del estudiante: ");
			 nombre = scanner.next();
			System.out.print("Primera nota: ");
			Nota1 = scanner.nextDouble();
			System.out.print("Segunda nota: ");
			Nota2 = scanner.nextDouble();
			System.out.print("Tercera nota: ");
			Nota3 = scanner.nextDouble();
			
			promedio = Nota1+Nota2+Nota3/3;
			
			System.out.println("  "+nombre+" tiene un promedio de: "+promedio);
		}
		
		
		
	}
}
