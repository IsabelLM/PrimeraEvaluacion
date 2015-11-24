/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iescomercio.tema2.sentenciasControlDeFlujo.bucles;

import java.util.Scanner;

//add, commit, push
/*calcular factorial entre de 0 y numero positivo.  Y HACER EL 8. 

 factorial de 4 es  4x3x2x1. 
 4! = 4*3*2*1 
 0! = 1 
 n! n*n-1*n-1
 */
/**
 *
 * @author VESPERTINO
 */
public class EjercicioBucle11 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double numero, factorial = 1;

        do {
            System.out.println("Introduce un numero:");
            numero = sc.nextDouble();
            if(numero<0){
                System.out.println("No puedo calcular el factorial de un numero negativo");
            }
        } while (numero<0);
        
        while(numero != 0){
            factorial = factorial * numero;
            numero --;
        }
        System.out.println("Factorial: " +factorial);
    }
}
