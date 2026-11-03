import java.util.Scanner;
import java.util.Arrays;
public class Ejercicio443 {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        // Estos son mis alfabetos: el original y el de sustitución
        char[] conjunto1 = {'e','i','k','m','p','q','r','s','t','u','v'};        
        char[] conjunto2 = {'p','v','i','u','m','t','e','r','k','q','s'};
        String fraseFinal = "";

        // Le pido al usuario la frase que quiere pasar a clave
        System.out.println("Introduce la frase para codificarla: ");
        String frase = sc.nextLine();

        // Voy recorriendo la frase letra por letra
        for (int i = 0; i < frase.length(); i++) {

            char letraOriginal = frase.charAt(i);
            int contador = 0;

            // Miro si la letra de la frase está en mi conjunto1
            for (int j = 0; j < conjunto1.length; j++) {

                if (letraOriginal == conjunto1[j]) {
                    // Si la encuentro, cojo la letra que esté en la misma posición en el conjunto2
                    fraseFinal = fraseFinal + conjunto2[j];
                } else {
                    // Si no coincide, sumo 1 al contador para saber que en esta posición no estaba
                    contador++;
                }
            }

            // Si el contador llega al tamaño del conjunto, es que la letra no tiene traducción (como los espacios)
            if (contador == conjunto1.length) {
                // Así que la dejo tal cual estaba en la frase original
                fraseFinal = fraseFinal + letraOriginal;
            }
        }

        // Ya solo queda mostrar cómo ha quedado el invento
        System.out.println("Resultado: " + fraseFinal);

        sc.close(); // Cierro el scanner y listo
    }
}
