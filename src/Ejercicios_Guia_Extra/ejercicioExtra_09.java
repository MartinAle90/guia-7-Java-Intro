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

//Simular la división usando solamente restas. Dados dos números enteros mayores que
//uno, realizar un algoritmo que calcule el cociente y el residuo usando sólo restas.
//Método: Restar el dividendo del divisor hasta obtener un resultado menor que el divisor,
//este resultado es el residuo, y el número de restas realizadas es el cociente. 

public class ejercicioExtra_09 {
    
    static Scanner entrada = new Scanner(System.in);
    
    public static void main(String[] args) {
        
        int num1, num2, resto, cont;
        
        System.out.println("ingrese un dividendo");
        num1 = entrada.nextInt();
        do {
                    System.out.println("ingrese un divisor");
        num2 = entrada.nextInt();
            
        } while (num1<=num2);
        cont = 0;
        do {
            num1 = num1 - num2;
            cont = cont + 1;
        } while (num1 >= num2);
        System.out.println("se realizaron " + cont + " restas");
        System.out.println("el cociente de la resta es " + num1);
    }

}
