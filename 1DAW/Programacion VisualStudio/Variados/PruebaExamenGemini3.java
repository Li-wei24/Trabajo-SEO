import java.util.Arrays;
import java.util.Scanner;

public class PruebaExamenGemini3 {
    public static void main (String [] args){
        Scanner sc = new Scanner (System.in);

        System.out.println("Dame un correo electronico: ");
        String correo = sc.nextLine();
        
        String correo2 = " ";
        String dominio = " ";

        correo2 = correo.replace('.', '-');

        for (int i = 0; i < correo.length(); i++){
            if (correo.charAt(i) == '@'){
                dominio = correo.substring(i +1, correo.length());
            }
        }
        
        System.out.println(correo2);

        System.out.println(dominio);
        sc.close();


    }
}

