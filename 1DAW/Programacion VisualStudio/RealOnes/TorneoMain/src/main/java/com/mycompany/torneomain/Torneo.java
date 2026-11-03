/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.torneomain;

//Organiza todo el torneo pidiendo datos como jugadores, gestiona rondas, sorteos y muestra ganador
import java.util.*;

public class Torneo {

    public static void ejecutar() {
        Scanner sc = new Scanner(System.in);

        System.out.println("--- SIMULADOR DE TORNEO PIEDRA, PAPEL O TIJERA ---");
        
        //Llamamaos al metodo pedirnumero para saber cuandos jugadores participan, este metodo esta mas declarado abajo
        int numJugadores = pedirNumero(sc, "Numero de jugadores (mínimo 1): ", 1, 100);
        
        //Y lo mismo para saber cuantas partidas son necesarias para q gane alguien
        int ganadasNecesarias = pedirNumero(sc, "Numero de juegos para ganar una partida (1-5): ", 1, 5);
        
        //Creamos una lista dinamica para guardar todos los jugadores
        ArrayList<Jugador> jugadores = new ArrayList<>();
        
        //Comprobamos la cantidad de jugadores, en caso de q sea 1 jugara contra la cpu
        if (numJugadores == 1) {
            //Creamos dos jugadores, el humano y cpu
            //Añadimos jugador decimos q es humano y que no es cpu con false
            jugadores.add(new Jugador("Jugador Humano", false));
            
            //Añadimos jugador decimos q es cpu y se confirma con un true
            jugadores.add(new Jugador("CPU", true));
            
            //Hacemos saber en q modo esta
            System.out.println("Modo: Individual humanos VS CPU");
        } 
        
        //Si hay mas de 1 jugador
        else {
            
            //Comprobamos si es par el numero, sino el restante pasa a la siguiente ronda
            if (numJugadores % 2 == 1) {
                System.out.println("Número impar: 1 jugador pasara directamente en la primera ronda.");
            }
            
            //Creamos cada uno de los jugadores usando un for q recorre todo el array, pasamos false para q 
            //sepa q son humanos y q deben introducir ellos los movimientos no la cpu
            for (int i = 1; i <= numJugadores; i++) {
                jugadores.add(new Jugador("Jugador " + i, false));
            }
            System.out.println("Modo: Torneo por parejas (" + numJugadores + " jugadores)");
        }
        
        //Ahora creamos otra lista dinamica para q guarde solo a los ganadores de cada partida
        ArrayList<Jugador> rondaActual = new ArrayList<>(jugadores);
        
        //Mientras ese array dinamico sea mayor a 1 se hara lo siguiente
        while (rondaActual.size() > 1) {
            System.out.println("---RONDA CON " + rondaActual.size() + " JUGADORES ---");
            
            //Mezclamos el contenido de la lista para q las parejas no sean siempre las mismas
            Collections.shuffle(rondaActual);

            //De nuevo se crea un array q guarde quienes han ganado
            ArrayList<Jugador> ganadores = new ArrayList<>();
            
            //Recorremos la lista de dos en dos para emparejarlos
            for (int i = 0; i < rondaActual.size() - 1; i += 2) {
                
                //Sacamos a dos jugadores
                Jugador j1 = rondaActual.get(i);
                Jugador j2 = rondaActual.get(i + 1);
                
                //LLamamos al metrodo jugar de la clase partida para q jueguen
                Jugador ganador = Partida.jugar(j1, j2, ganadasNecesarias, sc);
                
                //Y añadimos al ganador en la lista de ganadores 
                ganadores.add(ganador);
            }
            
            //De nuevo revisamos q la cantidad de jugadores no sea impar si es asi el jugador restante pasa de ronda
            if (rondaActual.size() % 2 == 1) {
                Jugador bye = rondaActual.get(rondaActual.size() - 1);
                System.out.println(bye.getNombre() + " pasa directamente");
                ganadores.add(bye);
            }

            //La lista de ganadores se convierte en la nueva lista de jugadores para la siguiente ronda
            rondaActual = ganadores;
        }

        //Mostramos quien a ganado
        System.out.println("TORNEO FINALIZADO!");
        System.out.println("EL GANADOR ABSOLUTO ES: " + rondaActual.get(0).getNombre());

    }

    //Con este metodo pedimos un numero al user y q sea valido, lo hacemos private para q solo se use aqui
    private static int pedirNumero(Scanner sc, String mensaje, int min, int max) {
        //Hacemos un buvle infinito para q pida los numeros hasta q sea valido
        while (true) {
            
            //Muestra el mensaje q le pasemos
            System.out.print(mensaje);
            
            //Intentamos leer y converetir el numero
            try {
                
                //se lee la linea y quitamos espacios x si acaso
                int num = Integer.parseInt(sc.nextLine().trim());
                
                //Si el numero esta dentro del rango se devuelve y se acaba el metodo
                if (num >= min && num <= max) {
                    return num;
                }
                
                //Si no es asi damos error y pedimos de nuevo
                System.out.println("Error: el numero debe estar entre " + min + " y " + max);
            } 
            
            //En caso de q escriba letras da un error
            catch (Exception e) {
                System.out.println("❌ Error: debes escribir un numero valido.");
            }
        }
    }
}