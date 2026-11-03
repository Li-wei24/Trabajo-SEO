/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio447;

/**
 *
 * @author USUARIO
 */
import java.util.Scanner;

public class Ejercicio447 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el título de la pagina: ");
        String titulo = sc.nextLine();

        System.out.print("Introduce el contenido de la pagina: ");
        String contenido = sc.nextLine();

        System.out.println("DOCUMENTO HTML");

        System.out.println("<!DOCTYPE html>");
        System.out.println("<html>");
        System.out.println("<head>");
        System.out.println("    <meta charset=\"UTF-8\">");
        System.out.println("    <title>" + titulo + "</title>");
        System.out.println("</head>");
        System.out.println("<body>");
        System.out.println("    <h1>" + titulo + "</h1>");
        System.out.println("    <p>" + contenido + "</p>");
        System.out.println("</body>");
        System.out.println("</html>");

        sc.close();
    }
}

