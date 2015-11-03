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
public class EjercicioIf6 {

    public static void main(String[] args) {
        //pedir datos
        int x, y;
        Scanner sc = new Scanner(System.in);

        //pedir datos
        System.out.print("Dime un número: ");
        x = sc.nextInt();
        System.out.print("Dime otro número: ");
        y = sc.nextInt();

        //realizar operaciones
        if (x % y == 0) {
            System.out.printf("%d es multiplo de %d ", x, y);
        } else {
            System.out.println("No son multiplos");
        }
    }
}
