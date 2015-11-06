/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iescomercio.tema4.garaje;

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
    public int getNumeroCochesAtendidos(){
        return numeroCochesAtendidos;
    }
    public boolean aceptarCoche(Coche pCoche, String pAveria) {

        if (aCoche == null) {
            aCoche = pCoche;
            averia = pAveria;
            numeroCochesAtendidos++;
            return true;
        } else {
            return false;
        }
    }

    public void devolverCoche() {
        aCoche = null;
    }

}
