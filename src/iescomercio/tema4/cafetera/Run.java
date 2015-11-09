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
        Cafetera miCafetera, miCafetera2;
        miCafetera = new Cafetera(500, 200);
        miCafetera2 = new Cafetera(500, 700); //capacidad actual mayor que la capacidad maxima

        //Se ha creado una cafetera con 200
        System.out.println(miCafetera.getCantidadActual());
        //Se sirve 250. Por lo que debería servirse todo el contenido
        miCafetera.servirTaza(250);
        System.out.println(miCafetera.getCantidadActual());

        System.out.println("----");

        //Se llena la cafetera hasta el maximo
        miCafetera.llenarCafetera();
        System.out.println(miCafetera.getCantidadActual());
        //Teniendo 500 se sirve 200.
        miCafetera.servirTaza(200);
        System.out.println(miCafetera.getCantidadActual());
        //Quedan 300 y se va a vaciar la cafetera
        miCafetera.vaciarCafetera();
        System.out.println(miCafetera.getCantidadActual());
        //Llenar la cafetera con lo que queramos
        miCafetera.agregarCafe(100);
        System.out.println(miCafetera.getCantidadActual());

        System.out.println("----");

        //La capacidad actual, de la segunda cafetera, era mayor que la maxima.
        System.out.println(miCafetera2.getCantidadActual());
        System.out.println(miCafetera2.getCapacidadMaxima());
    }
}
