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
public class EjercicioBucle07 {

    public static void main(String[] args) {
        int contador = 1;
        long multiplicacion = 1;
        /*  while (contador < 1024) {
            contador = contador * 2;
            if (contador != 128 && contador != 512) {
                multiplicacion = multiplicacion * contador;
                System.out.println(+contador);
            }
        }
        System.out.println("El resultado total es: " + multiplicacion);
        */
        
        //Do While
        do {
            contador = contador * 2;
            if (contador != 128 && contador != 512) {
                multiplicacion = multiplicacion * contador;
                System.out.println(+contador);
            }
        } while (contador < 1024);
        System.out.println("El resultado total es: " + multiplicacion);
    }
}
