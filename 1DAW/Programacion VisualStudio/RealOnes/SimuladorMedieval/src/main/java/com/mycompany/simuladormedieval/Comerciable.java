/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.simuladormedieval;

public interface Comerciable {
    void vender(Sujeto comprador, String recurso, int cantidad);
    boolean puedeComprar(String recurso, int cantidad);
}