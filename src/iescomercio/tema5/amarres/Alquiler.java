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

    Cliente cliente;
    private int posicionAmarre;
    private GregorianCalendar fechaInicio, fechaFinal;
    private Barco barco;

    public Alquiler(Cliente cliente, int posicionAmarre, GregorianCalendar fechaFinal, GregorianCalendar fechaInicio, Barco barco) {
        this.cliente = cliente;
        this.posicionAmarre = posicionAmarre;
        this.fechaInicio = fechaInicio;
        this.fechaFinal = fechaFinal;
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

    public GregorianCalendar getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(GregorianCalendar fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public GregorianCalendar getFechaFinal() {
        return fechaFinal;
    }

    public void setFechaFinal(GregorianCalendar fechaFinal) {
        this.fechaFinal = fechaFinal;
    }

    public Barco getBarco() {
        return barco;
    }

    public void setBarco(Barco barco) {
        this.barco = barco;
    }
    
    public void calcularAlquiler(){
        
    }

}
