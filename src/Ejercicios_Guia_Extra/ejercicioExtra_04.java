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

//Elaborar un algoritmo en el cuál se ingrese un número entre 1 y 10 y se muestre su
//equivalente en romano.

public class ejercicioExtra_04 {
    
    static Scanner entrada = new Scanner (System.in);
    
    public static void main(String[] args){
        
        int num;
        
        System.out.println("Ingrese un numero entra 1 y 10 para convertir a romano");
        num= entrada.nextInt();
        numeroRomano(num);
        
    }
    
    public static void numeroRomano(int num) {

        switch (num) {
            case 1:
                System.out.println("El numero " + num + " es equivalente al numero romano I");
                break;
            case 2:
                System.out.println("El numero " + num + " es equivalente al numero romano II");
                break;
            case 3:
                System.out.println("El numero " + num + " es equivalente al numero romano III");
                break;
            case 4:
                System.out.println("El numero " + num + " es equivalente al numero romano IV");
                break;
            case 5:
                System.out.println("El numero " + num + " es equivalente al numero romano V");
                break;
            case 6:
                System.out.println("El numero " + num + " es equivalente al numero romano VI");
                break;                
            case 7:
                System.out.println("El numero " + num + " es equivalente al numero romano VII");
                break;
            case 8:
                System.out.println("El numero " + num + " es equivalente al numero romano VIII");
                break;
            case 9:
                System.out.println("El numero " + num + " es equivalente al numero romano IX");
                break;
            case 10:
                System.out.println("El numero " + num + " es equivalente al numero romano X");
                break;
            default:
                System.out.println("El numero ingresado no se encuentra entre 1 y 10");
                break;
        }
    }
    
}
