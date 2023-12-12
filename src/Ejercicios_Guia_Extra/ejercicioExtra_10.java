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

//Realice un programa para que el usuario adivine el resultado de una multiplicación entre
//dos números generados aleatoriamente entre 0 y 10. El programa debe indicar al usuario
//si su respuesta es o no correcta. En caso que la respuesta sea incorrecta se debe permitir
//al usuario ingresar su respuesta nuevamente. Para realizar este ejercicio investigue como
//utilizar la función Math.random() de Java.

public class ejercicioExtra_10 {

    static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {

        int num1, num2, num, producto, cont;
        cont = 0;
        num1 = asignarAleatorios();
        num2 = asignarAleatorios();
        producto = num1 * num2;

        do {
            System.out.println("adivine el numero");
            num = entrada.nextInt();
            cont = cont + 1;

            if (num > producto) {
                System.out.println("el numero ingresado es mayor al buscado");

            } else if (num < producto) {
                System.out.println("el numero ingresado es menor al buscado");
            }

        } while (num != producto);

        System.out.println("Adivinaste! El numero era " + producto);
        System.out.println("Resultado de " + num1 + " * " + num2);
        System.out.println("Te llevó " + cont + " intentos");
    }

    public static int asignarAleatorios() {

        int num;
        num = (int) Math.floor(Math.random() * (10 - 0 + 1) + 0);
        return num;
    }
}
