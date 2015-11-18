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
public class Run {

    public static void main(String[] args) {
        Asignatura lengua = new Asignatura(1);
        Asignatura mates = new Asignatura(2);
        Asignatura historia = new Asignatura(3);

        Alumno isabel = new Alumno(12);
        isabel.setAsignatura1(lengua);
        isabel.setAsignatura2(mates);
        isabel.setAsignatura3(historia);

        Profesor profe = new Profesor();
        profe.ponerNotas(isabel);
        //comprobar las notas que ha puesto
        System.out.println("Lengua: " + lengua.getCalificacion());
        System.out.println("Mates: " + mates.getCalificacion());
        System.out.println("Historia: " + historia.getCalificacion());
        //sacar la media
        System.out.println(profe.calcularMedia(isabel));
    }
}
