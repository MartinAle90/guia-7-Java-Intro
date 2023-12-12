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

//Se dispone de un conjunto de N familias, cada una de las cuales tiene una M cantidad de
//hijos. Escriba un programa que pida la cantidad de familias y para cada familia la
//cantidad de hijos para averiguar la media de edad de los hijos de todas las familias.

public class ejercicioExtra_14 {

    static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {

        int nFamilia, mHijos, totalHijos, edadHijo, sumaEdades;
        double promedioHijos, promedioEdades;
        totalHijos = 0;
        sumaEdades = 0;
        System.out.println("ingrese la cantidad de Familias");
        nFamilia = entrada.nextInt();
        for (int i = 0; i < nFamilia; i++) {
            System.out.println("La familia n° " + (i + 1) + ", ¿Cuantos hijos tiene?");
            mHijos = entrada.nextInt();
            totalHijos = totalHijos + mHijos;
            for (int j = 0; j < mHijos; j++) {
                System.out.println("ingrese la edad del " + (j + 1) + "° hijo");
                edadHijo = entrada.nextInt();
                sumaEdades = sumaEdades + edadHijo;
            }
        }
        promedioHijos = (totalHijos / nFamilia);
        promedioEdades = (sumaEdades / (double) totalHijos);
        System.out.println("");
        System.out.println("Cantidad promedio de hijos por familiar es " + promedioHijos);
        System.out.println("La edad promedio de los hijos es " + promedioEdades);
    }

}
