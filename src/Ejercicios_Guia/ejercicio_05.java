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

//Escribir un programa que lea un número entero por teclado y muestre por pantalla el
//doble, el triple y la raíz cuadrada de ese número. Nota: investigar la función
//Math.sqrt().

public class ejercicio_05 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        int num;

        System.out.println("por favor ingrese un numero");
        num = leer.nextInt();
        System.out.println("");
        System.out.println("El doble de " + num + " es " + (num * 2));
        System.out.println("");
        System.out.println("El triple de " + num + " es " + (num * 3));
        System.out.println("");
        System.out.println("El doble de " + num + " es " + (Math.sqrt(num)));
        System.out.println("");

    }
}
