import java.util.Scanner;
import java.util.Arrays;
public class Ejercicio427 {

    public static void main(String[] args) {
        Scanner sc =new Scanner (System.in);
        
        int[] tablaUno = new int [10];
        int uno = sc.nextInt();
        
        int[] tablaDos = new int [10];
        int dos = sc.nextInt();
        
        int[] tablaUnion = new int [20];
        
        int posicion = 1;
        
        for (int i = 0; i < tablaUno.length; i++){
            System.out.println("Introduce el valor para la posicion " + posicion + "para la tabla 1: ");
            uno = sc.nextInt();
            
            tablaUno[i] = uno;
            posicion++;
        }
        
        posicion = 1;
        
        for (int j = 0; j < tablaUno.length; j++){
            System.out.println("Introduce el valor para la posicion " + posicion + "para la tabla 1: ");
            dos = sc.nextInt();
            
            tablaDos[j] = dos;
            posicion++;
        }
        
        Arrays.sort(tablaUno);
        Arrays.sort(tablaDos);
        
        //Empezamos con la comparacion
        
        int k = 0;
        int l = 0;
        int m = 0;
        int aux = 0;
        
        for (k = 0; k < tablaUno.length && l < tablaDos.length; m++){
            if (tablaUno[k] < tablaDos[l]){
                aux = tablaUno[k];
                
                tablaUnion[m] = aux;
                aux = 0;
                
                k++;
            }
            
            else if (tablaUno[k] > tablaDos[l]){
                aux = tablaUno[l];
                
                tablaUnion[m] = aux;
                aux = 0;
                
                l++;
            }
            
            else if (tablaUno[k] == tablaDos[l] ) {
                aux = tablaDos[k];
                
                tablaUnion[m] = aux;
                aux = 0;
                
                k++;
            }
            
        }
        //Por si tablaUno no a terminado
            
        for (; k < tablaUno.length; k++) {
            tablaUnion[m] = tablaUno[k];
            m++;
        }
            
        //Por si tablaDos no a terminado
        
        for (; l < tablaDos.length; l++) {
            tablaUnion[m] = tablaDos[l];
            m++;
        }
        
        System.out.println("Esta es la tabla Fusionada y ordenada: " + Arrays.toString(tablaUnion));
        sc.close();
    }
}
