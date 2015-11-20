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
        //Declarar variables
        int n, m;
        Scanner s = new Scanner(System.in);

        //Pedir datos al usuario
        do {
            System.out.print("Número de filas: ");
            n = s.nextInt();
            System.out.print("Número de columnas: ");
            m = s.nextInt();

            //Te dice unn mensaje en donde has fallado
            if (n < 0 && m < 0) {
                System.out.println("Has introducido fila y columna incorrectas");
            } else if (n < 0) {
                System.out.println("Has introducido fila incorrecta");
            } else if (m < 0) {
                System.out.println("Has introducido columna incorrecta");
            }
        } while (n < 0 || m < 0);

        System.out.println("-------------");

        //Mostrar rectangulo
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                //Si la fila es la primera o la última, y la columna es la primera o la última
                //se hacen asteriscos
                if (i == 0 || i == n - 1 || j == 0 || j == m - 1) {
                    System.out.print("* ");
                    //Sino, se crean espacios
                } else {
                    System.out.print("  ");
                }
            }
            //Salta a la siguiente linea
            System.out.println();
        }
    }
}
