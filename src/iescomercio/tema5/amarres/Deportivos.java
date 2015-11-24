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
public class Deportivos extends Barco {

    private int cv;

    public Deportivos(int cv, String matricula, float eslora, int añoFabricacion) {
        super(matricula, eslora, añoFabricacion);
        this.cv = cv;
    }

    public int getCv() {
        return cv;
    }

    public void setCv(int cv) {
        this.cv = cv;
    }

    @Override
    public float calcularAlquiler() {
        return super.calcularAlquiler() + (cv * 1);
    }

}
