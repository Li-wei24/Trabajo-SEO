/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.practicaevaluablera3act7;

/**
 *
 * @author angel
 */
//Se importa paquete Scanner para recoger la mascota y años
import java.util.Scanner;
public class PracticaEvaluableRA3Act7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        //Se pregunta a usuario años de mascota y se guarda en byte anios
        System.out.println("Cuantos anios tiene la mascota?: ");
        byte anios = sc.nextByte();
        
        //Se pregunta a usuario su mascota y se guarda en char, que se agregar charAt(0) 
        //para que recoja la primera letra
        System.out.println("Tienes un (P)erro o (G)ato?: ");
        char mascota = sc.next().charAt(0);
        
        //Guardamos la funcion en equivalencia y lo imprimimos por pantalla
        byte equivalencia = calculoAnios (mascota, anios);
        System.out.println("Estos son los años que verdaderamente tiene tu mascota: " + equivalencia);
    }
    
    //La funcion calculoAnios permite calcular la quivalencia de años, es decir la edad pasada 
    //por usuario (anios), se convertirá a la edad real de la mascota
    static byte calculoAnios(char mascota, byte anios){
        byte resultado = 0;
        
        //Desde un condicional deducimos si es gato o perro teniendo en cuenta mayusculas y minusculas
        if (mascota == 'p' || mascota == 'P'){
            //Introducimos un bucle for, en el que i funciona como contador mientras anios sea mayor o igual a 0
            //ya que en algun momento i sera igual que anios
            for (int i = 1; anios >= i; i++){
                
                //Como el primer año de la mascota equivale a 15 años, si i equivale a 1 en resultado se guardara la equivalencia
                if (i == 1){
                   resultado += 15; 
                }
                
                //Como el segundo año de la mascota equivale a 9 años, si i equivale a 2 en resultado se guardara la equivalencia
                else if (i == 2){
                    resultado += 9;
                }
                
                //Como el tercer año o mas de la mascota equivale a 15 años, si i equivale a 3 o mas en resultado la equivalencia
                else if (i >= 3){
                    resultado += 4;
                }
            
            }
        }
        
        //Para el caso de los gatos es exactamente igual, salvo que en vez de apartir del tercer año incluyendelo se le sumara 5 años
        if (mascota == 'g' || mascota == 'G'){
            for (int i = 1; anios >= i; i++){
                
                if (i == 1){
                   resultado += 15; 
                }
                
                else if (i == 2){
                    resultado += 9;
                }
                
                else if (i >= 3){
                    resultado += 5;
                }
            
            }
        }
        
        //Devolvemos resultado, que es donde se a estado acumulando las sumas de años
        return resultado;
    }
}
