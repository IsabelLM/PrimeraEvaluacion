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
public class EjercicioSwitch1 {

    public static void main(String[] args) {
        int nota;
        Scanner sc = new Scanner(System.in);

        System.out.println("Dime la nota: ");
        nota = sc.nextInt();

        if (nota < 0 || nota > 10) {
            System.out.println("La nota no es correcta");
        } else {
            switch (nota) {
                case 0:
                case 1:
                case 2:
                case 3:
                case 4:
                    System.out.println("Muy deficiente");
                    break;

                case 5:
                    System.out.println("Suficiente");
                    break;

                case 6:
                    System.out.println("Bien");
                    break;

                case 7:
                case 8:
                    System.out.println("Notable");
                    break;

                case 9:
                    System.out.println("Sobresaliente");
                    break;

                default:
                    System.out.println("sobresaliente");
                    break;
            }
        }
    }
}
