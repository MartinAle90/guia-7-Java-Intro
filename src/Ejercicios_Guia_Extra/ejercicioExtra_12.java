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

//Necesitamos mostrar un contador con 3 dígitos (X-X-X), que muestre los números del 0-
//0-0 al 9-9-9, con la particularidad que cada vez que aparezca un 3 lo sustituya por una E.
//Ejemplo:
//0-0-0
//0-0-1
//0-0-2
//0-0-E
//0-0-4
//0-1-2
//0-1-E
//Nota: investigar función equals() y como convertir números a String.

public class ejercicioExtra_12 {

    static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {

        String num1E, num2E, num3E;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                for (int k = 0; k < 10; k++) {
                    num1E = numeroE(i);
                    num2E = numeroE(j);
                    num3E = numeroE(k);
                    System.out.println(num1E + "-" + num2E + "-" + num3E);
                }
            }
        }
        
    }

    public static String numeroE(int num) {

        String numE;
        numE = Integer.toString(num);
        if ("3".equals(numE)) {
            numE = "E";
        }
        return numE;
        
    }

}
