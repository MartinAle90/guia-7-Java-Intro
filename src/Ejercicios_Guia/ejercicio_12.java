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

//Realizar un programa que simule el funcionamiento de un dispositivo RS232, este tipo de
//dispositivo lee cadenas enviadas por el usuario. Las cadenas deben llegar con un formato
//fijo: tienen que ser de un máximo de 5 caracteres de largo, el primer carácter tiene que
//ser X y el último tiene que ser una O.
//Las secuencias leídas que respeten el formato se consideran correctas, la secuencia
//especial “&&&&&” marca el final de los envíos (llamémosla FDE), y toda secuencia
//distinta de FDE, que no respete el formato se considera incorrecta.
//Al finalizar el proceso, se imprime un informe indicando la cantidad de lecturas correctas
//e incorrectas recibidas. Para resolver el ejercicio deberá investigar cómo se utilizan las
//siguientes funciones de Java Substring(), Length(), equals().


public class ejercicio_12 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        String cadena, especial;
        int correctas, incorrectas;

        correctas = 0;
        incorrectas = 0;
        especial = "&&&&&";

        do {
            System.out.println("ingrese una cadena a validar");
            cadena = leer.next();
            cadena = cadena.toUpperCase();
            if (cadena.equals("&&&&&")) {
                break;
            } else {
                if (cadena.length() <= 5) {
                    if (cadena.substring(0, 1).equalsIgnoreCase("X")) {
                        if (cadena.substring(cadena.length() - 1).equalsIgnoreCase("O")) {
                            correctas = correctas + 1;
                        } else {
                            incorrectas = incorrectas + 1;
                        }
                    } else {
                        incorrectas = incorrectas + 1;
                    }
                } else {
                    incorrectas = incorrectas + 1;
                }
            }
        } while (!"&&&&&".equals(cadena));
        System.out.println("la cantidad de correctas son: " + correctas);
        System.out.println("la cantidad de incorrectas son: " + incorrectas);
    }
}
