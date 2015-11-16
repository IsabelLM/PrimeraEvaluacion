/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iescomercio.tema2.sentenciasControlDeFlujo;

import java.util.Scanner;

/**
 *
 * @author Isabel
 */
public class EjercicioIf10 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String mes;
        int dia, año;

        System.out.println("Introduce un día:");
        dia = sc.nextInt();
        System.out.println("Introduce un mes");
        mes = sc.next();
        System.out.println("Introduce un año");
        año = sc.nextInt();

        if (dia >= 31) {
            if ("febrero".equals(mes) || "abril".equals(mes) || "junio".equals(mes)
                    || "septiembre".equals(mes) || "noviembre".equals(mes)) {
                System.out.println("La fecha no es correcta, " + mes + " no tiene tantos días.");
            }
        } else if (dia == 29 || dia == 30) {
            if ("febrero".equals(mes)) {
                System.out.println("Febrero no tiene más de 28 días. ");
            }
        } else {
            System.out.println("La fecha " + dia + " de " + mes + " del " + año + " es correcta.");
        }
    }

}
