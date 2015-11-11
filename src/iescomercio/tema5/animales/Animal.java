/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iescomercio.tema5.animales;

/**
 *
 * @author VESPERTINO
 */
public class Animal {

    private String foto, tipo_comida, localizacion, tamaño;

    public void hacerRuido() {
        System.out.println("Hago ruido");
    }

    public void comer() {
        System.out.println("Estoy comiendo como animal");
    }

    public void dormir() {
        System.out.println("Duermo como un animal");
    }

    public void rugir() {
        System.out.println("Rujo como un animal");
    }
}
