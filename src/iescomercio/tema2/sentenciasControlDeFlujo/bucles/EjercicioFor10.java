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
public class EjercicioFor10 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, suma = 0, x;
        double media = 0;
        for (n = 0; n < 15; n++) {
            System.out.println("Dame un numero");
            x = sc.nextInt();
            if (x == 0) {
                n--;
            } else {
                suma += x; //suma = suma + x; acumulador
                media = (double) suma / 15;
            }

        }
        System.out.println("Suma total = " + suma);
        System.out.println("Media total = " + media);
    }
}
