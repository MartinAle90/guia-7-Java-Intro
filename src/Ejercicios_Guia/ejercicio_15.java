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

//Realizar un algoritmo que rellene un vector con los 100 primeros números enteros y los
//muestre por pantalla en orden descendente.

public class ejercicio_15 {

    static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {

        int n = 100;
        int[] vector = new int[n];
        llenarVector(vector, n);
        mostrarVectorDescendente(vector, n);
    }

    public static void llenarVector(int[] vector, int n) {

        for (int i = 0; i < n; i++) {
            vector[i] = i + 1;
        }
    }

    public static void mostrarVectorDescendente(int[] vector, int n) {

        for (int i = n - 1; i > -1; i--) {
            System.out.print(vector[i]);
            System.out.println("");
        }
    }
}
