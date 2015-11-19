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
public class NumeroDeCuenta {

    private int banco, sucursal, digitoDeControl, numeroDeCuenta;

    public NumeroDeCuenta(int banco, int sucursal, int digitoDeControl, int numeroDeCuenta) {
        this.banco = banco;
        this.sucursal = sucursal;
        this.digitoDeControl = digitoDeControl;
        this.numeroDeCuenta = numeroDeCuenta;
    }

    public void setBanco(int banco) {
        this.banco = banco;
    }

    public void setSucursal(int sucursal) {
        this.sucursal = sucursal;
    }

    public void setDigitoDeControl(int digitoDeControl) {
        this.digitoDeControl = digitoDeControl;
    }

    public void setNumeroDeCuenta(int numeroDeCuenta) {
        this.numeroDeCuenta = numeroDeCuenta;
    }

    public int getBanco() {
        return banco;
    }

    public int getSucursal() {
        return sucursal;
    }

    public int getDigitoDeControl() {
        return digitoDeControl;
    }

    public int getNumeroDeCuenta() {
        return numeroDeCuenta;
    }

    @Override
    public String toString() {
        return ("Banco: " + banco + "\nSucursal: " + sucursal
                + "\nDigito de control: " + digitoDeControl + "\nNumero de Cuenta: " + numeroDeCuenta);
    }
}
