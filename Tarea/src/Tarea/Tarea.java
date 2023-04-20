package Tarea;

import java.util.Scanner;

/*Determinar el área de un rectángulo que tiene por base “B” y por altura “H”,
 *  imprima la base, la altura y su área. */


public class Tarea {
    public static void main(String[] args) {
    	
        Scanner scanner = new Scanner(System.in);

    //Solicitamos al usuario que agregue la información de la base y la altura
        System.out.print("Ingrese la base del rectángulo: ");
        double B = scanner.nextDouble();
        System.out.print("Ingresa la altura del rectángulo: ");
        double H = scanner.nextDouble();

// Calculamos el area
        double area = B * H;

//Impresion de datos
        System.out.println("La base del rectángulo es: " + B);
        System.out.println("La altura del rectángulo es: " + H);
        System.out.println("El área del rectángulo es: " + area);
    }
}