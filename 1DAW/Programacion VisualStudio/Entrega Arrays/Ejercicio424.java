
import java.util.Scanner;
import java.util.Arrays;
public class Ejercicio424 {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int[] t =new int [15];
        int numElementos = 3;
        
        for (int i = 0; i < t.length; i++){
            System.out.println("Introduce los valores de la tabla (15 valores): ");
            t[i] = sc.nextInt();
        }
        
        int[] sumaFuncion = suma ( t, numElementos); 
        
        System.out.println("Resultado de las sumas: " + Arrays.toString(sumaFuncion));
        
        sc.close();
                
    }
    

    public static int[] suma(int t[], int numElementos){
        //Seria 13 porque son los grupos posibles, esto se deduce porque si restas 15 - 3 tienes que sumarle 1 para 
        int[] suma = new int[t.length - numElementos + 1];
        int contador = 0;

    for (int i = 0; i <= t.length - numElementos; i++) {
        int aux = 0; // Tu variable aux para acumular la suma

        for (int j = 0; j < numElementos; j++) {
            aux += t[i + j];
        }

        suma[contador] = aux;
        contador++;
    }
        
        return suma;
    }
}
