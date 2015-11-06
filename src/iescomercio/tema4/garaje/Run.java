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

        //mirar cuantos litros tiene antes de entrar
        System.out.println("Aceite coche 1" + miCoche1.getaMotor().getLitros());
        //mete coche1
        System.out.println("¿Coche 1 entra?: " + miTaller.aceptarCoche(miCoche1, "aceite"));
        //mirar cuantos litros tiene despues de entrar
        System.out.println("Aceite coche 1" + miCoche1.getaMotor().getLitros());
        //devolver el coche
        miTaller.devolverCoche();
        //mostrar precio de la averia
        System.out.println("Precio averia: " + miCoche1.getPrecioAverias());
        //meter coche 2, devolver y precio averia
        System.out.println("¿Coche 2 entra?: " + miTaller.aceptarCoche(miCoche2, "puerta"));
        miTaller.devolverCoche();
        System.out.println("Precio averia: " + miCoche2.getPrecioAverias());

        System.out.println("_____");

        System.out.println("¿Coche 1 entra?: " + miTaller.aceptarCoche(miCoche1, "ruedas"));
        miCoche1.acumularAveria(precioAleatorio.generarUnAleatorio());
        System.out.println("Precio averia acumulado coche 1: " + miCoche1.getPrecioAverias());
        miTaller.devolverCoche();
        System.out.println("¿Coche 2 entra?: " + miTaller.aceptarCoche(miCoche2, "aceite"));
        miCoche2.acumularAveria(precioAleatorio.generarUnAleatorio());
        System.out.println("Precio averia acumulado coche 2: " + miCoche2.getPrecioAverias());
        System.out.println("Coches atendidos: " + miTaller.getNumeroCochesAtendidos());
        miTaller.devolverCoche();

    }
}
