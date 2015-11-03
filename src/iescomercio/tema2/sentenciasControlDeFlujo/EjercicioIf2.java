/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iescomercio.tema2.sentenciasControlDeFlujo;

import java.util.Scanner;

/**
 *
 * @author VESPERTINO
 */
public class EjercicioIf2 {

    public static void main(String[] args) {
        //declaración variables
        int x, y;
        Scanner sc = new Scanner(System.in);

        //pedir datos
        System.out.print("Dime un número entero positivo: ");
        x = sc.nextInt();

        System.out.print("Dime otro numero entero positivo: ");
        y = sc.nextInt();

        //realizar operaciones 
        if (x < 0 || y < 0) {
            System.out.println("Tienes que introducir un número positivo");
        } else {
            if (x < y) {
                System.out.println("Los numeros ordenados: " + x + ", " + y);
            } else {
            System.out.println("Los numeros ordenados: " + y + ", " + x);
            }
        }
    }
}
