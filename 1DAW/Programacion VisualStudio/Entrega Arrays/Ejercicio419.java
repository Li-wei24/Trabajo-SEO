import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/*Escribe la función
void desordenar(int t[])
que cambia de forma aleatoria los elementos contenidos en la tabla t. Si la tabla estuviera
ordenada, dejaría de estarlo.*/
public class Ejercicio419 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
        int[] t = new int[10];
        int contador = 1;
        
        for (int i = 0; i < 10; i++){
            System.out.println("Introduce el valor " + contador + " de 10: ");
            t[i] = sc.nextInt();
            contador++;
        }
        
        desordenar(t);
        System.out.println("Esta es la tabla desordenada: " + Arrays.toString(t));        
        sc.close();

    }
    
    static void desordenar(int t[]){
        Random randomNumbers = new Random ();
        int posicionAleatoria = 0;
        
        for (int i = 0; i < t.length; i++){
            posicionAleatoria = randomNumbers.nextInt(t.length);
            
            // Usamos auxiliar para no perder el valor al intercambiar
            // Nota: Aquí lo que se hace es "congelar" el valor actual en 'auxiliar' 
            // para que al sobreescribirlo con el aleatorio no se pierda para siempre.
            int auxiliar = t[i];
            t[i] = t[posicionAleatoria];
            t[posicionAleatoria] = auxiliar;
            
        }
        
    }
}