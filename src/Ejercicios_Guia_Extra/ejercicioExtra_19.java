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

//Escriba un programa que averigüe si dos vectores de N enteros son iguales (la
//comparación deberá detenerse en cuanto se detecte alguna diferencia entre los
//elementos).

public class ejercicioExtra_19 {

    static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {

        int n = 10;
        int[] vectorA = new int[n];
        int[] vectorB = new int[n];

        rellenarVector(vectorA, n);
        mostrarVector(vectorA, n);
        rellenarVector(vectorB, n);
        mostrarVector(vectorB, n);
        compararVectores(vectorA, vectorB, n);

    }

    public static void rellenarVector(int[] vector, int n) {

        for (int i = 0; i < n; i++) {
            vector[i] = (int) Math.floor(Math.random() * (1 - 1 + 1) + 1);
        }
    }

    public static void mostrarVector(int[] vector, int n) {

        for (int i = 0; i < n; i++) {
            System.out.print("[" + vector[i] + "] ");
        }
        System.out.println("");
    }

    public static void compararVectores(int[] vectorA, int[] vectorB, int n) {

        int cont = 0;

        for (int i = 0; i < n; i++) {
            if (vectorA[i] != vectorB[i]) {
                System.out.println("Los vectores no son iguales");
                break;
            } else {
                cont = cont + 1;
            }
        }
        if (cont == n) {
            System.out.println("Los vectores son iguales");
        }
    }

}
