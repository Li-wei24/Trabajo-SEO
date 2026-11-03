/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.simuladormedieval;

import java.util.Random;

public class Sujeto {
    protected String id;
    protected int vida;
    protected int monedas;
    protected int madera;
    protected int carne;
    protected int pescado;
    protected int pan;
    protected int fruta;
    protected int trigo;
    protected int x, y;
    protected int velX, velY;

    protected static final Random rand = new Random();

    public Sujeto() {
        this.id = generarID();
        this.vida = 100;
        this.monedas = 5;
        this.madera = 0;
        this.carne = 0;
        this.pescado = 0;
        this.pan = 0;
        this.fruta = 0;
        this.trigo = 0;
        this.x = rand.nextInt(30);
        this.y = rand.nextInt(30);
        this.velX = rand.nextInt(3) - 1;
        this.velY = rand.nextInt(3) - 1;
    }

    private String generarID() {
        String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        StringBuilder sb = new StringBuilder(16);
        for (int i = 0; i < 16; i++) {
            sb.append(caracteres.charAt(rand.nextInt(caracteres.length())));
        }
        return sb.toString();
    }

    public void mover() {
        x += velX;
        y += velY;
        if (x < 0) x = 0;
        if (x > 29) x = 29;
        if (y < 0) y = 0;
        if (y > 29) y = 29;
    }

    public boolean estaCerca(Sujeto otro) {
        return Math.abs(this.x - otro.x) <= 1 && Math.abs(this.y - otro.y) <= 1;
    }

    public String getId() { return id; }
    public int getMonedas() { return monedas; }
    public int getMadera() { return madera; }
    public int getCarne() { return carne; }
    public int getPescado() { return pescado; }
    public int getPan() { return pan; }
    public int getFruta() { return fruta; }
    public int getTrigo() { return trigo; }
    public int getX() { return x; }
    public int getY() { return y; }

    public void setMonedas(int c) { this.monedas = c; }
    public void sumarMadera(int c) { this.madera += c; }
    public void sumarCarne(int c) { this.carne += c; }
    public void sumarPescado(int c) { this.pescado += c; }
    public void sumarPan(int c) { this.pan += c; }
    public void sumarFruta(int c) { this.fruta += c; }
    public void sumarTrigo(int c) { this.trigo += c; }
}