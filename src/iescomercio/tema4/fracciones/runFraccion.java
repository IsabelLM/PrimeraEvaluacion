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
        Fraccion f1, f2;
        f1 = new Fraccion(2, 4);
        f2 = new Fraccion(3, 2);
        Fraccion aux;

        aux = f1.suma(f2);
        aux.print();

        aux = f1.multiplicacion(f2);
        aux.print();

        System.out.println("¿Son iguales?: " + f1.compararFraccional(f2));

        aux = f1.copia();
        aux.print();

        System.out.println("El resultado es:" + f2.calculaReal());

    }
}
