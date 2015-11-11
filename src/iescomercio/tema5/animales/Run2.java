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
public class Run2 {
    public static void main(String[] args) {
        Animal animal = new Lobo();
        
        animal.hacerRuido();
        animal.rugir();
        animal.comer();
        animal.dormir();
    }
}
