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

/*
 8743 -> Ocho mil setecientos cuarenta y tres. 
 4 variables:Unidad, Decena, centena, centena de millar
 como sacar el 3- > Numero %10, nos quedamos con 874 
 unidad = Num%10
 Num=Num /10 -> 874
 decenas = num %10
 num = Num/10 -> 87
 centenas = num%10
 num = num/10 -> 8
 centenas de millar = num%10

 */
public class EjercicioSwitch2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num, numCM, numC, numD, numU;
        int unidad, decena, centena, centenaMillar;

        System.out.print("Dime un numero entre 0 y 9.999: ");
        num = sc.nextInt();

        if (num < -9999 || num > 9999) {
            System.out.println("El número no es correcto");
        } else {
            if (num < 0) {
                num = num * -1; //cambia el numero negativo a positivo
            }
            if (num == 0) {
                System.out.println("Cero");
            } else {
                unidad = num % 10;
                num = num / 10;
                decena = num % 10;
                num = num / 10;
                centena = num % 10;
                num = num / 10;
                centenaMillar = num % 10;

                if (centenaMillar < 10) {
                    switch (centenaMillar) {
                        case 1:
                            System.out.print("Mil ");
                            break;
                        case 2:
                            System.out.print("Dos mil ");
                            break;
                        case 3:
                            System.out.print("Tres mil  ");
                            break;
                        case 4:
                            System.out.print("Cuatro mil ");
                            break;
                        case 5:
                            System.out.print("Cinco mil ");
                            break;
                        case 6:
                            System.out.print("Seis mil ");
                            break;
                        case 7:
                            System.out.print("Siete mil ");
                            break;
                        case 8:
                            System.out.print("Ocho mil ");
                            break;
                        case 9:
                            System.out.print("Nueve mil ");
                            break;
                    }
                }

                if (centena < 10) {
                    switch (centena) {
                        case 1:
                            System.out.print("ciento ");
                            break;
                        case 2:
                            System.out.print("doscientos ");
                            break;
                        case 3:
                            System.out.print("trescientos ");
                            break;
                        case 4:
                            System.out.print("cuatrocientos ");
                            break;
                        case 5:
                            System.out.print("quinientos ");
                            break;
                        case 6:
                            System.out.print("seiscientos ");
                            break;
                        case 7:
                            System.out.print("sietecientos ");
                            break;
                        case 8:
                            System.out.print("ochocientos ");
                            break;
                        case 9:
                            System.out.print("novecientos ");
                            break;
                    }
                }

                if (decena < 10) {
                    switch (decena) {
                        case 1:
                            System.out.print("diez");
                            break;
                        case 2:
                            System.out.print("veinte");
                            break;
                        case 3:
                            System.out.print("treinta y ");
                            break;
                        case 4:
                            System.out.print("cuarenta y ");
                            break;
                        case 5:
                            System.out.print("cincuenta y ");
                            break;
                        case 6:
                            System.out.print("sesenta y ");
                            break;
                        case 7:
                            System.out.print("setenta y ");
                            break;
                        case 8:
                            System.out.print("ochenta y ");
                            break;
                        case 9:
                            System.out.print("noventa y ");
                            break;
                    }
                }

                if (unidad < 10) {
                    switch (unidad) {
                        case 1:
                            System.out.print("uno ");
                            break;
                        case 2:
                            System.out.print("dos ");
                            break;
                        case 3:
                            System.out.print("tres ");
                            break;
                        case 4:
                            System.out.print("cuatro ");
                            break;
                        case 5:
                            System.out.print("cinco ");
                            break;
                        case 6:
                            System.out.print("seis ");
                            break;
                        case 7:
                            System.out.print("siete ");
                            break;
                        case 8:
                            System.out.print("ocho ");
                            break;
                        case 9:
                            System.out.print("nueve ");
                            break;
                    }
                }
            }
        }
    }
}
