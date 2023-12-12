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

//Realizar un algoritmo que calcule la suma de todos los elementos de un vector de tamaño
//N, con los valores ingresados por el usuario.

public class ejercicioExtra_18 {

    static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {

        int n, suma;

        System.out.println("Ingrese el tamaño del vector");
        n = entrada.nextInt();
        System.out.println("");
        int[] vector = new int[n];
        rellenarVector(vector, n);
        mostrarVector(vector, n);
        suma = sumaVector(vector, n);
        System.out.println("La suma de todos los elementos del vector es: " + suma);
    }

    public static void rellenarVector(int[] vector, int n) {

        for (int i = 0; i < n; i++) {
            vector[i] = (int) Math.floor(Math.random() * (10 - 1 + 1) + 1);
        }
    }

    public static void mostrarVector(int[] vector, int n) {

        for (int i = 0; i < n; i++) {
            System.out.print("[" + vector[i] + "] ");
        }
        System.out.println("");
    }
    
    public static int sumaVector(int[] vector, int n) {

        int suma;

        suma = 0;
        for (int i = 0; i < n; i++) {
            suma = suma + vector[i];
        }
        System.out.println("");
        return suma;
    }
        
}
