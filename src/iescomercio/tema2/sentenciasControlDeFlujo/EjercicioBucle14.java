/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iescomercio.tema2.sentenciasControlDeFlujo;

import java.util.Scanner;

/**
 *
 * @author VESPERTINO
 */
public class EjercicioBucle14 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int edad, edadMedia = 0, contadorEdad = 0, contadorAltura = 0, alumno;
        float altura, alturaMedia = 0;

        for (alumno = 5; alumno != 0; alumno--) {
            System.out.println("Dime la edad del alumno: ");
            edad = sc.nextInt();
            System.out.println("Dime la estatura del alumno:");
            altura = sc.nextFloat();
            System.out.println("-----");
            edadMedia += edad;
            alturaMedia += altura;

            if (edad > 18) {
                contadorEdad++;
            }
            if (altura > 1.75) {
                contadorAltura++;
            }
        }
        edadMedia = edadMedia / 5;
        alturaMedia = alturaMedia / 5;
        System.out.println("La edad media es: " + edadMedia);
        System.out.println("La altura media es: " + alturaMedia);
        System.out.println("El numero de alumnos mayores de 18 es: " + contadorEdad);
        System.out.println("EL numero de alumnos más altos de 1.75 es: " + contadorAltura);
    }
}
