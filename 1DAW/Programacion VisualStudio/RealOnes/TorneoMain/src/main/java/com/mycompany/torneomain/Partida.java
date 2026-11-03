/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.torneomain;

//Encargada de llevar a cabo solo una partida hasta llegar al num de partdas necesarias para ganar

import java.util.Scanner;

public class Partida {
    
    //Con el averiguamos quien es el ganador de los dos jugadores y devuelve el ganador
    //Pasamos los parametros de jugadores  y las partidas necesarias para ganar y el sacnner para leer las entradas del user
    public static Jugador jugar(Jugador j1, Jugador j2, int ganadasNecesarias, Scanner sc) {
        //estos contadores son las veces q ha ganadado cada uno
        int victoriasJ1 = 0;
        int victoriasJ2 = 0;

        System.out.println("---PARTIDA " + j1.getNombre() + " VS " + j2.getNombre() + " (al mejor de " + ganadasNecesarias + ") ---");

        //Mientras las victorias de j1 sean menores q las necesarias (lo mismo para j2) el bucle seguira
        while (victoriasJ1 < ganadasNecesarias && victoriasJ2 < ganadasNecesarias) {
            //LLamamos al metodo para cada jugador
            Movimiento mov1 = j1.elegirMovimiento(sc);
            Movimiento mov2 = j2.elegirMovimiento(sc);
            
            //Imprimimos al jugador y su movimiento escogido
            System.out.println(j1.getNombre() + ": " + mov1);
            System.out.println(j2.getNombre() + ": " + mov2);
            
            //Hacemos comparativas de movimientos, si es igual no se suma victorias a nadie
            if (mov1 == mov2) {
                System.out.println("¡Empate!");
            } 
            
            //Para comprobar quien gana usamos metodo ganacontra pasandole el mov escogido, quien gane se le suma una 
            //victoria a su respectivo contador
            else if (mov1.ganaContra(mov2)) {
                victoriasJ1++;
                System.out.println("Gana " + j1.getNombre());
            } 
            
            else {
                victoriasJ2++;
                System.out.println("Gana " + j2.getNombre());
            }
            
            //Una vez comprobado quien gano la ronda se imprime el total del marcador
            System.out.println("Marcador: " + j1.getNombre() + " " + victoriasJ1 + " - " + victoriasJ2 + " " + j2.getNombre());
        }
        
        //Cuando ya no se cumpla el bucle se mostrara quien es el ganador
        //Usamos un operador ternario para simplificarlo, verifica las partidas ganadas de j1 y si 
        //son iguales el ganador sera j1 si no es asi sera j2
        Jugador ganador = (victoriasJ1 >= ganadasNecesarias) ? j1 : j2;
        
        //Imprimimos y devolvemos a ganador
        System.out.println("GANADOR DE LA PARTIDA: " + ganador.getNombre());
        return ganador;
    }
}