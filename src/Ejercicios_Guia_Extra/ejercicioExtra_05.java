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

//Una obra social tiene tres clases de socios:
//o Los socios tipo ‘A’ abonan una cuota mayor, pero tienen un 50% de descuento en
//todos los tipos de tratamientos.
//o Los socios tipo ‘B’ abonan una cuota moderada y tienen un 35% de descuento
//para los mismos tratamientos que los socios del tipo A.
//o Los socios que menos aportan, los de tipo ‘C’, no reciben descuentos sobre dichos
//tratamientos.
//o Solicite una letra (carácter) que representa la clase de un socio, y luego un valor
//real que represente el costo del tratamiento (previo al descuento) y determine el
//importe en efectivo a pagar por dicho socio.

public class ejercicioExtra_05 {
    
    static Scanner entrada= new Scanner(System.in);
    
    public static void main(String[] args) {
        
        char socioTipo;
        int costo;
        
        System.out.println("Por favor ingrese que clase de socio es:");
        System.out.println("(Tipo 'A', 'B' o 'C')");
        socioTipo = entrada.next().charAt(0);
        socioTipo = Character.toUpperCase(socioTipo);
        System.out.println("Ingrese el costo del tratamiento");
        costo=entrada.nextInt();
        descuentoTratamiento(socioTipo, costo);
    }
    
    public static void descuentoTratamiento(char socioTipo, int costo) {
        
        double costoFinal;

        switch (socioTipo) {
            case 'A':
                costoFinal = costo * (1 - 0.50);
                System.out.println("El costo final del tratamiento es "+costoFinal);
                break;
            case 'B':
                costoFinal = costo * (1 - 0.35);
                System.out.println("El costo final del tratamiento es "+costoFinal);
                break;
            case 'C':
                costoFinal = costo * (1 - 0.00);
                System.out.println("El costo final del tratamiento es "+costoFinal);
                break;
            default:
                System.out.println("La clase de socio ingresada no es correcta");
        }
    }
    
}
