package Tarea;
import java.util.Scanner;
public class Tarea52 {
	
	//Leer 20 números desde el teclado y obtener cuantos son positivos, negativos e iguales a cero. 
	public static void main (String[]args) {
		Scanner scanner = new Scanner(System.in);
		
		int n=20, positivo=0, negativo=0, cero=0;
		for(int i=1; i<=n; i++) {
		System.out.println("Ingrese numero : "+i);
		int numero = scanner.nextInt();
	
		if (numero>0) {
			positivo++;
			
		}else if(numero<0){
			negativo++;
			
		}else if (numero==0){
			cero++;
			System.out.println("***********************************************");
			System.out.println(positivo+" numeros positivos fueron agregados");
			System.out.println(negativo+" numeros negativos fueron agregados");
			System.out.println(cero+" numeros iguales a cero fueron agregados");
			System.out.println("***********************************************");
		}
		}
	}

}
