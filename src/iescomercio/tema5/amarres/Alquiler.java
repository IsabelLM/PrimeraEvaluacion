/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iescomercio.tema5.amarres;

import java.util.GregorianCalendar;

/**
 *
 * @author VESPERTINO
 */
public class Alquiler {

    private Cliente cliente;
    private int posicionAmarre;
    GregorianCalendar fInicial, fFinal;
    //private GregorianCalendar fechaInicio, fechaFinal;
    private Barco barco;

    public Alquiler(Cliente cliente, int posicionAmarre, Barco barco, GregorianCalendar fInicial, GregorianCalendar fFinal) {
        this.cliente = cliente;
        this.posicionAmarre = posicionAmarre;
        this.fInicial = fInicial;
        this.fFinal = fFinal;
        this.barco = barco;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public int getPosicionAmarre() {
        return posicionAmarre;
    }

    public void setPosicionAmarre(int posicionAmarre) {
        this.posicionAmarre = posicionAmarre;
    }

    public Barco getBarco() {
        return barco;
    }

    public void setBarco(Barco barco) {
        this.barco = barco;
    }

    public long diasTotales(GregorianCalendar fInicial, GregorianCalendar fFinal) {
        GregorianCalendar date1 = fInicial;
        GregorianCalendar date2 = fFinal;
        long difms = date2.getTimeInMillis() - date1.getTimeInMillis();
        long difd = difms / (1000 * 60 * 60 * 24);
        return difd;
    }

    public float dameLaCuenta() {
        float precioDia;
        int diasTotales;
        diasTotales = (int) diasTotales(fInicial, fFinal);

        precioDia = barco.calcularAlquiler();
        // Calculo cuantos dias ha estado
        return precioDia * diasTotales;
    }
}

//    public long calcularDias() {
//        long milisegundos, dias;
//
//        milisegundos = fechaInicio.getTimeInMillis() - fechaFinal.getTimeInMillis();
//        dias = milisegundos / 1000 / 60 / 60 / 24;
//        return dias;
//    }

