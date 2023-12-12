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

//Crea una aplicación que le pida dos números al usuario y este pueda elegir entre sumar,
//restar, multiplicar y dividir. La aplicación debe tener una función para cada operación
//matemática y deben devolver sus resultados para imprimirlos en el main. 

public class ejercicioExtra_15 {

    static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {

        double num1, num2;

        System.out.println("Ingrese un valor para el numero 1");
        num1 = entrada.nextInt();
        System.out.println("Ingrese un valor para el numero 2");
        num2 = entrada.nextInt();
        menu(num1, num2);
    }

    public static void menu(double num1, double num2) {

        double division, suma, resta, multiplicacion, valor;
        int opcion;
        String resp;

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
            opcion = entrada.nextInt();
            resp = "";
            switch (opcion) {
                case 1:
                    valor = suma(num1, num2);
                    break;
                case 2:
                    valor = resta(num1, num2);
                    break;
                case 3:
                    valor = multiplicacion(num1, num2);
                    break;
                case 4:
                    valor = division(num1, num2);
                    break;
                case 5:

                    if (resp.equals("")) {
                        System.out.println("¿Está seguro que desea salir del programa (S/N)?");
                        resp = entrada.next();
                        resp = resp.toUpperCase();
                    }
            }
        } while (!"S".equalsIgnoreCase(resp));

    }
    
    public static double suma(double num1, double num2) {

        double suma;

        suma = num1 + num2;
        System.out.println("Resultado de la suma de " + num1 + " + " + num2 + " es: " + suma);
        return suma;
    }

    public static double resta(double num1, double num2) {

        double resta;

        resta = num1 - num2;
        System.out.println("Resultado de la resta de " + num1 + " - " + num2 + " es: " + resta);
        return resta;
    }

    public static double multiplicacion(double num1, double num2) {

        double multiplicacion;

        multiplicacion = num1 * num2;
        System.out.println("Resultado de la multiplicacion de " + num1 + " * " + num2 + " es: " + multiplicacion);
        return multiplicacion;
    }
    
    public static double division(double num1, double num2) {

        double division;

        division = num1 / num2;
        System.out.println("Resultado de la division de " + num1 + " / " + num2 + " es: " + division);
        return division;
    }
    
}
