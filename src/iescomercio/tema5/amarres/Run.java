/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iescomercio.tema5.amarres;

/**
 *
 * @author VESPERTINO
 */
public class Run {

    public static void main(String[] args) {
        Cliente isabel = new Cliente("Isabel", 16637938);
        Barco miBarco = new Barco("1212a", 12, 1993);
        Alquiler alquilerBarco = new Alquiler(isabel, 2, miBarco, 2015, 11, 24, 2015, 11, 29);

        Veleros miVelero = new Veleros(5, "dsada", 12, 1993);
        Alquiler alquilerVelero = new Alquiler(isabel, 2, miVelero, 2015, 11, 24, 2015, 11, 29);

        Deportivos miDeportivo = new Deportivos(1000, "afesas", 12, 1993);
        Alquiler alquilerDeportivo = new Alquiler(isabel, 2, miDeportivo, 2015, 11, 24, 2015, 11, 29);

        Yates miYate = new Yates(30, 1000, "12a2a", 12, 1993);
        Alquiler alquilerYate = new Alquiler(isabel, 2, miYate, 2015, 11, 24, 2015, 11, 29);

        System.out.println("Alquiler de un barco");
        System.out.println("Un día cuesta: " + miBarco.calcularAlquiler());
        System.out.println("Días que lleva: " + alquilerBarco.diasTotales());
        System.out.println("Coste total: " + alquilerBarco.dameLaCuenta());

        System.out.println("------------");
        System.out.println("Alquiler de un velero");
        System.out.println("Un día cuesta: " + miVelero.calcularAlquiler());
        System.out.println("Días que lleva: " + alquilerVelero.diasTotales());
        System.out.println("Coste total: " + alquilerVelero.dameLaCuenta());

        System.out.println("------------");
        System.out.println("Alquiler de un deportivo");
        System.out.println("Un día cuesta: " + miDeportivo.calcularAlquiler());
        System.out.println("Días que lleva: " + alquilerDeportivo.diasTotales());
        System.out.println("Coste total: " + alquilerDeportivo.dameLaCuenta());

        System.out.println("------------");
        System.out.println("Alquiler de un yate");
        System.out.println("Un día cuesta: " + miYate.calcularAlquiler());
        System.out.println("Días que lleva: " + alquilerYate.diasTotales());
        System.out.println("Coste total: " + alquilerYate.dameLaCuenta());

    }
}
