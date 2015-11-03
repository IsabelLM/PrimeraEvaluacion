/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iescomercio.tema2.sentenciasControlDeFlujo;

/*
 Realizar las 10 tablas de multiplicar
*/

/**
 *
 * @author VESPERTINO
 */
public class EjercicioForTablas {

    public static void main(String[] args) {
        int t1, t2, resultado;

        for (t1 = 1; t1 < 11; t1++) {
            for (t2 = 1; t2 < 11; t2++) {
                resultado = t1 * t2;
                System.out.printf(" %d * %d = %d \n", t1, t2, resultado);
            }
            System.out.println("--------------");
        }
    }
}
