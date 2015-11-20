/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iescomercio.tema5.cuentasbancarias;

/**
 *
 * @author VESPERTINO
 */
public class Run {

    public static void main(String[] args) {
        
        
        
        Titular isabel = new Titular("Isabel", "Lavieja", 22);
        NumeroDeCuenta miNumeroDeCuentaCorriente = new NumeroDeCuenta(2, 12, 2, 1212);
        CuentaCorriente miCuenta = new CuentaCorriente(isabel, miNumeroDeCuentaCorriente);
        CuentaAhorro miAhorro = new CuentaAhorro(isabel, miNumeroDeCuentaCorriente);
        
        
        Titular daniel = new Titular("Daniel", "Mena", 22);
        NumeroDeCuenta suNumeroDeCuentaCorriente = new NumeroDeCuenta(2, 12, 2, 1222);
        CuentaCorriente suCuenta = new CuentaCorriente(daniel, suNumeroDeCuentaCorriente);
        
//        miAhorro.calcularInteres();
//        System.out.println(miAhorro.getSaldo());
//        
//        miCuenta.mostrar();
        
        System.out.println(miCuenta.equals(suCuenta));
        

        
    }
}
