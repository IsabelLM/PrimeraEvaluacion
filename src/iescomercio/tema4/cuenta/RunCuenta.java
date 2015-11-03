/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iescomercio.tema4.cuenta;

/**
 *
 * @author VESPERTINO
 */
public class RunCuenta {

    public static void main(String[] args) {
        //Cuenta miCuenta = new Cuenta (700.0); Declarar e instanciar a la vez
        Cuenta miCuenta; //declaracion
        miCuenta = new Cuenta(700.0); //instaciacion        

        System.out.println("El saldo es: " + miCuenta.getSaldo());
        miCuenta.reintegro(150.5);
        System.out.println("El saldo es: " + miCuenta.getSaldo());
        miCuenta.ingresar(7000);
        System.out.println("El saldo es: " + miCuenta.getSaldo());
        miCuenta.reintegro(90000);
    }

}
