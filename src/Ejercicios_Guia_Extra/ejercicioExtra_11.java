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

//Escribir un programa que lea un número entero y devuelva el número de dígitos que
//componen ese número. Por ejemplo, si introducimos el número 12345, el programa
//deberá devolver 5. Calcular la cantidad de dígitos matemáticamente utilizando el
//operador de división. Nota: recordar que las variables de tipo entero truncan los
//números o resultados.

public class ejercicioExtra_11 {

    static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {

        int num;
        num = entrada.nextInt();
        enDigitos(num);

    }

    public static void enDigitos(int num) {

        int resto, cont, aux;
        aux = num;
        cont = 0;

        do {
            resto = (int) num % 10;
            num = (num - resto) / 10;
            cont = cont + 1;
        } while (num > 0);

        System.out.println("La cantidad de digitos que componen al numero " + aux + " es de " + cont);

    }

}
