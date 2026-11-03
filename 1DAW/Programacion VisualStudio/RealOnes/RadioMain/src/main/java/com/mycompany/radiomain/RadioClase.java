/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.radiomain;

/**
 *
 * @author USUARIO
 */
public class RadioClase {
    //Atributos
    double frecuenciaMinima;
    double frecuenciaMaxima;
    double frecuenciaActual;
    
    //Constructor
        
    public RadioClase(double frecuenciaActual) {
        this.frecuenciaMinima = 87.5;
        this.frecuenciaMaxima = 108.00;
        this.frecuenciaActual = frecuenciaActual;
    }
    
    //Metodos
    
    public void subirFrecuencia(){
        if (frecuenciaActual < 108.00){
            System.out.println("Se va s sumar 0.5 mas a tu frecuencia actual... ");
            frecuenciaActual += 0.5;
            
        }
        
        else if (frecuenciaActual == 108.00){
            System.out.println("Se va a sumar 0.5 a tu frecuencia actual...");
            frecuenciaActual = 87.5;
        }
    }
    
    public void bajarFrecuencia(){
        if (frecuenciaActual > 87.5){
            System.out.println("Se va a restar 0.5 menos a tu frecuencia actual...");
            frecuenciaActual -= 0.5;
            System.out.println("Esta es tu frecuencia actual: " + frecuenciaActual);
        }
        
        else if (frecuenciaActual == 87.5){
            System.out.println("Se va a restar 0.5 menos a tu frecuencia actual...");
            frecuenciaActual = 108.00;
        }
    }

    public double getFrecuenciaActual() {
        return frecuenciaActual;
    }
    
    
    
}
