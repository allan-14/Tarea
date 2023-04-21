package Tarea;
import java.util.Scanner;
public class Tarea37 {

	//Escriba un programa que tenga como entrada “n” números enteros y que calcule el número de números pares e impares. 
	public static void main (String[]args) {
		Scanner scanner = new Scanner(System.in);
		
		//Pedimos cuantos numeros se ingresan
		System.out.println("¿Cuantos numeros ingresara?");
		int n = scanner.nextInt();
		int par=0, impar=0;
		
		for(int i=1; i<=n; i++) {
		System.out.println("Ingrese el numero :" +i);
		int numeross = scanner.nextInt();
		
		if (numeross % 2 == 0) {
			par++;
			
		}else {
			impar++;
			
		}
		}
		
		System.out.println("*****************************");
		System.out.println("La cantidad de numeros pares es :"+par);
		System.out.println("La cantidad de numeros impares es :"+impar);
		System.out.println("*****************************");
	}
}
