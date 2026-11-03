/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.videojuegomain;

/**
 *
 * @author USUARIO
 */
import java.util.Scanner;
public class VideojuegoMain {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Introduce el nombre de tu jugador: ");
        String nombre = sc.nextLine();
        
        
        VideojuegoPersonaje personaje = new VideojuegoPersonaje(nombre);
        VideojuegoPersonaje monstruo = new VideojuegoPersonaje("Orco");
        
        while (personaje.estaVivo() && monstruo.estaVivo()){
            //Bruja ataca
            int dañoBruja = personaje.generarDaño();
            monstruo.recibirDaño(dañoBruja);
            System.out.println("Vida restante del mostruo: " + monstruo.getVida() + "pts");
            
            //Orco ataca
            if (monstruo.estaVivo()){
                int dañoOrco = monstruo.generarDaño();
                personaje.recibirDaño(dañoOrco);
                System.out.println("Vida restante de la bruja: " + personaje.getVida() + "pts");
            }

            
            // Boolean aleatorio para curarse
            boolean seCura = Math.random() < 0.5;
            if (seCura){
                personaje.curarse();
            }
            
        }
        
        // Resultado final
        if (personaje.estaVivo()) {
            System.out.println("¡VICTORIA! Has derrotado al Orco.");
        } else {
            System.out.println("HAS PERDIDO... El Orco te ha vencido.");

        }
    
    }
    
}    
    