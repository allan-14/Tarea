package Tarea;
import java.util.Scanner;
public class Tarea53 {

	//Leer 20 números desde el teclado y averiguar la suma de los números pares e impares. 
	public static void main (String[]args) {
		Scanner scanner = new Scanner(System.in);
		int n= 20, par=0, impar=0;
		
		for(int i=1; i<=n; i++) {
		System.out.println("Ingrese el numero: "+i);
		int numero= scanner.nextInt();
		
		if(numero%2==0) {
			par += numero;
			
		}else{
			impar +=numero;
			
		}
		}
		System.out.println("*****************************************");
		System.out.println("La suma de los numeros pares son "+par);
		System.out.println("La suma de los numeros impares son "+impar);
		System.out.println("*****************************************");		
	}
	
	
}
