/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practicandowebadas;

/**
 *
 * @author USUARIO
 */
public class Television {
    byte nivelActual;
    boolean estado;
    byte canal;
    
    public Television (boolean estado){
        this.estado = estado;
        this. nivelActual = 20;
        this.canal = 53;
    }
    
    public Television (){
    
    }
    
    public void encenderTele (){
        estado = true;
    }
    
    public void apagarTele (){
        estado = false;
    }
    
    public void subirVolumen(){
        if (nivelActual <= 99){
            nivelActual ++;
            
            System.out.println("Nivel Actual: " + nivelActual);
        }
        
        else {
            System.out.println("Has llegado al maximo nivel!");
        }
            
    }
    
    public void bajarVolumen(){
        if (nivelActual >= 1){
            nivelActual --;
            System.out.println("Nivel Actual: " + nivelActual);

        }
        
        else {
            System.out.println("Has llegado al minimo nivel!");
        }
            
    }
    
    
}
