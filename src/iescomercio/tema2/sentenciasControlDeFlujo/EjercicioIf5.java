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
public class EjercicioIf5 {

    public static void main(String[] args) {
        //pedir datos 
        int x;
        Scanner sc = new Scanner(System.in);

        //pedir datos
        System.out.print("Dime un número: ");
        x = sc.nextInt();

        //realizar operaciones 
        if (x < 0) {
            System.out.println("El numero es negativo.");
        } else if (x == 0) {
            System.out.println("El numero es cero");
        } else {
            System.out.println("El numero es positivo");
        }
    }
}
