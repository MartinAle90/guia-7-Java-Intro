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

//Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados
//Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).

public class ejercicio_04 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        int gradoC, gradoF;

        System.out.println("Ingrese los grados centigrados");
        gradoC = leer.nextInt();
        System.out.println("");
        gradoF = 32 + (9 * gradoC / 5);
        System.out.println("Su equivalencia en grados Fahrenheit es: " + gradoF);

    }
}
