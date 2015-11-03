/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iescomercio.tema2.sentenciasControlDeFlujo;

/**
 *
 * @author VESPERTINO
 */
public class EjercicioWhile5 {

    public static void main(String[] args) {
        int suma = 0, n = 8;

        while (n <= 50) {
            suma = suma + n;
            n = n + 2;
        }
        System.out.println("La suma total: " + suma);

    }
}
