/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iescomercio.tema2;

import java.util.Scanner;

/*
 Realizar un programa en Java que pida a tres alumnos su edad 
 calcule y muestre por pantalla la media de edad de esos tres alumnos
 */
/**
 *
 * @author VESPERTINO
 */
public class AlumnosMedia {

    public static void main(String[] args) {
        //declaración de variables
        Scanner sc = new Scanner(System.in);
        byte edad1, edad2, edad3;
        float media;

        //pedir datos
        System.out.print("Dime la edad del primer alumno: ");
        edad1 = sc.nextByte();
        System.out.print("Dime la edad del segundo alumno: ");
        edad2 = sc.nextByte();
        System.out.print("Dime la edad del tercer alumno: ");
        edad3 = sc.nextByte();

        //realizar calculos
        media = (byte) ((edad1 + edad2 + edad3) / (float) 3);
        //mostrar resultado
        System.out.printf("La edad media es: %.2f ", media);
         //System.out.println("La edad media es: " +media);
    }
}
