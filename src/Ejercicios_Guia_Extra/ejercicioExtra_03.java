/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios_Guia_Extra;

import java.util.Scanner;

/**
 *
 * @author Martin
 */

//Elaborar un algoritmo en el cuál se ingrese una letra y se detecte si se trata de una vocal.
//Caso contrario mostrar un mensaje. Nota: investigar la función equals() de la clase
//String.

public class ejercicioExtra_03 {
    
    static Scanner entrada = new Scanner(System.in);
    
    public static void main(String[] args) {

        char letra;

        System.out.println("Ingrese una letra");
        letra = entrada.next().charAt(0);
        letra = Character.toUpperCase(letra);

        switch (letra) {
            case 'A':
                System.out.println("La letra '"+letra + "' si es una vocal");
                break;
            case 'E':
                System.out.println("La letra '"+letra + "' si es una vocal");
                break;
            case 'I':
                System.out.println("La letra '"+letra + "' si es una vocal");
                break;
            case 'O':
                System.out.println("La letra '"+letra + "' si es una vocal");
                break;
            case 'U':
                System.out.println("La letra '"+letra + "' si es una vocal");
                break;
            default:
                System.out.println("La letra '"+letra+"' no es una vocal");
        }
    }
    
}
