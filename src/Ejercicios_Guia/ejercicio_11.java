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

//Realizar un programa que pida dos números enteros positivos por teclado y muestre por
//pantalla el siguiente menú:
//MENU
//1. Sumar
//2. Restar
//3. Multiplicar
//4. Dividir
//5. Salir
//Elija opción:
//El usuario deberá elegir una opción y el programa deberá mostrar el resultado por
//pantalla y luego volver al menú. El programa deberá ejecutarse hasta que se elija la
//opción 5. Tener en cuenta que, si el usuario selecciona la opción 5, en vez de salir del
//programa directamente, se debe mostrar el siguiente mensaje de confirmación: ¿Está
//seguro que desea salir del programa (S/N)? Si el usuario selecciona el carácter ‘S’ se sale
//del programa, caso contrario se vuelve a mostrar el menú.

public class ejercicio_11 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        int opcion;
        float division, num1, num2, suma, resta, multiplicacion;
        String resp;

        System.out.println("Ingrese un valor para el numero 1");
        num1 = leer.nextInt();
        System.out.println("Ingrese un valor para el numero 2");
        num2 = leer.nextInt();
        resp = "";
        do {
            System.out.println("");
            System.out.println("MENU");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir");
            System.out.println("Elija opción:");
            System.out.println("");
            opcion = leer.nextInt();
            switch (opcion) {
                case 1:
                    suma = num1 + num2;
                    System.out.println("Resultado de la suma de " + num1 + " + " + num2 + " es: " + suma);
                    break;
                case 2:
                    resta = num1 - num2;
                    System.out.println("Resultado de la resta de " + num1 + " - " + num2 + " es: " + resta);
                    break;
                case 3:
                    multiplicacion = num1 * num2;
                    System.out.println("Resultado de la multiplicacion de " + num1 + " * " + num2 + " es: " + multiplicacion);
                    break;
                case 4:
                    division = num1 / num2;
                    System.out.println(division);
                    System.out.println("Resultado de la division de " + num1 + " / " + num2 + " es: " + division);
                    break;
                case 5:
                    
                    if (resp.equals("")) {
                        System.out.println("¿Está seguro que desea salir del programa (S/N)?");
                        resp = leer.next();
                        resp = resp.toUpperCase();
                    }

            }

        } while (!"S".equalsIgnoreCase(resp));

    }

}
