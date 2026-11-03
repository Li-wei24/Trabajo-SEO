/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.practicaevaluablera3act2;

/**
 *
 * @author angel
 */
//Se importa el paquete Scanner para poder pedir a usuario numeros.
import java.util.Scanner;
public class PracticaEvaluableRA3Act2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        //Aqui se pregunta al usuario que direccion quiere el usuario mirar al inicio
        System.out.println("Donde quieres mirar? (N, S, E, O); ");
        //Aqui se recoge lo que el usuario haya tecleado, el charAt(0) guardara 
        //la primera letra
        char inicio = sc.next().charAt(0);
        
        //Se pregunta a usuario cuantos giros desea realizar y se recoge en un byte
        System.out.println("Cuantos giros quieres realizar?");
        byte numGiros = sc.nextByte();
        
        //Se crea la variable direccion
        char direccion;
        
        //Este bucle permite escoger al usuario en que direccion se va a mirar 
        //y se guarda en la variable direccion
        for (int i = 1; i <= numGiros; i++){
            System.out.println("Giro " + i + ": Izquierda (I) o derecha (D)?: ");
            direccion = sc.next().charAt(0);
            
            //Dentro del bucle se crea un condicional general que se parte 
            //en dos, segun lo que haya escogido el usuario
            if (direccion == 'I' || direccion == 'i'){
                
                //Se crea otro condicional con diferentes opciones segun su 
                //direccion inicial mirara a X punto
                if (inicio == 'N' || inicio == 'n'){
                    inicio = 'O';
                }
                else if (inicio == 'E' || inicio == 'e'){
                    inicio = 'N';
                }
                else if (inicio == 'S' || inicio == 's'){
                    inicio = 'E';
                }
                else if (inicio == 'O' || inicio == 'o'){
                    inicio = 'S';
                }
            }
            
            //Aqui ocurre lo mismo que con la opcion de izquierda pero esta 
            //vez a la derecha
            else if (direccion == 'D' || direccion == 'd'){
                if (inicio == 'N' || inicio == 'n'){
                    inicio = 'E';
                }
                else if (inicio == 'E' || inicio == 'e'){
                    inicio = 'S';
                }
                else if (inicio == 'S' || inicio == 's'){
                    inicio = 'O';
                }
                else if (inicio == 'O' || inicio == 'o'){
                    inicio = 'N';
                }
            }
            //Se muestra al susuario despues de escoger la siguiente direccion 
            //donde estara mirando despues
            System.out.println("Esta es tu direccion ahora mismo: " + inicio);
        }
        
        //Por ultimo se muestra la direccion final
        System.out.println("Tu direccion final es: " + inicio);
    }
}
