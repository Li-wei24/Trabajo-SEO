import java.util.Scanner;
import java.util.Arrays;

public class PruebaExamen4 {
    public static void main (String [] args){
        Scanner sc = new Scanner (System.in);

        double [] subEstacionA = new double [7];
        double [] subEstacionB = new double [7];

        int instancia = 1;
        
        System.out.println("Introduce los valores de la sub Estacion A!");

        for (int i = 0; i < subEstacionA.length; i++){
            System.out.println("Introduice el valor de la instancia " + instancia + ": " );
            subEstacionA[i] = sc.nextDouble();

            instancia ++;
        }

        System.out.println("Ahora vas a introducir los valores de la Sub Estacion B!");

        instancia = 1;

        for (int j = 0; j < subEstacionB.length; j++){
            System.out.println("Introduice el valor de la instancia " + instancia + ": " );
            subEstacionB[j] = sc.nextDouble();

            instancia ++;
        }

        double [] destino = new double [(subEstacionA.length + subEstacionB.length)];

        System.arraycopy(subEstacionA, 0, destino, 0, 7);

        System.arraycopy(subEstacionB, 0, destino, 7, 7);
        
        System.out.println("este es el conjunto de ambas tablas: " + Arrays.toString (destino));
        
        Arrays.sort(destino);

        System.out.println("Este es el valor maximo: " + destino[destino.length -1]);
        
        sc.close();
    }
}
