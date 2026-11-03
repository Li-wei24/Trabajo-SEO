import java.util.Scanner;
import java.util.Arrays;

public class PruebaExamen2 {
    public static void main (String[] args){
        Scanner sc = new Scanner (System.in);
        String [] palabras = new String [5];

        for (int i = 0; i < palabras.length; i++){
            System.out.println("Introduce cada una de las palabras: ");
            palabras [i] = sc.nextLine();
        }

        System.out.println("Cual sera la vocal?: ");
        char vocal = sc.next().toLowerCase().charAt(0);

        String concatenado = concatenarPorVocal(palabras, vocal);
        System.out.println("Esta es la frase concatenada: " + concatenado);

        sc.close();

    }

    public static String concatenarPorVocal(String [] palabras, char vocal){
            String concatenado = " ";
            for (int i = 0; i < palabras.length;){
                if (palabras[i].charAt(palabras[i].length()-1) == vocal){
                    concatenado += palabras[i];
                    i++;

                }
                
                else{
                    i++;
                }

            }

            return concatenado;

        }
}
