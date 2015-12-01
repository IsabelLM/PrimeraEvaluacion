/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iescomercio.tema2;

import java.util.Scanner;

/**
 *
 * @author Isabel
 */
public class AsaltoAlCastillo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hombres, combinaciones = 1;
        do {
            System.out.println("Di de cuantos hombres dispones:");
            hombres = sc.nextInt();
            while (combinaciones <= hombres) {
                if (hombres % combinaciones == 0) {
                    int cuenta;
                    cuenta = hombres / combinaciones;
                    System.out.println("Con grupos de:  " + combinaciones + " persona te salen "
                            + cuenta + " batallones");
                }
                combinaciones++;
            }
        } while (hombres == 0 || hombres >= 500001);
    }
}
