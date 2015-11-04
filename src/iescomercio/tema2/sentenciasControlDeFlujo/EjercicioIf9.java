/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iescomercio.tema2.sentenciasControlDeFlujo;

import java.util.Scanner;

/**
 *
 * @author Isabel
 */
public class EjercicioIf9 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numOriginal, numCopia, resto, invertido = 0;

        System.out.print("Dime un numero: ");
        numOriginal = sc.nextInt();

        if (numOriginal < 0 || numOriginal > 9999) {
            System.out.println("El numero no es valido.");
        } else {
            numCopia = numOriginal;

            while (numCopia != 0) {
                resto = numCopia % 10;
                invertido = invertido * 10 + resto;
                numCopia = numCopia / 10;
            }
        }
        if (invertido == numOriginal) {
            System.out.println("El numero es capicua");
        } else {
            System.out.println("EL numero no es capicua");
        }
    }
}
