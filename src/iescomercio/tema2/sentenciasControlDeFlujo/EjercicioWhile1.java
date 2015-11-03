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
/*
 Realizar un programa en java que muestre por pantalla los primeros 100
 Números naturales

-- Realizar un programa en java que muestre los numeros de la tabla del 5 hasta 500
empezando en el numero 100

*/
public class EjercicioWhile1 {

    public static void main(String[] args) {
        int numero = 1;
        while (numero <= 100) {
            System.out.println("Numero: " + numero);
            //numero = numero +1;
            numero++;
        }
    }
}
