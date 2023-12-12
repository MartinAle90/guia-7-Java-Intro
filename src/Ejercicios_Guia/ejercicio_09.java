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

//Escriba un programa que pida una frase o palabra y valide si la primera letra de esa frase
//es una ‘A’. Si la primera letra es una ‘A’, se deberá de imprimir un mensaje por pantalla
//que diga “CORRECTO”, en caso contrario, se deberá imprimir “INCORRECTO”. Nota:
//investigar la función Substring y equals() de Java.

public class ejercicio_09 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        String frase, primerCaracter;

        System.out.println("El programa valida si la primera letra es A");
        System.out.println("Ingrese una frase");
        frase = leer.nextLine();
        primerCaracter = frase.substring(0, 1);
        System.out.println(primerCaracter);
        if (primerCaracter.equalsIgnoreCase("A")) {
            System.out.println("Correcto");
        } else {
            System.out.println("Incorrecto");
        }

    }

}
