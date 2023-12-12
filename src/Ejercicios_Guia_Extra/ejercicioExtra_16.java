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

//Diseñe una función que pida el nombre y la edad de N personas e imprima los datos de
//las personas ingresadas por teclado e indique si son mayores o menores de edad.
//Después de cada persona, el programa debe preguntarle al usuario si quiere seguir
//mostrando personas y frenar cuando el usuario ingrese la palabra “No”.

public class ejercicioExtra_16 {
    
    static Scanner entrada = new Scanner(System.in);
    
    public static void main(String[] args) {
        
        int n;
        
//        System.out.println("Cantidad de personas que desea ingresar?");
//        n = entrada.nextInt();
            pedirDatos();
    }
    
    public static void pedirDatos() {

        String nombre, resp;
        int edad;
        do {
            System.out.println("Ingrese el nombre");
            nombre = entrada.next();
            System.out.println("Ingrese la edad");
            edad = entrada.nextInt();
            imprimirDatos(nombre, edad);
            System.out.println("Desea seguir agregando personas (Si/No)?");
            resp = entrada.next();
        } while (!"No".equals(resp));
    }
    
    public static void imprimirDatos(String nombre, int edad) {

        if (edad >= 18) {
            System.out.println(nombre + " tiene una edad de " + edad + ", y es mayor de edad");

        } else if (edad < 18) {
            System.out.println(nombre + " tiene una edad de " + edad + ", y es menor de edad");
        }
    }
    
}
