/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.simuladormedieval;

public class Agricultor extends Sujeto implements Movible, Comerciable {
    public Agricultor() { super(); }
    @Override public void mover() { super.mover(); }

    public void recolectar() {
        sumarTrigo(3 + rand.nextInt(4));
        sumarFruta(2 + rand.nextInt(3));
        System.out.println("Agricultor " + getId() + " recolectó trigo y fruta");
    }

    @Override public void vender(Sujeto c, String r, int cant) {
        if (r.equals("trigo") && trigo >= cant) {
            trigo -= cant;
            c.sumarTrigo(cant);
        }
    }
    @Override public boolean puedeComprar(String r, int c) { return true; }
}