/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iescomercio.tema4.instituto;


/**
 *
 * @author VESPERTINO
 */
public class Asignatura {

    private int identificadorAsignatura;
    private double calificacion;

    public Asignatura(int pIdentificadorAsignatura) {
        identificadorAsignatura = pIdentificadorAsignatura;
    }
    //getters
    public int getIdentificadorAsignatura() {
        return identificadorAsignatura;
    }

    public double getCalificacion() {
        return calificacion;
    }
    //setters
    public void setCalificacion(double pCalificacion) {
        calificacion = pCalificacion;
    }

}
