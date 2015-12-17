/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iescomercio.tema2.sentenciasControlDeFlujo.ejercIf;

import java.util.Scanner;

/**
 *
 * @author VESPERTINO
 */
public class EjercicioIf18 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte hora, minuto, segundo;

        do {
            System.out.println("Dame la hora, los minutos y los segundos");
            hora = sc.nextByte();
            minuto = sc.nextByte();
            segundo = sc.nextByte();
            if (hora < 0 || hora > 24 || minuto < 0 || minuto > 59 || segundo < 0 || segundo > 59) {
                System.out.println("Los datos son incorrectos");
            }
        } while (hora < 0 || hora >= 24 || minuto < 0 || minuto > 59 || segundo < 0 || segundo > 59);

        if (segundo == 59) {
            segundo = 00;
            minuto++;
            if (minuto == 60) {
                minuto = 00;
                hora++;
                if (hora == 24) {
                    hora = 00;
                }
            }
        } else if (segundo != 59) {
            segundo++;
        }
        System.out.println("La hora + 1 segundo es: " + hora + ":" + minuto + ":" + segundo);
    }
}
