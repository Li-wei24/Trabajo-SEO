/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.programacionentregaarraysangelssalinastinizaray;

/**
 *
 * @author USUARIO
 */
import java.util.Arrays;
import java.util.Scanner;
public class Ejercicio418 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        int[] t = new int[10];
        int contador = 1;
        
        for (int i = 0; i < 10; i++){
            System.out.println("Introduce el valor " + contador + "de 10: ");
            t[i] = sc.nextInt();
            contador++;
        }
        
        Arrays.sort(t);
        System.out.println("Cual es el valor que buscas?: ");
        int clave = sc.nextInt();
        
        int[] tablaNueva = buscarTodos( t, clave);
        
        System.out.println("Los índices donde se encuentra la clave son: " + Arrays.toString(tablaNueva));
    }
    
    static int[] buscarTodos(int t[], int clave){
        
        int contadorTablaNueva = 0;
        int j = 0;
                
        for (int claveIgual : t){
            if (clave == claveIgual){
                contadorTablaNueva++;
            }
        }
        
        int[] tablaNueva = new int [contadorTablaNueva];
        
        for (int i = 0; i < 10; i++) {
            if (t[i] == clave) {
                tablaNueva[j] = i;
                j++;
            }
        }
        
        return tablaNueva;
    }
}
