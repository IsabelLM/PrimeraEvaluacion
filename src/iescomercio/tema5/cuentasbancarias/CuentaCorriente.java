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
public class CuentaCorriente {

    Titular aTitular;
    NumeroDeCuenta numDeCuenta;
    double saldo;

    public CuentaCorriente(Titular pTitular, NumeroDeCuenta pNumDeCuenta, double pSaldo) {
        aTitular = pTitular;
        numDeCuenta = pNumDeCuenta;
        saldo = pSaldo;
    }

    public CuentaCorriente(Titular pTitular, NumeroDeCuenta pNumDeCuenta) {
        aTitular = pTitular;
        numDeCuenta = pNumDeCuenta;
        saldo = 15.3;
    }

    public Titular getaTitular() {
        return aTitular;
    }

    public NumeroDeCuenta getNumDeCuenta() {
        return numDeCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void saldo(double pSaldo) {
        saldo = pSaldo;
    }

    public void ingresar(double pIngreso) {
        saldo = saldo - pIngreso;
    }

    public void reintegro(double pReintrego) {
        saldo = saldo - pReintrego;
    }

    public void mostrar() {
        System.out.println("Numero de cuenta: " + numDeCuenta.getNumeroDeCuenta()
                + " Saldo: " + saldo);
    }

    @Override
    public String toString() {
        return ("Nombre: " + aTitular.getNombre() + " Apellidos " + aTitular.getApellidos() + " Edad: " + aTitular.getEdad());
    }
}
