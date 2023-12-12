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

//Leer la altura de N personas y determinar el promedio de estaturas que se encuentran
//por debajo de 1.60 mts. y el promedio de estaturas en general.

public class ejercicioExtra_06 {

    static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {

        char resp;
        double alturaG, sumaAlturaG, altura, sumaAltura;
        int contG, cont;
        contG = 0;
        sumaAlturaG = 0;
        cont = 0;
        sumaAltura = 0;
        do {
            System.out.println("Ingrese la altura de la persona en metros");
            altura = entrada.nextDouble();
            contG = contG + 1;
            if (altura < 1.6) {
                sumaAltura = sumaAltura + altura;
                cont = cont + 1;
            }
            sumaAlturaG = sumaAlturaG + altura;
            System.out.println("¿Desea ingresar la altura de otra persona (S/N)?");
            resp = entrada.next().charAt(0);
            resp = Character.toUpperCase(resp);
        } while (resp != 'N');
        promedioAltura(sumaAlturaG, contG, sumaAltura, cont);
    }

    public static void promedioAltura(double sumaG, int contG, double suma, int cont) {

        double promedioG, promedio;

        promedioG = sumaG / contG;
        promedio = suma / cont;
        System.out.println("El promedio de estatura general es " + promedioG + " mts.");
        System.out.println("El promedio de estatura que se encuentran por debajo de 1.60 mts. es " + promedio + " mts.");
    }
    
}
