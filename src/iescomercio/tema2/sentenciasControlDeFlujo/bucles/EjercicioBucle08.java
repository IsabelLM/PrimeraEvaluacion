/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iescomercio.tema2.sentenciasControlDeFlujo.bucles;

import java.util.Scanner;

/**
 *
 * @author VESPERTINO
 */
public class EjercicioBucle08 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;
        int contador = 0;
      
        //Con While
        System.out.println("Dame un número");
        numero = sc.nextInt();
        while (numero >= 0) {
            System.out.println("Dame un número");
            numero = sc.nextInt();
            contador++;
        }
        System.out.println("Has introducido: " + contador + " numeros");           
        }
    }

