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

//Realice un programa que compruebe si una matriz dada es anti simétrica. Se dice que
//una matriz A es anti simétrica cuando ésta es igual a su propia traspuesta, pero cambiada
//de signo. Es decir, A es anti simétrica si A = -AT. La matriz traspuesta de una matriz A se
//denota por AT y se obtiene cambiando sus filas por columnas (o viceversa).


public class ejercicio_19 {

    public static void main(String[] args) {

        int n = 3;
        System.out.println("El tamaño de la matrizr es de: " + n + "x" + n);
        int[][] matrizA = new int[n][n];
        int[][] matrizAT = new int[n][n];

        rellenarMatriz(matrizA, n);
        System.out.println("La matriz A es: ");
        mostrarMatriz(matrizA, n);
        System.out.println("");
        matrizTranspuesta(matrizA, matrizAT, n);
        System.out.println("La matriz AT es: ");
        mostrarMatriz(matrizAT, n);
        System.out.println("");
        matrizAntisimetrica(matrizA, matrizAT, n);
    }

    public static void rellenarMatriz(int[][] matriz, int n) {

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matriz[i][j] = (int) Math.floor(Math.random() * (-2 - 1 + 1) + 1);
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

    public static void matrizTranspuesta(int[][] matrizA, int[][] matrizAT, int n) {

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrizAT[j][i] = -matrizA[i][j];
            }
        }
    }

    public static void matrizAntisimetrica(int[][] matrizA, int[][] matrizAT, int n) {

        boolean bandera;
        bandera = true;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (-matrizA[i][j] != matrizAT[i][j]) {
                    bandera = false;
                    break;
                }
            }
        }
        if (bandera == true) {
            System.out.println("La matriz dada SI es AntiSimetrica");
        } else {
            System.out.println("La matriz dada NO es AntiSimetrica");
        }
    }

}
