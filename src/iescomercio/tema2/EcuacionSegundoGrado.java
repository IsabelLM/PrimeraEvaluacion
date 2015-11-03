/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iescomercio.tema2;

import java.util.Scanner;


/*
 Implementar un programa que pida los coeficientes de una ecuación de segundo grado ax(elevado 2) + bx + c = 0
 pedir a b c.  Formula en el cuaderno.  Mostrar x1 x 2

 */
/**
 *
 * @author VESPERTINO
 */
public class EcuacionSegundoGrado {

    public static void main(String[] args) {
        //Declaración de variables
        Scanner sc = new Scanner(System.in);
        double a, b, c, x1, x2, aux;

        // Pedir datos;
        System.out.print("Escribe un valor para a: ");
        a = sc.nextDouble();
        System.out.print("Escribe un valor para b: ");
        b = sc.nextDouble();
        System.out.print("Escribe un valor para c: ");
        c = sc.nextDouble();
        
        //realizar operaciones 
        aux = ((Math.pow(b, 2) - 4 * a * c));
        if (aux < 0) {
            System.out.println("La solucion  no es real");
        } else {
            x1 = (-b + Math.sqrt(aux)) / (2 * a);
            x2 = (-b - Math.sqrt(aux)) / (2 * a);

            System.out.println("El resultado de x1 es: " + x1);
            System.out.println("El resultado de x2 es: " + x2);
        }       
    }
}

