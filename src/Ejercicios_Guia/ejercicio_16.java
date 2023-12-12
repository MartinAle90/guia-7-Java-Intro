/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios_Guia;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Martin
 */

//Realizar un algoritmo que rellene un vector de tamaño N con valores aleatorios y le pida
//al usuario un numero a buscar en el vector. El programa mostrará donde se encuentra el
//numero y si se encuentra repetido

public class ejercicio_16 {

    static Scanner entrada = new Scanner(System.in);
    static Random numAleatorio = new Random();

    public static void main(String[] args) {

        int n;
        System.out.println("ingrese el tamaño del vector:");
        n = entrada.nextInt();
        int[] vector = new int[n];
        llenarVector(vector, n);
        buscarNumero(vector, n);
        mostrarVector(vector, n);

    }

    public static void llenarVector(int[] vector, int n) {

        for (int i = 0; i < n; i++) {
            vector[i] = numAleatorio.nextInt(10);
        }
    }

    public static void mostrarVector(int[] vector, int n) {

        for (int i = 0; i < n; i++) {
            System.out.print("[" + vector[i] + "] ");
        }
        System.out.println("");
    }

    public static void buscarNumero(int[] vector, int n) {

        int num, cont, posicion;
        cont = 0;
        posicion = 0;
        System.out.println("ingrese un numero a buscar:");
        num = entrada.nextInt();

        for (int i = 0; i < n; i++) {
            if (vector[i] == num) {
                cont = cont + 1;
                posicion = i + 1;
            }
        }
        if (cont >= 1) {
            System.out.println("el numero se encontro en la posicion: " + posicion);
            System.out.println("El numero se encontro " + cont + " veces");

        } else {
            System.out.println("El numero buscado no se encontro");
        }
    }
}
