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

//Crear una función rellene un vector con números aleatorios, pasándole un arreglo por
//parámetro. Después haremos otra función o procedimiento que imprima el vector.

public class ejercicioExtra_20 {
    
    static Scanner entrada = new Scanner(System.in);
    
    public static void main(String[] args) {
        
        int n = 10;
        int[] vector = new int[n];

        rellenarVector(vector, n);
        mostrarVector(vector, n);
        
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
    
}
