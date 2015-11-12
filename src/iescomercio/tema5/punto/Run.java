/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iescomercio.tema5.punto;

/**
 *
 * @author VESPERTINO
 */
public class Run {

    public static void main(String[] args) {
        Punto p1, p2;
        p1 = new Punto(3);
        p2 = new Punto(4);

        System.out.println( p1.toString());
        System.out.println(p2.equals(p1));
    }
}
