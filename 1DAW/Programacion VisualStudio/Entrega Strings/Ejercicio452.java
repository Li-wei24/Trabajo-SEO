/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio452;

/**
 *
 * @author USUARIO
 */

import java.util.Scanner;

public class Ejercicio452 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce una frase: ");
        String frase = sc.nextLine();

        String[] palabras = frase.split(" ");
        int total = palabras.length;

        for (int i = 0; i < total - 1; i++) {
            for (int j = i + 1; j < total; j++) {
                if (palabras[i].compareToIgnoreCase(palabras[j]) > 0) {
                    String aux = palabras[i];
                    palabras[i] = palabras[j];
                    palabras[j] = aux;
                }
            }
        }

        System.out.println("Palabras ordenadas alfabeticamente:");
        for (int i = 0; i < total; i++) {
            System.out.println(palabras[i]);
        }
    }
}
