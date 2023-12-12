/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios_Guia;

import java.util.Scanner;

/**
 *
 * @author Martin
 */

//Escribir un programa que pida tu nombre, lo guarde en una variable y lo muestre por
//pantalla.


public class ejercicio_02 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        String name;
        System.out.println("Ingrese por favor su nombre");
        name = leer.nextLine();
        System.out.println("");
        System.out.println("Hola, muy buenas " + name);

    }

}
