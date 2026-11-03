/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio450;

/**
 *
 * @author USUARIO
 */
import java.util.Scanner;

public class Ejercicio450 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce la frase: ");
        String frase = sc.nextLine();

        String[] palabras = frase.toLowerCase().split(" ");
        String resultado = "";

        for (int i = 0; i < palabras.length; i++) {
            if (i == 0) {
                resultado += palabras[i];
            } else {
                resultado += palabras[i].substring(0, 1).toUpperCase() + palabras[i].substring(1);
            }
        }

        System.out.println("Resultado: " + resultado);
    }
}