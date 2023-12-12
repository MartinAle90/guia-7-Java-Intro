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

//Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito, cuántos
//de 2 dígitos, etcétera (hasta 5 dígitos).

public class ejercicio_17 {

    static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {

        int n, num;
        System.out.println("ingrese el tamaño del vector ");
        n = entrada.nextInt();
        int[] vector = new int[n];

        rellenarVector(vector, n);
        mostrarVector(vector, n);
        System.out.println("");

        for (int i = 0; i < 5; i++) {
            buscarNumero(vector, n, i + 1);
        }

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

    public static void buscarNumero(int[] vector, int n, int num) {

        int cont;
        cont = 0;

        for (int i = 0; i < n; i++) {
            if (vector[i] == num) {
                cont = cont + 1;
            }
        }
        System.out.println("Se contabilizaron " + cont + " número/s de " + num + " digito/s");
    }

}
