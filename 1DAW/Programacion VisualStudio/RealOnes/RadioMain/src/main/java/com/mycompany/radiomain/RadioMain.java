/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.radiomain;

/**
 *
 * @author USUARIO
 */

import java.util.Scanner;
public class RadioMain {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        double frecuenciaActual = 95.5;
        System.out.println("La frecuencia inicial es 87.5 y la frecuencia final es 108.00");
        System.out.println("Esta es tu frecuencia actual: " + frecuenciaActual);
        RadioClase radio = new RadioClase (frecuenciaActual);
        int eleccion;
        
        do {
            System.out.println("Deseas subir(1) o bajar(2)?: " );
            eleccion = sc.nextInt();
        
        
            if (eleccion == 1){
                radio.subirFrecuencia();
                }
            
            else if (eleccion == 2) {
                radio.bajarFrecuencia();
                }
        }while (eleccion == 1 || eleccion == 2);
        
        System.out.println("Esta es tu frecuencia final: " +radio.getFrecuenciaActual());
        
    }
}
