/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.termostatomain;

/**
 *
 * @author USUARIO
 */

import java.util.Scanner;
public class TermostatoMain {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        int tempUser = 0;
        
        System.out.println("Bienvenido a tu termostato!");
        TermostatoClase termostato = new TermostatoClase (20);

        while (tempUser != -1){

            System.out.println("Introduce la temperatura deseada: ");
            tempUser = sc.nextInt();
        
            if (tempUser != -1) {
                termostato.tempUser = tempUser;
                
                termostato.RevisarTempUser();
            }
        }
    }
}
