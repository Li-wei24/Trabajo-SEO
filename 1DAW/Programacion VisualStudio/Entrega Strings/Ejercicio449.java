/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio449;

/**
 *
 * @author USUARIO
 */
import java.util.Scanner;
public class Ejercicio449 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce una palabra: ");
        String palabra = sc.nextLine();

        System.out.print("Introduce el numero de letras por secuencia: ");
        int n = sc.nextInt();

        for (int i = 0; i < palabra.length(); i += n) {
            if (i + n <= palabra.length()) {
                System.out.println(palabra.substring(i, i + n));
            } else {
                System.out.println(palabra.substring(i));
            }
        }
    }
}