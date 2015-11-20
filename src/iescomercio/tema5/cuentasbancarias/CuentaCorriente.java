/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iescomercio.tema5.cuentasbancarias;

import com.sun.org.apache.xpath.internal.operations.Equals;
import java.util.Objects;

/**
 *
 * @author VESPERTINO
 */
public class CuentaCorriente {

    private Titular aTitular;
    private NumeroDeCuenta numDeCuenta;
    private double saldo;

    public CuentaCorriente(Titular aTitular, NumeroDeCuenta numDeCuenta, double saldo) {
        this.aTitular = aTitular;
        this.numDeCuenta = numDeCuenta;
        this.saldo = saldo;
    }

    public CuentaCorriente(Titular aTitular, NumeroDeCuenta numDeCuenta) {
        this(aTitular, numDeCuenta, 15.3);
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

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void ingresar(double pIngreso) {
        saldo = saldo + pIngreso;
    }

    public void reintegro(double pReintrego) {
        saldo = saldo - pReintrego;
    }

    public void mostrar() {
        System.out.println("Numero de cuenta: " + numDeCuenta.getNumeroDeCuenta()
                + " Saldo: " + saldo);
    }

    public boolean equals(Object o) {
        CuentaCorriente cc = (CuentaCorriente) o;
        if (this.getNumDeCuenta().equals(cc.getNumDeCuenta())) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return (aTitular.toString());
    }
}
