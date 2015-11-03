/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iescomercio.tema2;

/**
 *
 * @author Isabel
 */
public class Ejercicio5PrioridadOperadores {

    public static void main(String[] args) {
        int resultado1, resultado2, resultado3, 
                resultado4, resultado5, resultado6;

        resultado1 = 7 % 5 + 2 * 3;
        resultado2 = 9 / 2 * 2 * 9 / 2;
        resultado3 = (int)Math.pow(2 * 3 + (4 * 8 + 4) / 6, 2) + 6;
        resultado4 = 118 + 12 - 5 * 2 * 10 / 5 % 5;
        resultado5 = (3 * (int)Math.pow(2, 4)) - (5 * (int)Math.pow(2, 3)) + (2 * 12 - 17);
        resultado6 = (15 - 4) + 3 - (12 - 5 * 2) + (5 + 16 / 4) - 5 + (10 - (int)Math.pow(2, 3));

        System.out.println("El resultado 1 es: " + resultado1
                + "\nEl resultado 2 es: " + resultado2
                + "\nEl resultado 3 es: " + resultado3
                + "\nEl resultado 4 es: " + resultado4
                + "\nEl resultado 5 es: " + resultado5
                + "\nEl resultado 6 es: " + resultado6
        );

    }
}
