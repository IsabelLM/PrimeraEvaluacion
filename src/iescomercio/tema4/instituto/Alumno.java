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
public class Alumno {

    private int numeroDeExpediente;
    private String nombreAlumno;
    private Asignatura asignatura1, asignatura2, asignatura3;

    public Alumno(int pNumeroDeExpediente) {
        numeroDeExpediente = pNumeroDeExpediente;
    }

    public Alumno(int pNumeroDeExpediente, String pNombreAlumno) {
        numeroDeExpediente = pNumeroDeExpediente;
        nombreAlumno = pNombreAlumno;
    }
    //getters
    public int getNumeroDeExpediente() {
        return numeroDeExpediente;
    }

    public String getNombreAlumno() {
        return nombreAlumno;
    }

    public Asignatura getAsignatura1() {
        return asignatura1;
    }

    public Asignatura getAsignatura2() {
        return asignatura2;
    }

    public Asignatura getAsignatura3() {
        return asignatura3;
    }
    //setters
    public void setNombreAlumno(String nombreAlumno) {
        this.nombreAlumno = nombreAlumno;
    }

    public void setAsignatura1(Asignatura asignatura1) {
        this.asignatura1 = asignatura1;
    }

    public void setAsignatura2(Asignatura asignatura2) {
        this.asignatura2 = asignatura2;
    }

    public void setAsignatura3(Asignatura asignatura3) {
        this.asignatura3 = asignatura3;
    }

}
