import java.util.Scanner;
public class Ejercicio445 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String texto;
        
        boolean dentroComentario = false;

        System.out.println("Introduce la sentencia en C:");
        texto = sc.nextLine();

        for (int i = 0; i < texto.length(); i++) {

            if (!dentroComentario && texto.charAt(i) == '/' && texto.charAt(i + 1) == '*') {
                dentroComentario = true;
                i++;
            }
            else if (dentroComentario && texto.charAt(i) == '*' && texto.charAt(i + 1) == '/') {
                dentroComentario = false;
                i++;
            }
            else if (!dentroComentario) {
                System.out.print(texto.charAt(i));
            }
        }
    }
}

