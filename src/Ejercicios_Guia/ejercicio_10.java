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

//Escriba un programa en el cual se ingrese un valor limite positivo, y a continuación
//solicite números al usuario hasta que la suma de los números introducidos supere el
//limite inicial. 

public class ejercicio_10 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        int numLimite, suma, num;

        System.out.println("ingrese un valor limite a superar");
        numLimite = leer.nextInt();
        suma = 0;
        do {
            System.out.println("ingrese un numero");
            num = leer.nextInt();
            suma = suma + num;
        } while (numLimite >= suma);

        System.out.println("Se supero el valor limite " + numLimite + " con la suma igual a " + suma);

    }

}
