/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iescomercio.tema2;

/**
 *
 * @author VESPERTINO
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        //System.out.println("Java te quiere!");     
        int j;

        for (int i = 0; i < 3; i++) {

            j = i + 1;

            while (j < 4) {
                System.out.println(j - i);

                j++;
            }
        }
    }
}
