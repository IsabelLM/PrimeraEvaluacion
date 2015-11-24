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
public class EjercicioBucle10 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 1, suma = 0, x;
        double media = 0;
        while (n <= 15) {
            System.out.println("Dame un numero");
            x = sc.nextInt();
            if (x != 0) {
                suma += x; //suma = suma + x; acumulador
                media = (double) suma / 15;
                n++;
            }

        }
        System.out.println("Suma total = " + suma);
        System.out.println("Media total = " + media);
    }
}
