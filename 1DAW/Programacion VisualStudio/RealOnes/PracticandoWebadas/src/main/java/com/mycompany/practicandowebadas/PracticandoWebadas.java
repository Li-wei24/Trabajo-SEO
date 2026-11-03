/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.practicandowebadas;

/**
 *
 * @author USUARIO
 */

import java.util.Scanner;
public class PracticandoWebadas {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        System.out.println("Cual es tu nombre pasajero?: ");
        String nombrePasajero = sc.nextLine();
        
        System.out.println("Cual es tu ciudad de origen?: ");
        String ciudadOrigen = sc.nextLine();
        
        System.out.println("Cual es tu ciudad destino?: ");
        String ciudadDestino = sc.nextLine();
        
        BilleteVuelo bv = new BilleteVuelo(nombrePasajero, ciudadOrigen, ciudadDestino);
        
        System.out.println("Este es tu codigo de reserva " + bv.getNombrePasajero() + " : " + bv.getCodigoReserva());
    }
}
