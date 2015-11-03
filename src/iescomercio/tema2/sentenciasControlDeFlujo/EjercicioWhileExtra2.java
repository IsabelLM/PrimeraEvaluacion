/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iescomercio.tema2.sentenciasControlDeFlujo;
/*
 Realizar un programa que calcule y muestre por pantalla todos numeros de las 
 series siguiente:
 6 9 12 ........ 60 --> While

 5 50 500...... 5.000.000 --> Do While
 */

/**
 *
 * @author VESPERTINO
 */
public class EjercicioWhileExtra2 {

    public static void main(String[] args) {
        int s1 = 3, s2 = 5, sum = 0;
        double mul = 1;

        System.out.println("Serie 1: ");
        while (s1 < 60) {
            s1 = s1 + 3;
            mul = mul * s1;
            System.out.print(" " + s1 + " ");
        }
        System.out.println("\nEl resultado total es: " + mul);

        System.out.println("\nSerie 2");
        do {
            sum = sum + s2;
            s2 = s2 * 10;
            System.out.print(" " + s2 + " ");

        } while (s2 < 5000000);
        System.out.printf("\nLa suma total es:  " + sum);

    }
}
