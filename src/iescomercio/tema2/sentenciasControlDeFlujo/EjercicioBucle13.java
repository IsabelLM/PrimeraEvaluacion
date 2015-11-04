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
public class EjercicioBucle13 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, sueldo, suma = 0, mayor = 0;
        for (n = 0; n < 10; n++) {
            System.out.println("Dame un sueldo:");
            sueldo = sc.nextInt();
            if (sueldo > 1000) {
                mayor++;
            }
            suma += sueldo;
        }
        System.out.println("La suma total es: " + suma);
        if (mayor == 0) {
            System.out.println("No hay ningún sueldo de más de 1000€");
        } else {
            System.out.println("Hay " + mayor + " sueldos de más de 1000€");
        }
    }
}
