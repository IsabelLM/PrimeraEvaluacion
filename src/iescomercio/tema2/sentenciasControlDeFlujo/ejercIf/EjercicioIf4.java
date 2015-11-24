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
public class EjercicioIf4 {

    public static void main(String[] args) {
        //pedir datos 
        int x, y;
        Scanner sc = new Scanner(System.in);

        //pedir datos
        System.out.print("Dime un número: ");
        x = sc.nextInt();
        System.out.print("Dime otro numero: ");
        y = sc.nextInt();

        //realizar operaciones 
        if (x == y) {
            System.out.println("Los numeros son iguales.");
        } else if (x > y) {
            System.out.println(+x + " es mayor que " + y);
        } else {
            System.out.println(+y + " es mayor que " + x);
        }

    }
}
