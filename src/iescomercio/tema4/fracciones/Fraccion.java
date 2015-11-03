/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iescomercio.tema4.fracciones;

/**
 *
 * @author VESPERTINO
 */
public class Fraccion {

    private int numerador, denominador;

    public Fraccion() {
        numerador = 2;
        denominador = 4;
    }

    public Fraccion(int pNumerador, int pDenominador) {
        numerador = pNumerador;
        denominador = pDenominador;
    }

    public void setDenominador(int pDenominador) {
        denominador = pDenominador;
    }

    public void setNumerador(int pNumerador) {
        numerador = pNumerador;
    }

    public int getDenominador() {
        return denominador;
    }

    public int getNumerador() {
        return numerador;
    }

    public Fraccion suma(Fraccion f) {
        Fraccion aux = new Fraccion();
        int n, d;
        if (denominador == f.getDenominador()) { //suma homogenea
            n = numerador + f.getNumerador();
            d = denominador;
        } else { //suma heterogenea
            n = numerador * f.getDenominador() + denominador * f.getNumerador();
            d = denominador * f.getDenominador();
        }
        aux.setNumerador(n);
        aux.setDenominador(d);
        return aux;
    }

    public Fraccion resta(Fraccion f) {
        Fraccion aux = new Fraccion();
        int n, d;

        if (denominador == f.getDenominador()) { //resta homogenea
            n = numerador - f.getDenominador();
            d = denominador;
        } else { //resta heterogenea
            n = numerador * f.getDenominador() - denominador * f.getNumerador();
            d = denominador * f.getDenominador();
        }
        aux.setNumerador(n);
        aux.setDenominador(d);
        return aux;
    }

    public Fraccion multiplicacion(Fraccion f) {
        Fraccion aux = new Fraccion();
        int n, d;
        n = numerador * f.getDenominador();
        d = denominador * f.getDenominador();
        aux.setNumerador(n);
        aux.setDenominador(d);
        return aux;
    }

    public Fraccion division(Fraccion f) {
        Fraccion aux = new Fraccion();
        int n, d;
        n = numerador * f.getDenominador();
        d = denominador * f.getNumerador();
        aux.setNumerador(n);
        aux.setDenominador(d);
        return aux;
    }

    public Fraccion copia(Fraccion f) {
        Fraccion aux = new Fraccion();
        int n, d;
        n = numerador;
        d = denominador;
        aux.setDenominador(d);
        aux.setNumerador(n);
        return aux;
    }

    public float calculaReal() {
        float resultado;
        resultado = numerador / denominador;
        return resultado;
    }

    public void print() {
        System.out.println(numerador);
        System.out.println("-");
        System.out.println(denominador);
    }

}
