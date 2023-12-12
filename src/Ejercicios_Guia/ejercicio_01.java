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
public class ejercicio_01 {
    
//    Escribir un programa que pida dos números enteros por teclado y calcule la suma de los
//    dos. El programa deberá después mostrar el resultado de la suma
    
    public static void main(String[] args) {

        int num1, num2, suma;
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese el primer número entero para sumar");
        num1 = leer.nextInt();
        System.out.println("Ingrese el segundo número entero para sumar");
        num2 = leer.nextInt();

        suma = num1 + num2;

        System.out.println("El resultado de la suma es: " + suma);

    }

}
