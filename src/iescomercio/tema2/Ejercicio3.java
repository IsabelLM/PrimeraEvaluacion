/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iescomercio.tema2;

import java.util.Scanner;

/**
 *
 * @author VESPERTINO
 */
public class Ejercicio3 {

    public static void main(String[] args) {
        int edad;
        Scanner sc = new Scanner(System.in);
        System.out.print("Dime tu edad: ");
        edad = sc.nextInt() - 10;
        System.out.println("Pues aparentas: " + edad);
    }

}
