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

//Crear un programa que dibuje una escalera de números, donde cada línea de números
//comience en uno y termine en el número de la línea. Solicitar la altura de la escalera al
//usuario al comenzar. Ejemplo: si se ingresa el número 3:
//1
//12
//123

public class ejercicioExtra_13 {

    static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {

        int altura;
        System.out.println("ingrese la altura de la escalera");
        altura = entrada.nextInt();
        System.out.println("");
        escalera(altura);

    }

    public static void escalera(int altura) {

        int cont;
        cont = 0;
        do {
            cont = cont + 1;
            for (int i = 0; i < cont; i++) {
                System.out.print("" + (i + 1));
            }
            System.out.println("");
        } while (cont < altura);

    }

}
