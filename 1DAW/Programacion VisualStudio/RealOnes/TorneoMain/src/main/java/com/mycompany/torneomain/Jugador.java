/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.torneomain;

import java.util.Scanner;

public class Jugador {
    private String nombre;
    private boolean esCPU;

    public Jugador(String nombre, boolean esCPU) {
        this.nombre = nombre;
        this.esCPU = esCPU;
    }

    public String getNombre() {
        return nombre;
    }

    //Devuelve true si el jugador es la computadora, false si es humano.
    //decide si el jugador elige movimiento automáticamente o pregunta al usuario.
    public boolean esCPU() {
        return esCPU;
    }

    public Movimiento elegirMovimiento(Scanner sc) {

        //En este caso juega con el pc al ser true
        if (esCPU) {

            //Transformamos el enum en un array de 3 posiciones, es decir del 0 al 2 y 
            //creamos un numero aleatorio para q la cpu pueda hacer el movimiento
            return Movimiento.values()[(int)(Math.random() * 3)];
        }
        
        //Un bucle infinito para que user meta un valor aceptado si no lo hace tira un error
        while (true) {
            
            //Pedimos el movimiento
            System.out.print(nombre + ", elige tu movimiento (0:PIEDRA, 1:PAPEL, 2:TIJERA): ");
          
            //Recogemos el valor que inserte
            try {
                
                //Nos aseguramos de que sea un entero y por si acaso quitamos los espacios extras
                int opcion = Integer.parseInt(sc.nextLine().trim());

                //Ahora ya sabemos q es un numero, pero tiene q ser entre 0 y 2 para poder jugar, si lo es...
                if (opcion >= 0 && opcion <= 2) {

                    //convertimos el numero a el verdadero valor del enum correspondiente
                    return Movimiento.values()[opcion];
                } else {

                    //Si introduce un numero, pero no cumple la condicion tira un error y pedira de nuevo el movimiento
                    System.out.println("Error: solo puedes elegir 0, 1 o 2");
                }
                
                //En caso de q no sea un numero, tira un error y user tiene q meter de nuevo un movimiento
            } catch (Exception e) {
                System.out.println("Error: debes escribir un numero (0, 1 o 2)");
            }
        }
    }
}