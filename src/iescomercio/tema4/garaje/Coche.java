/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iescomercio.tema4.garaje;

/**
 *
 * @author VESPERTINO
 */
public class Coche {

    private Motor aMotor;
    private String marca, modelo;
    private double precioAverias;

    public Coche(String pMarca, String pModelo) {
        marca = pMarca;
        modelo = pModelo;
        aMotor = new Motor(100);
        precioAverias = 0;
    }

    public Motor getaMotor() {
        return aMotor;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public double getPrecioAverias() {
        return precioAverias;
    }

    public void acumularAveria(double pPrecioAveria) {

        precioAverias += pPrecioAveria;
    }

}
