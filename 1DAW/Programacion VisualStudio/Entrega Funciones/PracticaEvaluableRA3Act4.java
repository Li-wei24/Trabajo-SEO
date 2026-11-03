/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.practicaevaluablera3act4;

/**
 *
 * @author angel
 */
//Se importa el paquete Scanner para poder pedir a usario numeros y booleano
import java.util.Scanner;
public class PracticaEvaluableRA3Act4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        //Se pide a usuario el numero entero que se recoje en num
        System.out.println("introduce un numero entero: ");
        int num = sc.nextInt();
        
        //Usuario introduce el valor del boolean segun lo que escojan y se guarda en opcion
        System.out.println("Quieres hacer el cuadrado (true) o la raiz (false)?: ");
        boolean opcion = sc.nextBoolean();
        
        //Se crea variable resultado que guarda la llamada de la funcion 
        //operaciones para luego poder mostrar el resultado en pantalla
        double resultado = operaciones(opcion, num);
        
        //Se muestra por pantalla el resultado de la funcion a traves de la variable anterior
        System.out.println("Este es el resultado de la opcion que escogiste: " + resultado);
    }
    
    //La funcion operaciones devolvera el valor resultado y le pasamos las variables opcion y num
    static double operaciones (boolean opcion, int num){
        //Se crea resultado dentro de la funcion ya que sera el valor que devolvamos 
        double resultado = 0;
        //En caso de que usuario haya escrito true calculará el cuadrado de num y lo guarda en resultado
        if (opcion == true){
            resultado = num * num; 
        }
        
        //En caso de que haya escrito otra cosa se calculará la raiz cuadrada de num que se guarda en resultado
        //para calcularlo usamos la clase estatica math y sqrt que es la abreviatura de Square root (raiz cuadrada)
        // y por ultimo pasamos num que es donde se guarda el valor que nos paso usuario
        else {
            resultado = Math.sqrt(num);
        }
        
        //Como queremos que se muestre lo calculado devolvemos resultado
        return resultado;
    }
}
