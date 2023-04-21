package Tarea;
import java.util.Scanner;
import java.util.Arrays;
public class Tarea47 {

	/*Dado dos arreglos lineales A y B escriba un programa para cada inciso que determine: 
a)	El Producto de puntos. 
b)	Determine si son ortogonales. 
c)	Obtener la expresión: 
	 	Z= Producto de los arreglos/ producto de sus módulos.*/
	
	public static void main (String[]args) {
		Scanner scanner = new Scanner(System.in);
		
		// Definir dos arreglos lineales A y B
        double[] A = {1, 2, 3};
        double[] B = {4, 5, 6};

        // a) Producto de puntos
        double dotProduct = 0;
        for (int i = 0; i < A.length; i++) {
            dotProduct += A[i] * B[i];
        }
        System.out.println("Producto de puntos: " + dotProduct);

        // b) Ortogonalidad
        if (dotProduct == 0) {
            System.out.println("Los arreglos son ortogonales");
        } else {
            System.out.println("Los arreglos no son ortogonales");
        }

        // c) Expresión de Z
        double modulusA = Math.sqrt(Arrays.stream(A).map(a -> a * a).sum());
        double modulusB = Math.sqrt(Arrays.stream(B).map(b -> b * b).sum());
        double Z = dotProduct / (modulusA * modulusB);
        System.out.println("Z: " + Z);
   

	}
}
