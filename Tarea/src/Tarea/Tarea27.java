package Tarea;
import java.util.Scanner;
public class Tarea27 {

	/*Unos pantalones se venden a 10 dólares cada uno si se compran más de tres, 12 dólares en los demás casos, 
	estructure un programa que lea un número de entrada de pantalones comprados e imprima el costo total.*/ 
	public static void main (String[]args) {
	Scanner scanner = new Scanner(System.in);
	
	//Pedimos la cantidad de pantalones comprados al usuario con do y while para evitar que agregue numeros negativos
	int cnt;
	do {
		System.out.println("¿Cuantos pantalones compró?");
		cnt = scanner.nextInt();
		
	} while (cnt < 0);
	
	
	//Realizamos un if, junto con su operacion e impresion de datos
	if (cnt >3) {
		int total = cnt *10;
		System.out.println("********************************************************************************");
		System.out.println("      Al hacer compra de " + cnt + " pantalones, su total es de : " +total);
		System.out.println("********************************************************************************");
		
	}else if (cnt <=3 && cnt>0){
		int total = cnt*12;
		System.out.println("********************************************************************************");
		System.out.println("      Al hacer compra de " + cnt + " pantalones, su total es de : " +total);
		System.out.println("********************************************************************************");
	
}
	}}
