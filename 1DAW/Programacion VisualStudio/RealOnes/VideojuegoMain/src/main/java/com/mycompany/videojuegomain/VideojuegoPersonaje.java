/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.videojuegomain;

/**
 *
 * @author USUARIO
 */
public class VideojuegoPersonaje {
   //Atributos
    private String nombre;
    private int vida;
    private boolean vive;
    
    //Constructor
    public VideojuegoPersonaje(String nombre) {
        this.nombre = nombre;
        this.vida = 100;
        this.vive = true;
    }
    
    public void recibirDaño(int daño) {
        vida -= daño;

        if (vida <= 0) {
            vida = 0;
            vive = false;
            System.out.println("¡" + nombre + " ha muerto!");
        }
    }
    
    public int generarDaño() {
        int daño = (int)(Math.random() * 51); // 0 a 50
        return daño;
    }
    
    public void curarse() {
        int cura = (int)(Math.random() * 21); // 0 a 20
        vida += cura;

        if (vida > 100) {
            vida = 100;
        }
        
        System.out.println(nombre + " se ha curado " + cura + " puntos.");

    }
    
    public int getVida() {
        return vida;
    }
    
    public boolean estaVivo() {
        return vive;
    }
    
    
}