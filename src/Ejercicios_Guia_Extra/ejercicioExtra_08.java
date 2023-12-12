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

//Escriba un programa que lea números enteros. Si el número es múltiplo de cinco debe
//detener la lectura y mostrar la cantidad de números leídos, la cantidad de números pares
//y la cantidad de números impares. Al igual que en el ejercicio anterior los números
//negativos no deben sumarse. Nota: recordar el uso de la sentencia break.

public class ejercicioExtra_08 {

    static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {

        int num, cont, contP, contI;
        double resto;
        int multiplo;
        cont = 0;
        contP = 0;
        contI = 0;
        resto = 1;
        do {
            System.out.println("ingrese un numero");
            num = entrada.nextInt();
            if (num >= 0) {
                cont = cont + 1;
                resto = (num % 5);
                if (resto == 0) {
                    contP = contP + 1;
                } else {
                    contI = contI + 1;
                }
            } else {
                System.out.println("el numero ingresado es negativo");
            }
        } while (resto != 0);
        System.out.println("El numero " + num + " es multiplo de 5");
        System.out.println("");
        System.out.println("Cantidad de numeros ingresados " + cont);
        System.out.println("Cantidad de numeros pares " + contP);
        System.out.println("Cantidad de numeros impares " + contI);
    }

}
