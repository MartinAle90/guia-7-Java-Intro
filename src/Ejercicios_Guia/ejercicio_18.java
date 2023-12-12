/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios_Guia;

/**
 *
 * @author Martin
 */

//Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios y muestre la
//traspuesta de la matriz. La matriz traspuesta de una matriz A se denota por B y se
//obtiene cambiando sus filas por columnas (o viceversa).

public class ejercicio_18 {

    public static void main(String[] args) {

        int n = 4;
        System.out.println("El tamaño de la matrizr es de: " + n + "x" + n);
        int[][] matrizA = new int[n][n];
        int[][] matrizB = new int[n][n];

        rellenarMatriz(matrizA, n);
        System.out.println("La matriz A es: ");
        mostrarMatriz(matrizA, n);
        System.out.println("");
        matrizTranspuesta(matrizA, matrizB, n);
        System.out.println("La matriz B es: ");
        mostrarMatriz(matrizB, n);
    }

    public static void rellenarMatriz(int[][] matriz, int n) {

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matriz[i][j] = (int) Math.floor(Math.random() * (9 - 1 + 1) + 1);
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

    public static void matrizTranspuesta(int[][] matrizA, int[][] matrizB, int n) {

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrizB[j][i] = matrizA[i][j];
            }
        }
    }

}

