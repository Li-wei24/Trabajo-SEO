/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practicandowebadas;

/**
 *
 * @author USUARIO
 */
class Password {
    String palabra;
    byte num;
    String palabraFinal;
    
    public Password (String palabra, byte num){
        this.palabra = palabra;
        this.num = num;
        
        if (num % 2 == 0){
            this.palabraFinal = num + palabra;
        }
        
        else {
            this.palabraFinal = palabra + num;
        }
    }

    public String getPalabraFinal() {
        return palabraFinal;
    }
    
}
