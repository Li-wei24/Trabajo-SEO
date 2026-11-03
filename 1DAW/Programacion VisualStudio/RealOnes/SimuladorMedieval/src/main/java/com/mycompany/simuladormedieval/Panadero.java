/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.simuladormedieval;

public class Panadero extends Sujeto implements Movible, Comerciable {
    public Panadero() { super(); }
    @Override public void mover() { super.mover(); }

    public void hacerPan(int cantTrigo) {
        if (cantTrigo > 0) pan += cantTrigo * 2;
    }

    @Override public void vender(Sujeto c, String r, int cant) { }
    @Override public boolean puedeComprar(String r, int c) { return true; }
}