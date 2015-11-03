/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iescomercio.tema4.fracciones;

/**
 *
 * @author VESPERTINO
 */
public class runFraccion {

    public static void main(String[] args) {
        Fraccion f1, f2, f3;
        f1 = new Fraccion(2, 4);
        f2 = new Fraccion(3, 5);

        System.out.println(f1.calculaReal());
        System.out.println("Suma: ");
        f3 = f1.suma(f2);
        f3.print();

        System.out.println("Division: ");
        f3 = f1.division(f2);
        f3.print();

        System.out.println("Multiplicacion: ");
        f3 = f1.multiplicacion(f2);
        f3.print();

        System.out.println("Resta: ");
        f3 = f1.resta(f2);
        f3.print();

    }
}
