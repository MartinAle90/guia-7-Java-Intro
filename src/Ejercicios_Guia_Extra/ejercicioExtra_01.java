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

//Dado un tiempo en minutos, calcular su equivalente en días y horas. Por ejemplo, si el
//usuario ingresa 1600 minutos, el sistema debe calcular su equivalente: 1 día, 2 horas.

public class ejercicioExtra_01 {
    
    static Scanner entrada = new Scanner(System.in);
    
    public static void main(String[] args){
        
        int minutos;
        
        System.out.println("Ingrese el tiempo que desea convertir en dias y horas");
        minutos = entrada.nextInt();
        conversorMinutos( minutos);
    }
    
    
    public static void conversorMinutos(int minutos){
        
        int dia, hora;
        
        dia = minutos / 1440; // 1440 minutos en un día
        hora = (minutos % 1440) / 60; // 60 minutos en una hora
        System.out.println(minutos + " minutos equivalen a " + dia + " día(s) y " + hora + " hora(s).");
    }
    
}
