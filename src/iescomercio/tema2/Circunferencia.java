/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iescomercio.tema2;

import java.util.Scanner;

/* 
 Realizar un programa en Java que pida al usuario el radio de un circulo
 y calcule y muestre por pantalla el área y perímetro de dicho círculo. 

 */
/**
 *
 * @author VESPERTINO
 */
public class Circunferencia {

    public static void main(String[] args) {
        //Declaración de variables
        Scanner sc = new Scanner(System.in);
        float pi = (float) Math.PI;
        float radio, area, perimetro;
        
        //Pedir datos
        System.out.print("Introduce el radio de un circulo: ");
        radio = sc.nextFloat();

        //Realizar calculos
        area = pi * (radio * radio);
        perimetro = (2 * pi) * radio;

        //Mostrar resultado
        System.out.printf("El área es: %.2f  \nEl perimetro es: %.2f \n ", area, perimetro);
    }

}
