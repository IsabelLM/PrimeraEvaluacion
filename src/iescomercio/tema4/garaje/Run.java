/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iescomercio.tema4.garaje;

import iescomercio.tema4.aleatorio.Aleatorio;

/**
 *
 * @author VESPERTINO
 */
public class Run {

    public static void main(String[] args) {
        Aleatorio precioAleatorio;
        Coche miCoche1, miCoche2;
        Taller miTaller;

        precioAleatorio = new Aleatorio(0, 1000);
        miCoche1 = new Coche("Seat", "Ibiza");
        miCoche2 = new Coche("Opel", "Corsa");
        miTaller = new Taller();

        System.out.println("Coche 1 entra? " + miTaller.aceptarCoche(miCoche1, "ruedas"));
        miCoche1.acumularAveria(precioAleatorio.generaAleatorio());
        System.out.println("Precio averia acumulado coche 1: " + miCoche1.getPrecioAverias());
        miTaller.devolverCoche();
        System.out.println("Coche 2 entra?" + miTaller.aceptarCoche(miCoche2, "aceite"));
        miCoche2.acumularAveria(precioAleatorio.generaAleatorio());
        System.out.println("Precio averia acumulado coche 2: " + miCoche2.getPrecioAverias());
        miTaller.devolverCoche();

        System.out.println("_____");

        System.out.println("Coche 1 entra? " + miTaller.aceptarCoche(miCoche1, "ruedas"));
        miCoche1.acumularAveria(precioAleatorio.generaAleatorio());
        System.out.println("Precio averia acumulado coche 1: " + miCoche1.getPrecioAverias());
        miTaller.devolverCoche();
        System.out.println("Coche 2 entra?" + miTaller.aceptarCoche(miCoche2, "aceite"));
        miCoche2.acumularAveria(precioAleatorio.generaAleatorio());
        System.out.println("Precio averia acumulado coche 2: " + miCoche2.getPrecioAverias());

        miTaller.devolverCoche();

    }
}
