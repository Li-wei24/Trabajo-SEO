/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.simuladormedieval;

public class Maderero extends Sujeto implements Movible, Comerciable {
    public Maderero() { super(); }
    @Override public void mover() { super.mover(); }

    public void recolectarMadera() {
        sumarMadera(4 + rand.nextInt(5));
        System.out.println("Maderero " + getId() + " recolectó " + (4 + rand.nextInt(5)) + " madera");
    }

    @Override public void vender(Sujeto c, String r, int cant) {
        if (r.equals("madera") && madera >= cant) {
            madera -= cant;
            c.sumarMadera(cant);
        }
    }
    @Override public boolean puedeComprar(String r, int c) { return true; }
}