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

//Escribir un programa que pida una frase y la muestre toda en mayúsculas y después toda
//en minúsculas. Nota: investigar la función toUpperCase() y toLowerCase() en
//Java

public class ejercicio_03 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        String frase, fraseMayusculas;
        System.out.println("Por favor ingrese una frase");
        frase = leer.nextLine();
        System.out.println("");
        frase = frase.toUpperCase();
        System.out.println(frase);
        System.out.println("");
        frase = frase.toLowerCase();
        System.out.println(frase);

    }
}
