/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.simuladormedieval;

public class Pescador extends Sujeto implements Movible, Comerciable {
    public Pescador() { super(); }
    @Override public void mover() { super.mover(); }

    public void pescar() {
        sumarPescado(3 + rand.nextInt(5));
        System.out.println("Pescador " + getId() + " pescó " + (3 + rand.nextInt(5)) + " peces");
    }

    @Override public void vender(Sujeto c, String r, int cant) {
        if (r.equals("pescado") && pescado >= cant) {
            pescado -= cant;
            c.sumarPescado(cant);
        }
    }
    @Override public boolean puedeComprar(String r, int c) { return true; }
}