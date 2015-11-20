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
    private double eslora;
    private GregorianCalendar añoFabricacion;

    public Barco(String matricula, double eslora, GregorianCalendar añoFabricacion) {
        this.matricula = matricula;
        this.eslora = eslora;
        this.añoFabricacion = añoFabricacion;
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

    public void setEslora(double eslora) {
        this.eslora = eslora;
    }

    public GregorianCalendar getAñoFabricacion() {
        return añoFabricacion;
    }

    public void setAñoFabricacion(GregorianCalendar añoFabricacion) {
        this.añoFabricacion = añoFabricacion;
    }

}
