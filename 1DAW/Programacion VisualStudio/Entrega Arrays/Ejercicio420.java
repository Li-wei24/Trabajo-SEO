import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
/* Escribe la función
void desordenar(int t[])
que cambia de forma aleatoria los elementos contenidos en la tabla t. Si la tabla estuviera
ordenada, dejaría de estarlo */

public class Ejercicio420 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] t = new int[10];
        
        // Pedimos los datos al usuario
        for (int i = 0; i < 10; i++) {
            System.out.print("Introduce el valor " + (i + 1) + " de 10: ");
            t[i] = sc.nextInt();
        }
        
        // Guardamos el resultado de la función en un nuevo array
        int[] tablaDesordenada = desordenar(t);
        
        // Mostramos las dos para comparar que la original sigue intacta
        System.out.println("Tabla original (no ha cambiado): " + Arrays.toString(t));
        System.out.println("Esta es la tabla desordenada: " + Arrays.toString(tablaDesordenada));      
    
        sc.close();
    }
    
    static int[] desordenar(int t[]) {
        Random randomNumbers = new Random();
        
        // IMPORTANTE: Hacemos una copia para no destrozar el array original
        int[] tablaDesordenada = Arrays.copyOf(t, t.length);
        
        // Recorremos el array para ir moviendo los números de sitio
        for (int i = 0; i < tablaDesordenada.length; i++) {
            
            // Elegimos un índice cualquiera al azar
            int posicionAleatoria = randomNumbers.nextInt(tablaDesordenada.length);
            
            // Usamos una variable "auxiliar" como si fuera una mano extra 
            // para no perder el valor que vamos a machacar.
            
            int auxiliar = tablaDesordenada[i]; // Guardamos el valor actual en la mano
            tablaDesordenada[i] = tablaDesordenada[posicionAleatoria]; // Ponemos el aleatorio en el hueco actual
            tablaDesordenada[posicionAleatoria] = auxiliar; // Ponemos lo que teníamos en la mano en el hueco del aleatorio
        }
        
        return tablaDesordenada;
    }
}