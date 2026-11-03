import java.util.Scanner;
import java.util.Arrays;

/*
Realiza el juego del ahorcado. Las reglas del juego son:
a) El jugador A teclea una palabra, sin que el jugador B la vea.
b) Ahora se le muestran tantos guiones como letras tenga la palabra secreta. Por ejemplo, para "hola"
sera "----".
c) El jugador B intentara acertar, letra a letra, la palabra secreta.
d) Cada acierto muestra la letra en su lugar y las letras no acertadas seguiran ocultas como guiones.
Siguiendo con el ejemplo, y suponiendo que se han introducido la 'o', la 'j' y la 'a', se mostrara "-
o-a".
e) El jugador B solo tiene 7 intentos.
f) La partida terminara al acertar todas las letras que forman la palabra secreta (gana el jugador B) o
cuando se agoten todos los intentos (gana el jugador A)
*/

public class Ejercicio444 {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        // Aqui cojo la palabra del Jugador 1
        System.out.println("JUGADOR1 Introduce palabra: ");
        String palabra = sc.nextLine();
        
        int longitud = palabra.length();
        char letras [] = new char [longitud];
        char letras2 [] = new char [longitud];
        char pruebas [] = new char [longitud];
        char finalTabla [] = new char [longitud];
        int intentos;
        
        String guiones = "-";
        
        // Relleno la pista de guiones para el inicio
        for (; guiones.length() < longitud; ){
            guiones += "-";
        }
        
        System.out.println(guiones);
        
        boolean acertado = false;
        
        // Empiezo el bucle de los 7 intentos respetando tus condiciones
        for (intentos = 7; intentos > 0 && acertado == false; intentos--){
            System.out.println("JUGADOR2 Introduce tu palabra: ");
            String adivina = sc.nextLine();
            
            // Compruebo si la longitud de la palabra que mete el Jugador 2 es correcta
            if (adivina.length() < palabra.length()){
                System.out.println("Es muy corta!");
            }
            
            else if (adivina.length() > palabra.length()){
                System.out.println("Es muy larga!");
            }
            
            else {
            
                // Si la palabra es clavada, marco que ha acertado
                if (adivina.equals(palabra)) {
                    acertado = true;}
                
                // Recorro los arrays para comparar posicion por posicion
                for (int i = 0; i < letras.length; i++){
                    letras [i] = palabra.charAt(i);
                    letras2 [i] = adivina.charAt(i);
                
                    // Si coinciden en la misma posicion, guardo la letra en finalTabla
                    if (letras [i] == letras2 [i]){
                        finalTabla[i] = letras2[i];
                    }
                
                    // Si no coinciden, mantengo el guion
                    else{
                        finalTabla[i] = '-';
                    }
                }
            }
            
            // Muestro como va la tabla despues de cada intento
            System.out.println(finalTabla);
            
        }
        
        

        // Miro quien ha ganado al final segun el booleano
        if (acertado == true){
                System.out.println("Ha ganado JUGADOR2! ");
            
            }
            
        else {
            System.out.println("Ha ganado JUGADOR1!");
        }
        
        sc.close();
    }
}