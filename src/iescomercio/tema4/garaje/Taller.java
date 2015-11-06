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
public class Taller {

    private Coche aCoche;
    private String averia;
    private int numeroCochesAtendidos;

    public Taller() {
        aCoche = null; // El taller esta vacio
        averia = "";
        numeroCochesAtendidos = 0;
    }

    public int getNumeroCochesAtendidos() {
        return numeroCochesAtendidos;
    }

    public boolean aceptarCoche(Coche pCoche, String pAveria) {
        if (aCoche == null) {
            aCoche = pCoche;
            averia = pAveria;
            if (averia == "aceite") {
                aCoche.getaMotor().setLitros(aCoche.getaMotor().getLitros() + 10);
            }
            return true;
        } else {
            return false;
        }
    }

    public void devolverCoche() {
        Aleatorio precioAleatorio = new Aleatorio(100, 1000);

        aCoche.acumularAveria(precioAleatorio.generarUnAleatorio());
        aCoche = null;
        averia = "";
        numeroCochesAtendidos++;

    }

}
