
import java.util.Scanner;
public class Ejercicio425 {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        int[][] matrizMagica = new int [4][4];
        int aux1 = 0;
        int aux2 = 0;
        int aux3 = 0;
        boolean esMagico = true;

        
        for (int i = 0; i < matrizMagica.length; i++){
            for (int j = 0; j < matrizMagica[i].length; j++){    
                System.out.println("Introduce los valores para la fila " + i + " y columna " + j + ": ");
                matrizMagica[i][j] = sc.nextInt();
                
            }
        }
        
        //Para fila 0 que sera el numero principal
        for (int k = 0; k < 4; k++){
               aux1 += matrizMagica[0][k];  
        }
        
        //Comprueba el resto de filas
        for (int m = 1; m < 4; m++){
            aux2 = 0;
            aux3 = 0;
            for (int n = 0; n < 4; n++){    
               aux2 += matrizMagica[m][n];
               aux3 += matrizMagica[n][m];
            }
            
            if (aux1 != aux2 || aux1 != aux3){
                esMagico = false;
            }
        }
        
        if (esMagico == true) {
            System.out.println("¡Es un cuadrado mágico!");
        } else {
            System.out.println("No es un cuadrado magico...");
        }
        sc.close();
                
    }
}
