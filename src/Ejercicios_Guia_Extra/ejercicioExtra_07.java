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

//Realice un programa que calcule y visualice el valor máximo, el valor mínimo y el
//promedio de n números (n>0). El valor de n se solicitará al principio del programa y los
//números serán introducidos por el usuario. Realice dos versiones del programa, una
//usando el bucle “while” y otra con el bucle “do - while”.

public class ejercicioExtra_07 {

    static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {

        int n, cont;
        double num, max, min, suma;
        cont = 0;
        max = 0;
        min = 0;
        suma = 0;
        do {
            System.out.println("Ingresa la cantidad de valores que desea ingresar");
            n = entrada.nextInt();
        } while (n <= 0);
        for (int i = 0; i < n; i++) {
            System.out.println("Ingrese un número");
            num = entrada.nextDouble();
            suma = suma + num;
            cont = cont + 1;
            if (num >= max) {
                max = num;
            }
            if (num <= min) {
                min = num;
            }
        }
        System.out.println("El valor maximo de los n números es " + max);
        System.out.println("El valor minimo de los n números es " + min);
        System.out.println("El valor promedio de los n números es " + (suma / cont));
    }

}
