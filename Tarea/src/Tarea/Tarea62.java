package Tarea;
import java.util.Scanner;
public class Tarea62 {

	/*Escriba un programa que encuentre los primeros tres números perfectos. Un número perfecto es un número entero
	 *  positivo, que es igual a la suma de todos los enteros positivos (excluidos el mismo) que son divisores del número.
	 *   El primer número es 6 ya que los divisores de 6 son 1,2,3 y 1+2+3=6 */
	public static void main (String[]args) {
	     int count = 0;
	      long number = 2;
	      while (count < 3) {
	         if (isPerfect(number)) {
	            System.out.println(number);
	            count++;
	         }
	         number++;
	      }
	   }

	   public static boolean isPerfect(long number) {
	      long sum = 1;
	      for (long i = 2; i <= Math.sqrt(number); i++) {
	         if (number % i == 0) {
	            sum += i;
	            if (i != number / i) {
	               sum += number / i;
	            }
	         }
	      }
	      return sum == number;
	   }
			
	
}
