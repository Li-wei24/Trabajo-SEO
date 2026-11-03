import java.util.Scanner;
import java.util.Arrays;

/*Te dan una lista de nombres de usuario que vienen "sucios" (con espacios de más al principio y al final y mezclando mayúsculas y minúsculas). El programa debe:

Limpiar los espacios sobrantes de los extremos.

Convertir todo el texto a minúsculas.

Comprobar si el nombre empieza por el prefijo "user_".

Si es válido, dividir el nombre en partes usando el guion bajo (_) como separador y guardarlas en una tabla. */

public class PruebaExamenGemini2 {
    public static void main (String [] args){
        Scanner sc = new Scanner (System.in);
        
        System.out.println("Introduce el nombre: ");
        String nombre = sc.nextLine();

        nombre = nombre.trim();
        nombre = nombre.toLowerCase();

        if (nombre.startsWith("user")){
            System.out.println("Es valido!");
            String [] palabras = nombre.split("_");
            
            System.out.println("Este es el usuario: " + Arrays.toString(palabras));
        }

        else {
            System.out.println("No es valido!");
        }

        sc.close();

    }

}
