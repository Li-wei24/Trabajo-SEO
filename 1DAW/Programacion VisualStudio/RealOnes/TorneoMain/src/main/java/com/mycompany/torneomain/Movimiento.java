/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.torneomain;

//Usamos un enum para que solo se permitan 3 valores, piedra papel y tijera
public enum Movimiento {
    PIEDRA, PAPEL, TIJERA;
    
    //Establecemos el metodo que deduce que movimiento gana al otro, si uno de estos se cumple devuelve true
    //Y sabremos quien gana, necesita que le pases un movimiento (del rival) para poder compararlo 
    //con el mío y decir si gana
    public boolean ganaContra(Movimiento otro) {
        return (this == PIEDRA && otro == TIJERA) ||
               (this == PAPEL && otro == PIEDRA) ||
               (this == TIJERA && otro == PAPEL);
    }
}