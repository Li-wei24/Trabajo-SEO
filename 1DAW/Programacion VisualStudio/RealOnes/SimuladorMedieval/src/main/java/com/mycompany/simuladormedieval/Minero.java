/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.simuladormedieval;

public class Minero extends Sujeto implements Movible, Comerciable {
    public Minero() { super(); }
    @Override public void mover() { super.mover(); }

    public void minar() {
        monedas += 8 + rand.nextInt(12);
        System.out.println("Minero " + getId() + " extrajo oro y ganó monedas");
    }

    @Override public void vender(Sujeto c, String r, int cant) {
        if (r.equals("monedas") && monedas >= cant) {
            monedas -= cant;
            c.setMonedas(c.getMonedas() + cant);
        }
    }
    @Override public boolean puedeComprar(String r, int c) { return true; }
}