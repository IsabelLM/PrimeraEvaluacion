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
public class EjercicioBucle06 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero = 1;
        int par = 0;
        int impar = 0;
        while (numero != 0) {
            System.out.println("Dame un número");
            numero = sc.nextInt();
            if (numero != 0) {
                if (numero % 2 == 0) {
                    par++;
                } else {
                    impar++;
                }
            }
        }
        System.out.println("Pares: " + par);
        System.out.println("Impares: " + impar);
    }
}
