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
//Dadas dos matrices cuadradas de números enteros, la matriz M de 10x10 y la matriz P de
//3x3, se solicita escribir un programa en el cual se compruebe si la matriz P está contenida
//dentro de la matriz M. Para ello se debe verificar si entre todas las submatrices de 3x3
//que se pueden formar en la matriz M, desplazándose por filas o columnas, existe al
//menos una que coincida con la matriz P. En ese caso, el programa debe indicar la fila y la
//columna de la matriz M en la cual empieza el primer elemento de la submatriz P.

public class ejercicio_21 {

    static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {

        int n, m;
        n = 10;
        m = 3;
        System.out.println("El tamaño de la matriz M es de: " + n + "x" + n);
        System.out.println("El tamaño de la matriz P es de: " + m + "x" + m);
        int[][] matrizM = new int[n][n];
        int[][] matrizP = new int[m][m];

        llenarMatrizUsuario(matrizM, n);
        llenarMatrizUsuario(matrizP, m);
        System.out.println("");
        mostrarMatriz(matrizM, n);
        System.out.println("");
        mostrarMatriz(matrizP, m);
        System.out.println("");
        subMatriz(matrizM, n, matrizP, m);
    }

    public static void llenarMatrizUsuario(int[][] matriz, int n) {

        int num;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matriz[i][j] = (int) Math.floor(Math.random() * (2 - 1 + 1) + 1);
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

    public static void subMatriz(int[][] matrizA, int n, int[][] matrizB, int m) {

        int cont, fila, columna;

        fila = 0;
        columna = 0;

        int[][] matrizAux = new int[m][m];

        for (int l = 0; l < n - 2; l++) {
            for (int k = 0; k < n - 2; k++) {
                cont = 0;
                for (int i = l; i < l + 3; i++) {
                    for (int j = k; j < k + 3; j++) {
                        matrizAux[i - l][j - k] = matrizA[i][j];
                        fila = i;
                        columna = j;
                    }
                }
                for (int i = 0; i < m; i++) {
                    for (int j = 0; j < m; j++) {
                        if (matrizAux[i][j] == matrizB[i][j]) {
                            cont = cont + 1;
                        }
                    }
                }
                if (cont == 9) {
                    fila = fila - 2;
                    columna = columna - 2;
                    System.out.println("Se encontro la submatriz P en la fila " + fila + " y la columna " + columna + " de la matriz M");
                    System.out.println("");
                }
            }
        }
    }

}
