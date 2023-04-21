package Tarea;
import java.util.Scanner;
import java.util.Collections;
import java.util.ArrayList;
public class Tarea45 {

	/*De una lista de n voltajes escriba el programa que calcule el voltaje mínimo, el voltaje máximo 
	y el promedio de todos.*/ 
	public static void main (String[]args) {

    ArrayList<Double> voltajes = new ArrayList<Double>();
        
        // Pedir al usuario que ingrese la cantidad de voltajes
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de voltajes: ");
        int n = sc.nextInt();
        
        // Pedir al usuario que ingrese los voltajes
        for (int i = 1; i <= n; i++) {
            System.out.print("Ingrese el voltaje " + i + ": ");
            double voltaje = sc.nextDouble();
            voltajes.add(voltaje);
        }
        
        // Encontrar el voltaje mínimo
        double voltajeMinimo = Collections.min(voltajes);
        System.out.println("El voltaje mínimo es: " + voltajeMinimo);
        
        // Encontrar el voltaje máximo
        double voltajeMaximo = Collections.max(voltajes);
        System.out.println("El voltaje máximo es: " + voltajeMaximo);
        
        // Calcular el promedio de los voltajes
        double sumaVoltajes = 0;
        for (double voltaje : voltajes) {
            sumaVoltajes += voltaje;
        }
        double promedioVoltajes = sumaVoltajes / voltajes.size();
        System.out.println("El promedio de los voltajes es: " + promedioVoltajes);
    }

}
