import java.util.Scanner;
import java.util.Arrays;

/* Un sistema de seguridad recibe una clave. Debes crear un programa que analice esa clave 
y determine si es "Nivel Fuerte". Para ello, el programa debe confirmar que la clave contenga, 
al menos, una letra mayúscula, una letra minúscula y un número. Al final, debe mostrar 
cuántos caracteres tiene la clave en total */

public class PruebaExamenGemini1 {
    public static void main (String [] args){
        Scanner sc = new Scanner (System.in);

        System.out.println("Introduce la contraseña a verificar: ");
        String contrasena = sc.nextLine();

        int mayuscula = 0;
        int minuscula = 0;
        int numero = 0;


        for (int i = 0; i < contrasena.length(); i++ ){
            if (Character.isUpperCase(contrasena.charAt(i))){
                mayuscula++;
            }

            else if (Character.isLowerCase(contrasena.charAt(i))){
                minuscula++;
            }
            else {
                numero++;
            }


        }

        if (mayuscula >= 1 && minuscula >= 1 && numero >= 1){
            System.out.println("Es una contraseña de nivel fuerte");
        }
        else {
            System.out.println("No es valido");
        }

        System.out.println("Esta es la cantidad de caracteres que tiene tu contraseña: " + contrasena.length());
        sc.close();

    }
}
