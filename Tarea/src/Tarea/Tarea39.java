package Tarea;
import java.util.Scanner;
public class Tarea39 {

	/*Escriba un programa que lea las notas de “N” alumnos y calcule cuantos aprobados y desaprobados hay 
	(está aprobado si la nota es mayor de 60).*/ 
	public static void main (String[]args) {
		Scanner scanner = new Scanner(System.in);
		
		//Verificamos cuantos alumnos 
		System.out.println("Ingrese cuantas notas agregara");
		int cnt = scanner.nextInt();
		
		int aprobado = 0, reprobado = 0;
		for(int i=1; i<=cnt; i++) {
			System.out.println("Agregue la nota de alumno :"+i);
			double nota = scanner.nextDouble();
			
			if (nota >60) {
				aprobado++;
				
			}else { 
				reprobado++;
			}
		}
		System.out.println("*************************************");
		System.out.println("    " +aprobado +" Alumnos aprobaron");
		System.out.println("    " +reprobado +" Alumnos reprobaron");
		System.out.println("*************************************");
	}
	
}
