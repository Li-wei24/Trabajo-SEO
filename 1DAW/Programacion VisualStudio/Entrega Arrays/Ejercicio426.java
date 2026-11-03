import java.util.Scanner;
import java.util.Arrays;
public class Ejercicio426 {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        int[] tablaDorsales = new int [0];
        int numDorsales = 0;

        boolean[] tablaMenor = new boolean [0];
        boolean esMenor = false;
        
        boolean[] tablaPositivo = new boolean [0];
        boolean esPositivo = false;
        
        boolean[] tablaPagado = new boolean [0];
        boolean esPagado = false;

        int i = 0;
        int posicion = 1;
        
        for (;numDorsales != -1;){
            System.out.println("Introduce que corredor acaba de llegar en el puesto" + posicion + " :  ");
            numDorsales = sc.nextInt();
            
            tablaDorsales = Arrays.copyOf(tablaDorsales, tablaDorsales.length + 1);
                       
            if ( numDorsales != -1){
                tablaDorsales[i] = numDorsales;
                
                System.out.println("El corredor en la posicion " + posicion + " es menor?: true/false  ");
                esMenor = sc.nextBoolean();
                
                tablaMenor = Arrays.copyOf(tablaMenor, tablaMenor.length + 1);
                
                System.out.println("El corredor en la posicion " + posicion + " dio positivo en el test?: true/false  ");
                esPositivo = sc.nextBoolean();
                
                tablaPositivo = Arrays.copyOf(tablaPositivo, tablaPositivo.length +1);
                
                System.out.println("El corredor en la posicion " + posicion + " a pagado?: true/false  ");
                esPagado = sc.nextBoolean();
                
                tablaPagado = Arrays.copyOf(tablaPagado, tablaPagado.length + 1);

            
            if (esPositivo == true){
                tablaDorsales = Arrays.copyOf(tablaDorsales, tablaDorsales.length -1);
                System.out.println("El corredor " + numDorsales + " con posicion " + posicion + " ha sido expulsado!");
             
            }
            
            else {
                if (esMenor == true && i > 0){
                    int aux1 = 0;
                    int aux2 = 0;
                    aux1 = tablaDorsales[i];
                    aux2 = tablaDorsales[i -1];
                    
                    tablaDorsales[i] = aux2;
                    tablaDorsales[i -1] = aux1;
                    
                    System.out.println("El menor con dorsal "+ numDorsales +"a avanzado 1 puesto!");
                    
                }
                
                if (esPagado == false){
                    System.out.println("Corredor relegado por impago.");
                
                }
                
                i++;
                posicion++;
            
            }
            
            }
            
        }
        
        System.out.println("ORO: " + tablaDorsales[0]);
        System.out.println("PLATA: " + tablaDorsales[1]);
        System.out.println("BRONCE: " + tablaDorsales[2]);
        
        sc.close();
    }
}
