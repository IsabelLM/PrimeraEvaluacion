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
    private GregorianCalendar fInicial, fFinal;
    private Barco barco;

    public Alquiler(Cliente cliente, int posicionAmarre, Barco barco, int añoInicial, int mesInicial, int diaInicial, int añoFinal, int mesFinal, int diaFinal) {
        this.cliente = cliente;
        this.posicionAmarre = posicionAmarre;
        this.fInicial = new GregorianCalendar(añoInicial, mesInicial, diaInicial);
        this.fFinal = new GregorianCalendar(añoFinal, mesFinal, diaFinal);
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

    public GregorianCalendar getfInicial() {
        return fInicial;
    }

    public void setfInicial(GregorianCalendar fInicial) {
        this.fInicial = fInicial;
    }

    public GregorianCalendar getfFinal() {
        return fFinal;
    }

    public void setfFinal(GregorianCalendar fFinal) {
        this.fFinal = fFinal;
    }

    public Barco getBarco() {
        return barco;
    }

    public void setBarco(Barco barco) {
        this.barco = barco;
    }

    //calcular los días que lleva
    public long diasTotales() {
        long difms = fFinal.getTimeInMillis() - fInicial.getTimeInMillis();
        long difd = difms / (1000 * 60 * 60 * 24);
        return difd;
    }

    //Método que calcula cuánto hay que pagar

    public float dameLaCuenta() {
        float precioDia;
        int diasTotales;
        diasTotales = (int) diasTotales();

        precioDia = barco.calcularAlquiler();
        return precioDia * diasTotales + 2;
    }
}
