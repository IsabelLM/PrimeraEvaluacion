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

        setBanco(banco);
        setSucursal(sucursal);
        setDigitoDeControl(digitoDeControl);
        this.numeroDeCuenta = numeroDeCuenta;
    }

    public void setBanco(int banco) {
        if (banco >= 0 && banco <= 9999) {
            this.banco = banco;
        } else {
            System.out.println("El codigo de banco es incorrecto");
        }
    }

    public void setSucursal(int sucursal) {
        if (sucursal >= 0 && sucursal <= 9999) {
            this.sucursal = sucursal;
        } else {
            System.out.println("Sucursal es incorrecto");
        }
    }

    public void setDigitoDeControl(int digitoDeControl) {
        if (digitoDeControl >= 0 && digitoDeControl <= 99) {
            this.digitoDeControl = digitoDeControl;
        } else {
            System.out.println("Digito de control erroneo");
        }
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

    public String toString() {
        String aux;
        aux = "Banco: " + getBanco() + "Sucursal: " + getSucursal()
                + "Digito de Control: " + getDigitoDeControl()
                + "Numero de cuenta " + getNumeroDeCuenta();
        return aux;
    }

    public boolean equals(Object o) {
        NumeroDeCuenta nc = (NumeroDeCuenta) o;
        if (this.getBanco() == nc.getBanco()
                && this.getSucursal() == nc.getSucursal()
                && this.getDigitoDeControl() == nc.getDigitoDeControl()
                && this.getNumeroDeCuenta() == nc.getNumeroDeCuenta()) {
            return true;
        } else {
            return false;
        }
    }
}
