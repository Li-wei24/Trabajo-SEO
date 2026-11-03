/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.simuladormedieval;

public class Pastor extends Sujeto implements Movible, Comerciable {
    public Pastor() { super(); }
    @Override public void mover() { super.mover(); }

    public void recolectarGanado() {
        int cant = 3 + rand.nextInt(4);
        sumarCarne(cant);
        System.out.println("Pastor " + getId() + " recolectó " + cant + " carne");
    }

    @Override public void vender(Sujeto comprador, String recurso, int cantidad) {
        if (recurso.equals("carne") && carne >= cantidad) {
            carne -= cantidad;
            comprador.sumarCarne(cantidad);
        }
    }
    @Override public boolean puedeComprar(String r, int c) { return true; }
}