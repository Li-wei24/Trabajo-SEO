/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.practicaevaluablera3act5;

/**
 *
 * @author angel
 */
//Se importa Scanner para pedir a usuario el numero feliz
import java.util.Scanner;
public class PracticaEvaluableRA3Act5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        //Guardamos el año que nos da usuario en anio
        System.out.println("Introduce el año para averiguar si es un año feliz y cuando sera el proximo! (1000 - 9000): ");
        int anio = sc.nextInt();
        
        boolean esAnioFeliz = anioFeliz(anio);
        System.out.println("Es un anio feliz? " + esAnioFeliz);
        
        int nuevoAnioFeliz = anioFelizAprox(anio, esAnioFeliz);
        System.out.println("Tu año feliz mas proximo es: " + nuevoAnioFeliz);
    }
    
    //Esta funcion separa las cifras del año dado por usuario y dice si es año 
    //feliz o no, por lo tanto es boolean
    static boolean anioFeliz (int anio){
        boolean esAnioFeliz;
        
        //Para separar las cifras de anio, con %, obetenemos el resto, es decir la ultima cifra 
        //del numero y la guardamos en restoX, despues dividimos anio de nuevo pero con / ya que 
        //nos da el coeficiente, este lo guardamos de nuevo en anio y realizamos ambos pasos un 
        //total de 4 veces para separar todas las cifras
        int resto1 = anio % 10;
        anio = anio / 10;
        
        int resto2 = anio % 10;
        anio = anio/10;
        
        int resto3 = anio % 10;
        anio = anio/10;
        
        int resto4 = anio % 10;
        anio = anio/10;
        
        //Hacemos un condicional comparando cada resto con los otros restos, en caso 
        //de que alguno sea false se guarda en esAniofeliz y si ninguno coincida se guarda true
        if (resto1 == resto2 || resto1 == resto3 || resto1 == resto4) {
            esAnioFeliz = false;
        }
        
        else if (resto2 == resto1 || resto2 == resto3 || resto2 == resto4) {
            esAnioFeliz = false;
        }
        
        else if (resto3 == resto1 || resto3 == resto2 || resto3 == resto4) {
            esAnioFeliz = false;
        }
        
        else if (resto4 == resto1 || resto1 == resto2 || resto1 == resto3) {
            esAnioFeliz = false;
        }
        
        else {
            esAnioFeliz = true;
        }
        
        //Finalmente se devuleve el boolean
        return esAnioFeliz;
    }
    
    //Esta funcion busca el año feliz mas proximo segun el año que escribo usuario y la 
    //funcion esAnioFeliz, como el resultado es un numero se guarda en un int
    static int anioFelizAprox(int anio, boolean esAnioFeliz){
        //Se crea una variable que guarda la suma de anio mas 1
        int nuevoAnioFeliz = anio++;
        //En bucle while, con la nueva variable creada, le pedimos que siga el bucle 
        //hasta que sea menor o igual a 9mil
        while (nuevoAnioFeliz <= 9000){
            //Dentro del bucle, introducimos un condicional, en el que se llama a la funcion
            //anioFeliz y se le pasa el parametro nuevoAnioFeliz
            if (anioFeliz(nuevoAnioFeliz)){
                //Se devuelve nuevoAnioFeliz, es decir que al completar la otra 
                //funcion y verificar si es año feliz o no lo devolvera
                return nuevoAnioFeliz;
            }
            //En caso de que no sea asi, dentro del chile se suma 1 a nuevoAnioFeliz 
            //y se realiza todo de nuevo hasta que s ecumpla la otra funcion
            nuevoAnioFeliz ++;
        }
        
        //En caso de que no haya ningun año feliz, devuelve el nuemro maximo, es decir 9mil
        return nuevoAnioFeliz;
    }
}
