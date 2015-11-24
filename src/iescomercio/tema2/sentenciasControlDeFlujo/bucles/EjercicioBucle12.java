/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iescomercio.tema2.sentenciasControlDeFlujo.bucles;

import java.util.Scanner;

/**
 *
 * @author Isabel
 */
public class EjercicioBucle12 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int contador = 1, n, positivo = 0, negativo = 0, cero = 0;

        for (contador = 0; contador < 10; contador++) {
            System.out.println("Dame un número");
            n = sc.nextInt();
            if (n == 0) {
                cero++;
            } else if (n > 0) {
                positivo++;
            } else {
                negativo++;
            }
        }

        System.out.println("Ceros: " + cero);
        System.out.println("Positivos: " + positivo);
        System.out.println("Negativos: " + negativo);
    }
}
