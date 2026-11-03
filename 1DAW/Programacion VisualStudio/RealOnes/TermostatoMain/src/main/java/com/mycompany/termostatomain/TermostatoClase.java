/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.termostatomain;

/**
 *
 * @author USUARIO
 */
public class TermostatoClase {
    //Atributos
    int tempUser;
    int tempActual;
    int limiteInferior;
    int limiteSuperior;

    public TermostatoClase(int tempUser) {
        this.tempUser = tempUser;
        this.tempActual = 20;
        AjustarLimmites();
        
    }
    
    private void AjustarLimmites(){
        limiteSuperior = 30;
        limiteInferior = 10;
        
    }
    
    public void RevisarTempUser (){
        
        if (tempUser <= limiteSuperior && tempUser >= limiteInferior){
            tempActual = tempUser;
            
        }
        
        else if (tempUser < limiteInferior){
            System.out.println("Por motivos de ahorro no es posible, tu temp actual es: " + tempActual);
        
        }
        
        else {
            System.out.println("Por motivos de ahorro no es posible, tu temp actual es: " + tempActual);

        }
        
        
        
    }
    
}
