/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.simuladormedieval;

import java.util.ArrayList;
import java.util.Random;

public class SimuladorMedieval {

    private static final Random rand = new Random();

    public static void main(String[] args) {

        ArrayList<Sujeto> mundo = new ArrayList<>();

        // Creación de individuos
        for (int i = 0; i < 6; i++) mundo.add(new Pastor());
        for (int i = 0; i < 4; i++) mundo.add(new Agricultor());
        for (int i = 0; i < 4; i++) mundo.add(new Maderero());
        for (int i = 0; i < 4; i++) mundo.add(new Pescador());
        for (int i = 0; i < 4; i++) mundo.add(new Minero());

        for (int i = 0; i < 3; i++) mundo.add(new Panadero());
        for (int i = 0; i < 2; i++) mundo.add(new Herrero());
        for (int i = 0; i < 2; i++) mundo.add(new Carpintero());
        for (int i = 0; i < 2; i++) mundo.add(new Carnicero());
        for (int i = 0; i < 2; i++) mundo.add(new Pescadero());

        System.out.println("=== SIMULADOR DE VIDA MEDIEVAL INICIADO ===\n");

        for (int dia = 1; dia <= 12; dia++) {
            System.out.println("--- Día " + dia + " ---");

            // Recolección
            for (Sujeto s : mundo) {
                s.mover();

                if (s instanceof Pastor) {
                    ((Pastor) s).recolectarGanado();
                }
                if (s instanceof Agricultor) {
                    ((Agricultor) s).recolectar();
                }
                if (s instanceof Maderero) {
                    ((Maderero) s).recolectarMadera();
                }
                if (s instanceof Pescador) {
                    ((Pescador) s).pescar();
                }
                if (s instanceof Minero) {
                    ((Minero) s).minar();
                }
            }

            // Interacciones cuando están cerca
            for (int i = 0; i < mundo.size(); i++) {
                for (int j = i + 1; j < mundo.size(); j++) {
                    Sujeto a = mundo.get(i);
                    Sujeto b = mundo.get(j);

                    if (a.estaCerca(b)) {
                        System.out.println("¡Se encontraron! " + a.getId().substring(0,8) + "... y " + b.getId().substring(0,8) + "... están cerca");
                        realizarInteraccion(a, b);
                    }
                }
            }

            // Inventario completo de todos
            System.out.println("--- Inventario final del día " + dia + " ---");
            for (Sujeto s : mundo) {
                System.out.printf("%s | Monedas:%d | Carne:%d | Pescado:%d | Pan:%d | Fruta:%d | Trigo:%d | Madera:%d%n",
                        s.getId().substring(0, 8) + "...", 
                        s.getMonedas(), s.getCarne(), s.getPescado(), s.getPan(), s.getFruta(), s.getTrigo(), s.getMadera());
            }
            System.out.println();
        }

        System.out.println("Simulación terminada.");
    }

    private static void realizarInteraccion(Sujeto a, Sujeto b) {
        // Minero -> Herrero
        if (a instanceof Minero && b instanceof Herrero) {
            int oro = 1 + rand.nextInt(3);
            if (a.getMonedas() >= oro) {
                a.setMonedas(a.getMonedas() - oro);
                b.setMonedas(b.getMonedas() + oro);
                System.out.println("→ VENTA: Minero vendió " + oro + " oro al Herrero (se repartieron monedas)");
            }
        }
        // Pastor -> Carnicero
        if (a instanceof Pastor && b instanceof Carnicero) {
            int cant = 2 + rand.nextInt(3);
            int precio = cant * 4;
            if (a.getCarne() >= cant && b.getMonedas() >= precio) {
                ((Pastor) a).vender(b, "carne", cant);
                b.setMonedas(b.getMonedas() - precio);
                System.out.println("→ VENTA: Pastor vendió " + cant + " carne al Carnicero por " + precio + " monedas");
            }
        }
        // Agricultor -> Panadero
        if (a instanceof Agricultor && b instanceof Panadero) {
            int cant = 3 + rand.nextInt(4);
            int precio = cant * 3;
            if (a.getTrigo() >= cant && b.getMonedas() >= precio) {
                ((Agricultor) a).vender(b, "trigo", cant);
                b.setMonedas(b.getMonedas() - precio);
                ((Panadero) b).hacerPan(cant);
                System.out.println("→ VENTA: Agricultor vendió " + cant + " trigo al Panadero por " + precio + " monedas");
            }
        }
    }
}