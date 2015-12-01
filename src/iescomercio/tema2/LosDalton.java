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
public class LosDalton {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int personas, altura, viñetas, contador = 0;
        boolean sonHermanos = true;

        System.out.println("Cuántas viñetas me traes?");
        viñetas = sc.nextInt();
        while (viñetas != 0) {
            do {
                System.out.println("Cuántas personas aparecen en la foto?");
                personas = sc.nextInt();
            } while (personas < 2);

            do {
                System.out.println("Dime las alturas de los hermanos");
                altura = sc.nextInt();
                if (contador > altura) {
                    sonHermanos = false;
                }
                contador = altura;
                personas--;
            } while (personas != 0);
            if (sonHermanos == true) {
                System.out.println("Son los hermanos Dalton");
            } else {
                System.out.println("Desconocidos");
            }
            viñetas--;
        }
    }
}
