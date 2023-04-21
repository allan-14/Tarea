package Tarea;
import java.util.Scanner;
public class Tarea46 {

	/*Dado un arreglo lineal de “N” elementos escriba un programa por cada inciso que determine: 
	a)	La suma de sus elementos. 
	b)	La suma de sus elementos elevados al cuadrado. 
	c)	El menor elemento y la posición del mismo dentro del arreglo. 
	d)	El mayor elemento y la posición del mismo dentro del arreglo. 
	e)	El promedio de los elementos. 
	f)	Ordénalos de forma ascendente. 
	g)	Calcular el módulo del arreglo.*/ 

	public static void main (String[]args) {
	Scanner scanner = new Scanner(System.in);
		     Scanner scan = new Scanner(System.in);
	     int n;
	     int opcion;

	    System.out.println("******MENU******");
	    System.out.println("1- La suma de sus elementos");
	    System.out.println("2- La suma de sus elementos elevados al cuadrado.");
	    System.out.println("3- El menor elemento y la posición del mismo dentro del arreglo.");
	    System.out.println("4- El mayor elemento y la posición del mismo dentro del arreglo.");
	    System.out.println("5- El promedio de los elementos.");
	    System.out.println("6- Ordénalos de forma ascendente.");
	    System.out.println("7- Calcular el módulo del arreglo.");
	    System.out.print("Elija una opcion: ");
	    opcion = scan.nextInt();

	  
	    double suma = 0, posicion = 0;

	    switch(opcion){
	        case 1:
	        System.out.println("Ingrese el numero de elementos del arreglo: ");
	        n = scan.nextInt();
	        double[] elementos = new double[n];

	            for(int i=0; i < n; i++){
	                System.out.print("Ingrese el [" + (i+1) + "] elemento: ");
	                elementos[i] = scan.nextDouble();
	                
	                suma += elementos[i];
	            }

	            System.out.println("La suma de los elementos es: " +suma);
	            break;

	        case 2:
	        System.out.println("Ingrese el numero de elementos del arreglo: ");
	        n = scan.nextInt();
	        double[] elementos1 = new double[n];

	            for(int i=0; i < n; i++){
	                System.out.print("Ingrese el [" + (i+1) + "] elemento: ");
	                elementos1[i] = scan.nextDouble();
	                
	                
	                suma += Math.pow(elementos1[i], 2);
	            }

	            System.out.println("La suma de los elementos al cuadrado es: " +suma);
	            break;


	        case 3:
	        System.out.println("Ingrese el numero de elementos del arreglo: ");
	        n = scan.nextInt();
	        double[] elementos2 = new double[n];
	        
	        double menor = 999999999;

	            for(int i=0; i < n; i++){
	                System.out.print("Ingrese el [" + (i+1) + "] elemento: ");
	                elementos2[i] = scan.nextDouble();
	                
	                if (elementos2[i] < menor) {
	                    menor = elementos2[i];
	                    posicion = i;
	                }
	                System.out.println("El elemento menor es; " +menor);
	                System.out.println("Posicion del arreglo [" +i + "]");
	            }
	            break;

	        case 4:
	        System.out.println("Ingrese el numero de elementos del arreglo: ");
	        n = scan.nextInt();
	        double[] elementos3 = new double[n];
	        
	        double mayor = 0;

	            for(int i=0; i < n; i++){
	                System.out.print("Ingrese el [" + (i+1) + "] elemento: ");
	                elementos3[i] = scan.nextDouble();
	                
	                if (elementos3[i] > mayor) {
	                    mayor = elementos3[i];
	                    posicion = i;
	                }
	                System.out.println("El elemento mayor es; " +mayor);
	                System.out.println("Posicion del arreglo [" +i + "]");
	            }
	            break;


	        case 5:
	        System.out.println("Ingrese el numero de elementos del arreglo: ");
	        n = scan.nextInt();
	        double[] elementos4 = new double[n];
	        
	      
	        for (int i = 0; i < n; i++) {
	            System.out.print("Ingrese el [" + (i+1) + "] elemento: ");
	            elementos4[i] = scan.nextDouble();

	            suma += elementos4[i];
	        }
	        double promedio = suma / n;

	        System.out.println("El promedio es: " +promedio);

	            break;


	        case 6:
	        System.out.println("Ingrese el numero de elementos del arreglo: ");
	        n = scan.nextInt();
	        double[] elementos5 = new double[n];
	        
	      
	            for (int i = 0; i < n; i++) {
	                System.out.print("Ingrese el [" + (i+1) + "] elemento: ");
	                elementos5[i] = scan.nextDouble();
	            }
	            for (int i = 0; i < n-1; i++) {
	                for (int j = 0; j < n-i-1; j++) {
	                    if (elementos5[j] > elementos5[j+1]) {
	                        double temp = elementos5[j];
	                        elementos5[j] = elementos5[j+1];
	                        elementos5[j+1] = temp;
	                    }
	                }
	            }
	            for (int i = 0; i < n; i++) {
	                System.out.print(elementos5[i] + " ");
	            }

	            break;

	        case 7:
	        System.out.println("Ingrese el numero de elementos del arreglo: ");
	        n = scan.nextInt();
	        double[] elementos6 = new double[n];
	        double modulo = 0;
	      
	        for (int i = 0; i < n; i++) {
	            System.out.print("Ingrese el [" + (i+1) + "] elemento: ");
	            elementos6[i] = scan.nextDouble();
	            modulo += Math.abs(elementos6[i]);
	        }
	        System.out.println("El modulo es: " +modulo);
	            break;

	            default:
	            System.out.println("Escriba una opcion correcta");

	    }

	    scan.close();
	        
	    }
	
}
