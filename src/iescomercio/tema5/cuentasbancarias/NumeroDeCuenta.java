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

    public NumeroDeCuenta(int pBanco, int pSucursal, int pDigitoDeControl, int pNumeroDeCuenta) {
        banco = pBanco;
        sucursal = pSucursal;
        digitoDeControl = pDigitoDeControl;
        numeroDeCuenta = pNumeroDeCuenta;
    }

    public void setBanco(int pBanco) {
        banco = pBanco;
    }

    public void setSucursal(int pSucursal) {
        sucursal = pSucursal;
    }

    public void setDigitoDeControl(int pDigitoDeControl) {
        digitoDeControl = pDigitoDeControl;
    }

    public void setNumeroDeCuenta(int pNumeroDeCuenta) {
        numeroDeCuenta = pNumeroDeCuenta;
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
    public String toString(){
        return ("Banco: " + banco + " Sucursal " + sucursal 
                + " Digito de control " + digitoDeControl + " Numero de Cuenta " + numeroDeCuenta);
    }
}
