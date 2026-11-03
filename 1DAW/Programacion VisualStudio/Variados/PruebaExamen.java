import java.util.Arrays;
import java.util.Scanner;
public class PruebaExamen{
    public static void main (String [] args){
        Scanner sc = new Scanner (System.in);

        System.out.println("Introduce el codigo a normalizar: ");
        String codigo = sc.nextLine();

        String codigoNormalizado = normalizarCodigo(codigo);
        System.out.println("Este es tu codigo normalizado: " + codigoNormalizado);
    
        sc.close();
    }

    static String normalizarCodigo (String codigo){
        if (codigo.indexOf("-") == -1) return codigo.toUpperCase();

        String letras = codigo.substring(0, codigo.indexOf("-"));
        letras = letras.toUpperCase();
        
        String numeros = codigo.substring(codigo.indexOf("-"), codigo.length());    
        
        String codigoNormalizado = letras + numeros;
        
        return codigoNormalizado;

    }
}