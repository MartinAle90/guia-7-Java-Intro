/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios_Guia_Extra;

/**
 *
 * @author Martin
 */

//Declarar cuatro variables de tipo entero A, B, C y D y asignarle un valor diferente a cada
//una. A continuación, realizar las instrucciones necesarias para que: B tome el valor de C, 
//C tome el valor de A, A tome el valor de D y D tome el valor de B. Mostrar los valores
//iniciales y los valores finales de cada variable. Utilizar sólo una variable auxiliar.

public class ejercicioExtra_02 {

    public static void main(String[] args) {

        int A, B, C, D, aux;

        A = (int) Math.floor(Math.random() * (10 - 1 + 1) + 1);
        B = (int) Math.floor(Math.random() * (10 - 1 + 1) + 1);
        C = (int) Math.floor(Math.random() * (10 - 1 + 1) + 1);
        D = (int) Math.floor(Math.random() * (10 - 1 + 1) + 1);

        System.out.println("A=" + A);
        System.out.println("B=" + B);
        System.out.println("C=" + C);
        System.out.println("D=" + D);
        System.out.println("");

        aux = A;
        A = D;
        D = B;
        B = C;
        C = aux;

        System.out.println("A=" + A);
        System.out.println("B=" + B);
        System.out.println("C=" + C);
        System.out.println("D=" + D);
        System.out.println("");
    }

}
