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

//Crear un programa que dado un numero determine si es par o impar.

public class ejercicio_06 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        int num;

        System.out.println("Ingrese un numero para saber si es par o impar");
        num = leer.nextInt();

        if ((num % 2) == 0) {
            System.out.println("numero par");
        } else {
            System.out.println("numero impar");
        }
    }

}
