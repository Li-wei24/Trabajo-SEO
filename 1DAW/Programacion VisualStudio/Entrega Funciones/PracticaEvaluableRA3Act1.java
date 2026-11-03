/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.practicaevaluablera3act1;

/**
 *
 * @author angel
 */
//Se importa el paquete Scanner para poder pedir a usuario numeros.
import java.util.Scanner;
public class PracticaEvaluableRA3Act1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Se inicializan las variables numBaseMayor y numBaseMenor que guardaran a futuro dichos numeros par luego mostrarlos
        byte numBaseMayor = 0;
        byte numBaseMenor = 0;
        //La variable num recogera los numeros escritos por usuario para luego ser comparados con las otras variables
        byte num = 0;
        
        //En el bucle for, se pregunta a usuario 5 veces que introduzca un numero
        for (byte i = 1; i <= 5; i++){
            System.out.println("Introduce el numero (Secuencia " + i + "): ");
            num = sc.nextByte();
            
            //En este if, solo se ejecuta una vez, es decir solo en la primera secuencia para asignar un numero que 
            //siempre será el primero que introduzca el usuario para poder hacer la comparación mas adelante
            if (i == 1){
                numBaseMayor = num;
                numBaseMenor = num;
            }
            
            //En el momento que se inicie la segunda secuencia se ejecutrá siempre este else, aqui se anida un 
            //if comparando num con numBaseMayor y numBaseMenor y guardandose el valor mas pequeño o mayor en sus respectivas variables
            else {
                if (num > numBaseMayor){
                    numBaseMayor = num;
                }
       
                else if (num < numBaseMenor){
                    numBaseMenor = num;
                }
            }
        }
        
        //Se imprime cual es el numero mas grande y menor
        System.out.println("Este es el numero mas grande: " + numBaseMayor);
        System.out.println("Este es el numero mas pequeño: " + numBaseMenor);
    }
}
