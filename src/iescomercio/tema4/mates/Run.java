/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iescomercio.tema4.mates;

/**
 *
 * @author VESPERTINO
 */
public class Run {
    public static void main(String[] args) {
        Mates mate = new Mates(60);
        
        System.out.println(mate.esPerfecto());
        System.out.println(mate.esPrimo());
        mate.listaPerfectos();
        mate.listaNumeros();
        mate.base2();
    }
}
