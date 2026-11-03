/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.simuladormedieval;

public class Herrero extends Sujeto implements Movible, Comerciable {
    public Herrero() { super(); }
    @Override public void mover() { super.mover(); }

    public void convertirOro(int cant) {
        if (cant > 0) monedas += cant * 4;
    }

    @Override public void vender(Sujeto c, String r, int cant) { }
    @Override public boolean puedeComprar(String r, int c) { return true; }
}