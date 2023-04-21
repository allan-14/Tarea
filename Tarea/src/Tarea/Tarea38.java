package Tarea;
import java.util.Scanner;
public class Tarea38 {

	/*Escriba un programa que calcule cuantos números impares hay entre 20 y 100 e igualmente 
	 * a cuantos asciende la suma de ellos.*/ 
	public static void main (String[]args) {
		Scanner scanner = new Scanner(System.in);
		
		int par=0, impar=0;
		for(int i=20; i<=100; i++) {
						
		if(i%2== 0) {
			par++;
			
		}else { 
			impar++;
		}
		}
		
		System.out.println("*****************************************");
		System.out.println("La cantidad de numeros pares es: "+par);
		System.out.println("La cantidad de numeros impares es: "+impar);
		System.out.println("*****************************************");
	}
	
}
