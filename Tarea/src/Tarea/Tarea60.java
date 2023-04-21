package Tarea;
import java.util.Scanner;
public class Tarea60 {

	/*Elaborar un programa adivinanza. Este programa preguntará ¿Cuál es la capital del folclore nicaragüense? 
	 * El usuario tendrá tres oportunidades de responder, si el usuario acierta antes de la tercera posibilidad 
	 * el programa le informara de su acierto si no acertara en ninguna el programa posteriormente suministrará 
	 * la respuesta. */
	public static void main (String[]args) {
        Scanner input = new Scanner(System.in);

        // Pedir al usuario que adivine la respuesta
        System.out.println("Adivinanza: ¿Cuál es la capital del folclore nicaragüense?");
        
	      // Definir la respuesta correcta
        String respuesta = "Masaya";

        // Hacer tres intentos para adivinar la respuesta
        for (int i = 1; i <= 3; i++) {
            System.out.print("Intento #" + i + ": ");
            String intento = input.nextLine();
            
            // Verificar si la respuesta es correcta
            if (intento.equalsIgnoreCase(respuesta)) {
                System.out.println("¡Felicitaciones! ¡Has acertado!");
                return;
            } else {
                System.out.println("Incorrecto. Inténtalo de nuevo.");
            }
        }
        
        // Si se agotan los intentos, mostrar la respuesta correcta
        System.out.println("Lo siento, has agotado tus tres intentos. La respuesta correcta es: " + respuesta);
    }
}
