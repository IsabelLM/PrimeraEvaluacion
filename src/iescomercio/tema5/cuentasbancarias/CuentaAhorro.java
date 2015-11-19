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
public class CuentaAhorro extends CuentaCorriente {

    double interes;

    public CuentaAhorro(Titular aTitular, NumeroDeCuenta numDeCuenta, double saldo, double interes) {
        super(aTitular, numDeCuenta, saldo);
        this.interes = interes;
    }

    public CuentaAhorro(double interes, Titular aTitular, NumeroDeCuenta numDeCuenta) {
        this(aTitular, numDeCuenta, 15.3, interes);
    }

    public CuentaAhorro(Titular aTitular, NumeroDeCuenta numDeCuenta) {
        this(aTitular, numDeCuenta, 15.3, 2.5);
    }

    public double getInteres() {
        return interes;
    }

    public void calcularInteres() {
        super.setSaldo(super.getSaldo() + interes);
    }

}
