/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iescomercio.tema2.sentenciasControlDeFlujo.ejercIf;

import java.util.Scanner;

/**
 *
 * @author VESPERTINO
 */
public class EjercicioIf8 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        System.out.print("Dime un numero: ");
        n = sc.nextInt();

        if (n < 0 || n > 99999) {
            System.out.println("El numero no es valido.");
        } else if (n >= 10000 && n < 100000) {
            System.out.println("El numero tiene 5 cifras");
        } else if (n >= 1000 && n < 10000) {
            System.out.println("El numero tiene 4 cifras");
        } else if (n >= 100 && n < 1000) {
            System.out.println("El numero tiene 3 cifras");
        } else if (n >= 10 && n < 100) {
            System.out.println("El numero tiene 2 cifras");
        } else {
            System.out.println("El numero tiene 1 cifra");
        }
    }
}
