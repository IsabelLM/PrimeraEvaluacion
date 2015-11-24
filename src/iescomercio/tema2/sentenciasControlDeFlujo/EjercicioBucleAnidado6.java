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
        int n, m;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.print("Número de filas: ");
            n = sc.nextInt();
            System.out.print("Número de columnas: ");
            m = sc.nextInt();
            if (n < 0 && m < 0) {
                System.out.println("Los datos introducidos son erroneos.");
            } else if (n < 0) {
                System.out.println("Has introducido una fila erronea");
            } else if (m < 0) {
                System.out.println("Has introducido una columna erronea");
            }
        } while (n < 0 || m < 0);

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (i == 0 || i == n - 1 || j == 0 || j == m - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
