/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iescomercio.tema2.sentenciasControlDeFlujo;
/*Usando for sacar  6   9  ... 60*/

/**
 *
 * @author VESPERTINO
 */
public class EjercicioForEjemplo {

    public static void main(String[] args) {
        int i, acum2 = 0;
        double acum1 = 1;

        for (i = 6; i <= 60; i += 3) {
            /*if(i==30){
                continue; para en el 30 y sigue. El 30 no lo muestra.
            }*/
            System.out.print(" " + i + "\t");
            acum1 = acum1 * i;

        }
        System.out.println("\nEl resultado total es: " + acum1);

        System.out.println("______________\n");

        for (i = 5; i <= 5000000; i = i * 10) {
            System.out.print("" + i + "\t");
            acum2 = acum2 + i;

        }
        System.out.println("\nEl resultado total es: " + acum2);
    }
}
