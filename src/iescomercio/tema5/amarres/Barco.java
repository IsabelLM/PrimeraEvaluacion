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
public class Barco {

    private String matricula;
    private float eslora;
    private GregorianCalendar añoFabricacion;
    private Alquiler alq;

    public Barco(String matricula, float eslora, GregorianCalendar añoFabricacion, Alquiler alq) {
        this.matricula = matricula;
        this.eslora = eslora;
        this.añoFabricacion = añoFabricacion;
        this.alq = alq;

    }

    public Barco() {
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public double getEslora() {
        return eslora;
    }

    public void setEslora(float eslora) {
        this.eslora = eslora;
    }

    public GregorianCalendar getAñoFabricacion() {
        return añoFabricacion;
    }

    public void setAñoFabricacion(GregorianCalendar añoFabricacion) {
        this.añoFabricacion = añoFabricacion;
    }

    public float calcularAlquiler() {
        float precioDia;
        precioDia = (eslora * 10) * +2;
        
        return precioDia;

    }
}
