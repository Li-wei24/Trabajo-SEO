import java.util.Arrays;
import java.util.Scanner;
/**
Escribe la función
int[] buscarTodos(int t[], int clave)
que crea y devuelve una tabla con todos los índices de los elementos donde se encuentra la
clave de búsqueda. En el caso de que la clave no se encuentre en la tabla t, la función
devolverá una tabla vacía.
 */
public class Ejercicio418 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] t = new int[10];

        // Pedimos los 10 números al usuario
        for (int i = 0; i < 10; i++) {
            System.out.print("Introduce valor " + (i + 1) + ": ");
            t[i] = sc.nextInt();
        }

        // OJO: Esto ordena la lista. Si metiste un 5 al principio, 
        // después del sort se moverá de sitio y su índice cambiará.
        Arrays.sort(t);

        System.out.print("¿Qué valor buscas?: ");
        int clave = sc.nextInt();

        // Llamamos a nuestra función para que nos dé las posiciones
        int[] tablaNueva = buscarTodos(t, clave);
        
        // Mostramos el resultado final
        System.out.println("Índices encontrados: " + Arrays.toString(tablaNueva));
        
        sc.close(); // Cerramos el scanner por buena práctica
    }

    static int[] buscarTodos(int t[], int clave) {
        int contador = 0;
        
        // Primero damos una vuelta para contar cuántos hay.
        // Lo necesitamos para saber qué tamaño tendrá el array de resultados.
        for (int valor : t) {
            if (valor == clave) {
                contador++;
            }
        }
        
        // Creamos el array donde guardaremos los índices (posiciones)
        int[] tablaNueva = new int[contador];
        
        // Segunda vuelta: ahora que ya sabemos el tamaño, guardamos los índices.
        int j = 0; // Usamos j para no machacar la posición en tablaNueva
        for (int i = 0; i < t.length; i++) {
            if (t[i] == clave) {
                tablaNueva[j] = i; // Guardamos "i" porque es la posición donde está el número
                j++; // Pasamos al siguiente hueco del array de resultados
            }
        }
        
        return tablaNueva;
    }
}