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
public class EjercicioIf7 {

    public static void main(String[] args) {
        //declarar variables
        Scanner sc = new Scanner(System.in);
        int a, b, c;

        //pedir datos
        System.out.print("Dime el primer número: ");
        a = sc.nextInt();
        System.out.print("Dime el segundo número: ");
        b = sc.nextInt();
        System.out.print("Dime el tercer número: ");
        c = sc.nextInt();

        if (a>b){
            if (b>c){
                System.out.printf("$d",a);
            }else{
                System.out.printf("$d $d %d", c,a,b);     
            }
        
        
//        //realizar operaciones
//        if (x < y) {
//            if (x < z) {
//                if (y < z) {
//                    System.out.printf("%d - %d - %d", x, y, z);
//                } else {
//                    System.out.printf("%d - %d - %d ", x, z, y);
//                }
//            }else if(z<y){
//                System.out.printf("%d - %d -%d", z, x, y);
//            }
//        }else if(y<z){
//            if(z<x){
//                System.out.printf("%d - %d - %d", y, z, y);
//            }else{
//            //     System.out.printf("%d - %d -%d", ,);
//            }
//           
        }

    }
}
