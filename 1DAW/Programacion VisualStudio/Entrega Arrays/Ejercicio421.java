import java.util.Scanner;
import java.util.Arrays;

//El Ayuntamiento de tu localidad te ha encargado una aplicación para realizar encuestas con
//el fin de evaluar el nivel económico de los habitantes. Para ello tendrás que preguntar el
//sueldo a cada persona encuestada. A priori, no conoces el número de encuestados. Para
//finalizar la entrada de datos, introduce un sueldo con valor -1.
//Una vez terminada la entrada de datos, muestra la siguiente información:
//• Todos los sueldos introducidos, ordenados de forma decreciente.
//• El sueldo máximo y el mínimo.
//• La media de los sueldos.

public class Ejercicio421 {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        double[] tablaSueldos = new double [0];
        double sueldo = 0.0;
        int i = 0;

        // Aquí empiezo a pedirte los sueldos. Uso el -1 como señal para parar.
        for (;sueldo != -1;){
            System.out.println("Introduce un sueldo: ");
            sueldo = sc.nextDouble();
            
            // Aquí voy agrandando tu tabla de una en una para que quepa el nuevo sueldo.
            tablaSueldos = Arrays.copyOf(tablaSueldos, tablaSueldos.length + 1);
            
            if ( sueldo != -1){
                tablaSueldos[i] = sueldo;
                i++;
            }
        }
        
        int k = tablaSueldos.length -1;
        // Primero ordeno la tabla de menor a mayor para luego poder darle la vuelta.
        Arrays.sort(tablaSueldos);
        
        double[] ordenadaTablaSueldos = Arrays.copyOf(tablaSueldos, tablaSueldos.length);
        // En este bucle estoy invirtiendo el orden para que te quede de forma descendente.
        for (int j = 0; j < tablaSueldos.length; j++ ){
            if (k >= 0){
                ordenadaTablaSueldos[k] = tablaSueldos[j]; 
                k--;
            }
        }
        
        double media = 0;
        // Sumo todos los valores que hemos guardado.
        for (int l = 0; l < tablaSueldos.length; l++){
           media += tablaSueldos[l];
        }
        // Calculo la media restando 1 al total porque el último hueco es el del -1.
        media = media / (tablaSueldos.length -1);

        // El sueldo más alto será el primero de mi tabla invertida.
        double mayor = ordenadaTablaSueldos[0];
        // El más pequeño está al final, pero me salto el -1 usando el índice -2.
        double menor = ordenadaTablaSueldos[ordenadaTablaSueldos.length -2];
        
        System.out.println("Esta es la tabla: " + Arrays.toString(tablaSueldos));
        System.out.println("Esta es la tabla Ordenada de forma descendente: " + Arrays.toString(ordenadaTablaSueldos));
        System.out.println("Esta es la media de todos los sueldos: " + media);
        
        System.out.println("Este es el numero mas alto: " + mayor);
        System.out.println("Este es el numero mas pequeño; " + menor);
    
        sc.close();
    }
    
}