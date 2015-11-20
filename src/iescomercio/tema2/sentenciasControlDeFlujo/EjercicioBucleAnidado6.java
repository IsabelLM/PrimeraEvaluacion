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
public class EjercicioBucleAnidado6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, m, horizontal, vertical;

        do {
            System.out.println("Dime un numero para N: ");
            n = sc.nextInt();
            System.out.println("Dime un numero para M");
            m = sc.nextInt();
        } while (n < 0 || m < 0);
        
        for (horizontal = 0; horizontal < n; horizontal++) {
             System.out.println("-");
            for (vertical = 0; vertical < m; vertical++) {
                System.out.println("|");
            }
        }
        
    }
}

