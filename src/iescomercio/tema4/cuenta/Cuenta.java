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
public class Cuenta {
    //atributos

    double saldo;

    //constructores
    public Cuenta() {
        saldo = 0;
    }

    public Cuenta(double x) {
        saldo = x;
    }

    //métodos
    public void ingresar(double dinero) { //void no devuelve nada
        saldo = saldo + dinero;
    }

    public boolean reintegro(double sacarDinero) {
        if (saldo >= sacarDinero) {
            saldo = saldo - sacarDinero;
            return true;
        } else {
            System.out.println("Saldo insuficiente");
            return false;
        }
    }

    public double getSaldo() {
        return saldo;
    }
}
