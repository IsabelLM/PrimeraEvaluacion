/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iescomercio.tema4.cafetera;

/**
 *
 * @author VESPERTINO
 */
public class Run {

    public static void main(String[] args) {
        Cafetera miCafetera;
        miCafetera = new Cafetera(500, 200);
        
        System.out.println(miCafetera.getCantidadActual());
        miCafetera.servirTaza(250);
        System.out.println(miCafetera.getCantidadActual());
        
    }
}
