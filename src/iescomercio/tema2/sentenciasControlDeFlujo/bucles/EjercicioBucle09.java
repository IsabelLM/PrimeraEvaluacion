/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iescomercio.tema2.sentenciasControlDeFlujo.bucles;

import java.util.Scanner;

/**
 *
 * @author VESPERTINO
 */
public class EjercicioBucle09 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, numAleatorio = 0, error = 0;

        numAleatorio = (int) Math.floor(Math.random() * 101);

        System.out.println("Dime un número:");
        n = sc.nextInt();
        do {
            if (n < numAleatorio) {
                System.out.println("El numero es mayor, dime otro número:");
                n = sc.nextInt();
            } else {
                System.out.println("El numero es menor, dime otro número:");
                n = sc.nextInt();
            }
            error++;
        } while (n != numAleatorio);

        if (n == numAleatorio) {
            System.out.println("Has acertado.");
            System.out.println("Has cometido " + error + " errores.");
        }
    }
}
