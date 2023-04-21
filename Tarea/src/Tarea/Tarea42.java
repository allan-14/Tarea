package Tarea;
import java.util.Scanner;
public class Tarea42 {

	//Leer “N” números distintos de 0, si el número leído es positivo súmelo en caso contrario cuéntelo.  
	 	public static void main (String[]args) {
		Scanner scanner = new Scanner(System.in);
	
		//Pedimos los numeros
		System.out.println("Ingrese cuantos numeros agregara");
		int cnt = scanner.nextInt();
		double suma =0; 
		int cuenta=0;		
		
		for (int i=0; i<cnt; i++) {
			System.out.println("Ingrese el numero : "+(i+1));
				double n = scanner.nextDouble();
				
				if (n<0) {
					cuenta++;
					
				}else {
					suma = suma+n;
					
					
				}
		}
		System.out.println("***************************************************");
		System.out.println("Los numeros positivos hicieron un total de: "+suma);
		System.out.println("Hay "+cuenta+" numeros negativos");
		System.out.println("***************************************************");
	}
}
