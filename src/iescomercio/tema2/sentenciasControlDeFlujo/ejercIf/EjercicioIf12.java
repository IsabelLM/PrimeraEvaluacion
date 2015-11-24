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
public class EjercicioIf12 {

    public static void main(String[] args) {
        byte n;
        Scanner sc = new Scanner(System.in);

        //pedir datos
        System.out.print("Dime un número: ");
        n = sc.nextByte();

        do {
            System.out.println("El numero no es correcto ");
            System.out.print("Dime un número: ");
            n = sc.nextByte();
        } while (n <= 0 || n > 12);
        
        if (n == 1) {
            System.out.println("Enero");
        } else if (n == 2) {
            System.out.println("Febrero");
        } else if (n == 3) {
            System.out.println("Marzo");
        } else if (n == 4) {
            System.out.println("Abril");
        } else if (n == 5) {
            System.out.println("Mayo");
        } else if (n == 6) {
            System.out.println("Junio");
        } else if (n == 7) {
            System.out.println("Julio");
        } else if (n == 8) {
            System.out.println("Agosto");
        } else if (n == 9) {
            System.out.println("Septiembre");
        } else if (n == 10) {
            System.out.println("Octubre");
        } else if (n == 11) {
            System.out.println("Noviembre");
        } else {
            System.out.println("Diciembre");
        }
    }

}
