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

//Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al 9 donde la
//suma de sus filas, sus columnas y sus diagonales son idénticas. Crear un programa que
//permita introducir un cuadrado por teclado y determine si este cuadrado es mágico o no.
//El programa deberá comprobar que los números introducidos son correctos, es decir,
//están entre el 1 y el 9.

public class ejercicio_20 {

    static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {

        int n = 3;
        System.out.println("El tamaño de la matriz A es de: " + n + "x" + n);
        int[][] matrizA = new int[n][n];
        int[][] matrizAT = new int[n][n];

        llenarMatrizUsuario(matrizA, n);
        System.out.println("");
        System.out.println("La matriz A es: ");
        mostrarMatriz(matrizA, n);
        System.out.println("");
        cuadradoMagico(matrizA, n);

    }

    public static void llenarMatrizUsuario(int[][] matriz, int n) {

        int num;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                do {
                    System.out.println("Ingrese un numero entre el 1 y 9 para la posicion " + (i + 1) + "," + (j + 1));
                    num = entrada.nextInt();
                    if (num >= 1 && num <= 9) {
                        matriz[i][j] = num;
                    } else {
                        System.out.println("Numero ingresado incorrecto");
                    }
                } while (num < 1 || num > 9);
            }
        }
    }

    public static void mostrarMatriz(int[][] matriz, int n) {

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("[" + matriz[i][j] + "] ");
            }
            System.out.println("");
        }
    }

    public static void cuadradoMagico(int[][] matriz, int n) {

        int suma, sumaF;
        boolean magico;
        sumaF = 0;
        magico = true;
        //Se verifica que la suma de las filas
        for (int i = 0; i < n; i++) {
            suma = 0;
            for (int j = 0; j < n; j++) {
                suma = suma + matriz[i][j];
            }
            if (sumaF == 0) {
                sumaF = suma;
            }
            if (suma != sumaF) {
                magico = false;
            }
        }
        //Se verifica que la suma de las columnas
        for (int i = 0; i < n; i++) {
            suma = 0;
            for (int j = 0; j < n; j++) {
                suma = suma + matriz[j][i];
            }
            if (suma != sumaF) {
                magico = false;
            }
        }
        //Se verifica la suma de la diagonal principal
        suma = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    suma = suma + matriz[i][j];
                    break;
                }
            }
        }
        if (suma != sumaF) {
            magico = false;
        }
        //Se verifica la suma de la diagonal secundaria
        suma = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if ((i + j) == (n - 1)) {
                    suma = suma + matriz[i][j];
                    break;
                }
            }
        }
        if (suma != sumaF) {
            magico = false;
        }
        if (magico == true) {
            System.out.println("El cuadrado SI es Magico");

        } else {
            System.out.println("El cuadrado NO es Magico");
        }
    }

}
