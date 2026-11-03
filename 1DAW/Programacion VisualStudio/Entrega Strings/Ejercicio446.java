/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio446;

/**
 *
 * @author USUARIO
 */

import java.util.Scanner;
public class Ejercicio446 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] agenda = new String[100];
        int total = 0;
        boolean salir = false;

        for (; !salir;) {

            System.out.println("AGENDA");
            System.out.println("a) Añadir contacto");
            System.out.println("b) Buscar telefono");
            System.out.println("c) Mostrar todos");
            System.out.println("d) Salir");
            System.out.print("Elige una opcion: ");

            char opcion = sc.nextLine().charAt(0);

            switch (opcion) {

                case 'a':
                    System.out.print("Introduce contacto (nombre:telefono): ");
                    agenda[total] = sc.nextLine();
                    total++;
                    break;

                case 'b':
                    System.out.print("Introduce el nombre: ");
                    String buscar = sc.nextLine();
                    boolean encontrado = false;

                    for (int i = 0; i < total; i++) {
                        String nombre =
                                agenda[i].substring(0, agenda[i].indexOf(":"));

                        if (nombre.equalsIgnoreCase(buscar)) {
                            String telefono =
                                    agenda[i].substring(agenda[i].indexOf(":") + 1);
                            System.out.println("Telefono: " + telefono);
                            encontrado = true;
                        }
                    }

                    if (!encontrado) {
                        System.out.println("Contacto no encontrado");
                    }
                    break;

                case 'c':
                    for (int i = 0; i < total - 1; i++) {
                        for (int j = i + 1; j < total; j++) {

                            String nombre1 =
                                    agenda[i].substring(0, agenda[i].indexOf(":"));
                            String nombre2 =
                                    agenda[j].substring(0, agenda[j].indexOf(":"));

                            if (nombre1.compareToIgnoreCase(nombre2) > 0) {
                                String aux = agenda[i];
                                agenda[i] = agenda[j];
                                agenda[j] = aux;
                            }
                        }
                    }

                    for (int i = 0; i < total; i++) {
                        System.out.println(agenda[i]);
                    }
                    break;

                case 'd':
                    salir = true;
                    break;

                default:
                    System.out.println("Opcion incorrecta");
            }
        }

    }
}