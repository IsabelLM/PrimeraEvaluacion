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
public class EjercicioIf3 {

    public static void main(String[] args) {
        //declaracion variables
        int x;
        Scanner sc = new Scanner(System.in);

        //pedir datos
        System.out.print("Dime un número: ");
        x = sc.nextInt();

        //realizar operaciones
        if (x != 0) {
            if (x % 2 == 0) {
                System.out.println("El numero es par.");
            } else {
                System.out.println("El numero es impar.");
            }
        } else {
            System.out.println("El cero no es par ni impar.");
        }
    }
}
