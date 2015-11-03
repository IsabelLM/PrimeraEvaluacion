/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iescomercio.tema2.sentenciasControlDeFlujo;


/*-- Realizar un programa en java que muestre los numeros de la tabla del 5 hasta 500
 empezando en el numero 100

 */
/**
 *
 * @author Isabel
 */
public class EjercicioWhile2 {

    public static void main(String[] args) {
        int numero = 20;
        int resultado = 0;
        while (resultado < 500) {
            resultado = 5 * numero;
            System.out.println("5 * " +numero+ " = "+ resultado);
            //numero = numero +1;
            numero++;
        }
    }
}
