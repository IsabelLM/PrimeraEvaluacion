/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iescomercio.tema4.instituto;

import iescomercio.tema4.aleatorio.Aleatorio;

/**
 *
 * @author VESPERTINO
 */
public class Profesor {

    public void ponerNotas(Alumno pAlumno) {
        Aleatorio notaAleatoria = new Aleatorio(0, 10);
        //coger la asignatura X y ponerle la calificacion de manera aleatoria
        pAlumno.getAsignatura1().setCalificacion(notaAleatoria.generarUnAleatorioEntero());
        pAlumno.getAsignatura2().setCalificacion(notaAleatoria.generarUnAleatorioEntero());
        pAlumno.getAsignatura3().setCalificacion(notaAleatoria.generarUnAleatorioEntero());

    }

    public double calcularMedia(Alumno pAlumno) {
        //Método que coja las notas de las 3 asignaturas y haga la media
        double media;
        media = (pAlumno.getAsignatura1().getCalificacion()
                + pAlumno.getAsignatura2().getCalificacion()
                + pAlumno.getAsignatura3().getCalificacion()) / 3;
        return media;
    }
}
