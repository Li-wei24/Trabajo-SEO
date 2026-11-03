
package com.mycompany.pruebasherenciamain;

public class Prueba2Clase extends PruebasHerenciaClass {
    @Override
    void interpretar (){
        System.out.println("Tocando el piano:");
        // Usa un bucle for para recorrer 'tablaNotas' 
        // desde 0 hasta 'contador' e imprimirlas.
        for (int i = 0; i < contador; i++) {
            System.out.print(tablaNotas[i] + " ");
        }
        System.out.println();
    }
}
