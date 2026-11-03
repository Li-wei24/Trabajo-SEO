/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.practicaevaluablera3act6;

/**
 *
 * @author angel
 */
//Se importa paquete Scanner para pedir a usuario un numero
import java.util.Scanner;
public class PracticaEvaluableRA3Act6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //Se pide a usuario que inscriba un numero y es guardado en num
        System.out.println("Introduce un numero: ");
        int num = sc.nextInt();
        
        //Guardamos la funcion digitos en una variable de tipo byte (cifras)
        byte cifras = digitos(num);
        
        //Guardamos la funcion opciones en una variable double (opcion)
        double opcion = opciones (num);
         //Mostramos por pantalla la cantidad de digitos que tiene num y segun su cantidad de cifras la operacion en cuestión
        System.out.println("Tu numero tiene " + cifras + " digitos");
        System.out.println("Según las cifras de tu numero, si es par se divide entre 2 y si es impar por 2.");
        System.out.println("Este es el resultado: " + opcion);
    }
    
    //Se hace funcion de tipo byte y se le pasa parametro num, esta funcion cuenta la cantidad de cifras que tiene num
    static byte digitos (int num){
        byte cifras = 0;
        
        //Con un bucle for contamos las cifras, mientras sea mayor que diez, el numero se dividira entre 10 ya que nos 
        //proporciona el coeficiente, es decir devuelve el numero sin una cifra y se guarda de nuevo en num para obtener la cantidad e cifras
        for (cifras = 1; num >= 10; cifras++){
            num = num / 10;
        }
        
        //Devuelve el valor de cifras
        return cifras;
    }
    
    //Esta funcion de tipo double se le pasa el parametro num para que segun cantidad de cifras (Par o impar) haga una cosa u otra
    static double opciones (int num){
        //Guardamos a la funcion digitos en la variable numCifras
        byte numCifras = digitos (num);
        double resultado = 0;
        
        //Se crea condicional, segun el numero de cifras, que es lo que devolvia la funcion digitos, las divide entre dos con un % para averiguar si son pares
        //En caso de serlo divide num entre 2 con un / para obtener el coeficiente
        if (numCifras % 2 == 0){
            resultado = num / 2;
        }
        
        //Si al dividirlo entre 2 con % es diferente de 0, multiplicara el numero por 2
        else {
            resultado = num * 2;
        }
        //Se devuelve la variable resultado
        return resultado;
    }
}
