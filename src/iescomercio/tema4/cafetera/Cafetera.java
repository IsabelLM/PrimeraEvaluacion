/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iescomercio.tema4.cafetera;

/**
 *
 * @author VESPERTINO
 */
public class Cafetera {

    int capacidadMaxima, cantidadActual;

    public Cafetera() {
        capacidadMaxima = 1000;
        cantidadActual = 0;
    }

    public Cafetera(int pCapacidadMaxima) {
        capacidadMaxima = pCapacidadMaxima;
        cantidadActual = pCapacidadMaxima;
    }

    public Cafetera(int pCapacidadMaxima, int pCantidadActual) {
        capacidadMaxima = pCapacidadMaxima;
        cantidadActual = pCantidadActual;

        if (cantidadActual > capacidadMaxima) {
            cantidadActual = capacidadMaxima;
        }
    }

    public void setCapacidadMaxima(int capacidadMaxima) {
        capacidadMaxima = capacidadMaxima;
    }

    public void setCantidadActual(int cantidadActual) {
        cantidadActual = cantidadActual;
    }

    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public int getCantidadActual() {
        return cantidadActual;
    }

    public void llenarCafetera() {
        cantidadActual = capacidadMaxima;
    }

    public void servirTaza(int pCantidad) {
        if (cantidadActual < pCantidad) {
            cantidadActual = 0;
        } else {
            cantidadActual = cantidadActual - pCantidad;
        }
    }

    public void vaciarCafetera() {
        cantidadActual = 0;
    }
    
    public void agregarCafe(int pCafeAñadido){
        cantidadActual = cantidadActual + pCafeAñadido;
    }
}
