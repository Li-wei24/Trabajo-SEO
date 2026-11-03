
import java.util.Arrays;
import java.util.Scanner;
public class PruebaExamen3 {
    public static void main (String [] args){
        Scanner sc = new Scanner (System.in);

        double [] depositos = new double[10];
        Arrays.fill(depositos, 50.0);
        
        System.out.println("Que deposito de agua quieres alterar?: (0-9)");
        int num = sc.nextInt();

        System.out.println("Cual es el nuevo nivel de agua?: ");
        double litros = sc.nextDouble();
        sc.close();

        if (num < 0 || num >= 10) {
            System.out.println("No es un indice valido");
        }

        else {
            if (litros < 5.00) {
                System.out.println("La cantidad de litros es menor de 5 litros!");
            }

            else if (litros > 200.00) {
                System.out.println("La cantidad de litros es mayor de 200 litros!");

            }
            else {
                depositos[num] = litros;
                System.out.println("Este es el nuevo nivel de agua en ese deposito: " + depositos[num]);
            }
        }
    }
}
