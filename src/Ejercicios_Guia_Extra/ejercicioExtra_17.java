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

//Crea una aplicación que nos pida un número por teclado y con una función se lo pasamos
//por parámetro para que nos indique si es o no un número primo, debe devolver true si es
//primo, sino false.
//Un número primo es aquel solo puede dividirse entre 1 y si mismo. Por ejemplo: 25 no es
//primo, ya que 25 es divisible entre 5, sin embargo, 17 si es primo.
//¿Qué son los números primos?
//Básicamente, un número primo es un número natural que tiene solo dos divisores o
//factores: 1 y el mismo número. Es decir, es primo aquel número que se puede dividir
//por uno y por el mismo número.
//El primer número primo es 2, y hay 25 números primos entre 1 y 100, ellos son: 2, 3, 5,
//7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89 y 97.

public class ejercicioExtra_17 {
    
    static Scanner entrada = new Scanner(System.in);
    
    public static void main(String[] args) {

        int num;
        boolean resp;

        System.out.println("Ingrese un número para saber si es Primo o No");
        num = entrada.nextInt();
        resp = esPrimo(num);
        
        if (resp) {
            System.out.println("El número "+num+" es primo");
        }else {
            System.out.println("El número "+num+" No es primo");
        }
    }

    public static boolean esPrimo(int numero) {
        int contador = 2;
        boolean primo = true;
        while ((primo) && (contador != numero)) {
            if (numero % contador == 0) {
                primo = false;
            }
            contador++;
        }
        return primo;
    }
    
}
