/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practicandowebadas;

/**
 *
 * @author USUARIO
 */
public class BilleteVuelo {
    String nombrePasajero;
    String ciudadOrigen; 
    String ciudadDestino;
    String codigoReserva;

    
    public BilleteVuelo (String nombrePasajero, String ciudadOrigen, String ciudadDestino){
        this.nombrePasajero = nombrePasajero;
        this.ciudadOrigen = ciudadOrigen;
        this.ciudadDestino = ciudadDestino;
        
        this.codigoReserva = ciudadOrigen.substring(0, 3);
        this.codigoReserva += "-";
        this.codigoReserva += ciudadDestino.substring(0, 3);
        this.codigoReserva = codigoReserva.toUpperCase();
    }

    public String getCodigoReserva() {
        return codigoReserva;
    }

    public String getNombrePasajero() {
        return nombrePasajero;
    }
}
