/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio448;

/**
 *
 * @author USUARIO
 */

import java.util.Scanner;
public class Ejercicio448 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce una palabra o frase: ");
        String texto = sc.nextLine();
        String resultado = "";

        for (int i = 0; i < texto.length(); i++) {
            char c = texto.charAt(i);

            switch (c) {
                case 'a':
                case 'A':
                    resultado += '@';
                    break;
                case 'e':
                case 'E':
                    resultado += '€';
                    break;
                case 'i':
                case 'I':
                    resultado += '1';
                    break;
                case 'o':
                case 'O':
                    resultado += '0';
                    break;
                case 'u':
                case 'U':
                    resultado += 'µ';
                    break;
                default:
                    resultado += c;
            }
        }

        System.out.println("Texto modificado:");
        System.out.println(resultado);

        sc.close();
    }
}

