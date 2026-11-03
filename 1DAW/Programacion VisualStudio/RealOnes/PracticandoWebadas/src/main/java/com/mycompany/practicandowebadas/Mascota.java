/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practicandowebadas;

/**
 *
 * @author USUARIO
 */
class Mascota {
    String nombre;
    byte energia;
    
    public Mascota (String nombre){
        this.nombre = nombre;
        this.energia = 10;
    }
    
    public void jugar (){
        energia -= 2;
    }

    public byte getEnergia() {
        return energia;
    }
    
    public void comer (){
        energia += 2;
    }
    
}
