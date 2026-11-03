/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.practicaevaluablera3act3;

/**
 *
 * @author angel
 */
//Se importa el paquete Scanner para poder pedir a usuario la longitud de la piramide
import java.util.Scanner;
public class PracticaEvaluableRA3Act3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        //Se pide a usuario que introduzca la altura para la piramide
        System.out.println("Vamos a imprimir una piramide!");
        System.out.println("Introduce el numero: ");
        byte num = sc.nextByte();
        
        //Se llama a la funcion piramide
        piramide(num);
    }
    
    //Esta es la funcion piramide que al no devolver nada es void y se le pasa
    //la variable num
    static void piramide(byte num){
        //En este bucle, mientras i sea menor que num, siempre va a imprimir 1
        for (int i = 1; i <= num; i++){
            //Para que cada linea imprima 1, se elimina ln para que no haga saltos d elinea
            System.out.print("1");
            
            //Se introduce en el for un condicional, ya que como la primera 
            //linea no tiene que imprimir asteriscos solo se leera a partir 
            //de la segunda linea y cuando i valga 2 o mas
            if (i > 1) {
                //Este bucle imprimira la cantidad de asteriscos, para ello al 
                //estar dentro de un condicional, como siempre i va a ser mayor que j 
                //siempre imprimira la cantidad de asteriscos menor que i, y de nuevo 
                //se omite ln para evitar los saltos de linea
                for (int j = 1; j < i; j++) {
                    System.out.print("*");
                }
                //Como en el ejemplo al final de los asteriscos debe verse el numero 
                //incrementeado segun la fila, se imprime i de nuevo sin ln 
                System.out.print(i);
            }
            //Fuera del condiconal y bucle, para poder seguir con la siguiente linea
            //se imprime un sout con ln vacio
            System.out.println();
        }
    }
}
