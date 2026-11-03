import java.util.Scanner;
import java.util.Arrays;

public class PruebaExamen5 {
    public static void main (String [] args){
        Scanner sc = new Scanner (System.in);

        System.out.println("Introduce la alerta: ");
        String alertaGeneral = sc.nextLine();
        alertaGeneral = alertaGeneral.trim();
        alertaGeneral = alertaGeneral.toUpperCase();

        String [] tablaAlertaGeneral = alertaGeneral.split("#");
       
            if (tablaAlertaGeneral[0].startsWith("ID_LOG") == true) {
                System.out.println("Es valido!");

                for (int i = 0; i < tablaAlertaGeneral.length; i++){
                    System.out.println("Este es su valor: " + tablaAlertaGeneral[i]);
                    System.out.println("Este es su total de caracteres: " + tablaAlertaGeneral[i].length());
                    System.out.println("Este es el ultimo caracter: " + tablaAlertaGeneral[i].charAt(tablaAlertaGeneral[i].length() -1));
                    System.out.println(" ");
                }
            }

            else {
                System.out.println("No es valido!");
            }
        
            
        sc.close();
    }
}
