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
public class Yates extends Deportivos {

    private int camarotes;

    public Yates(int camarotes, int cv, String matricula, float eslora, int añoFabricacion) {
        super(cv, matricula, eslora, añoFabricacion);
        this.camarotes = camarotes;
    }

    public int getCamarotes() {
        return camarotes;
    }

    public void setCamarotes(int camarotes) {
        this.camarotes = camarotes;
    }

    @Override
    public float calcularAlquiler() {
        return super.calcularAlquiler() + (camarotes * 20);
    }

}
