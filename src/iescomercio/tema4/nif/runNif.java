/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iescomercio.tema4.nif;

/**
 *
 * @author VESPERTINO
 */
public class runNif {

    public static void main(String[] args) {
        Nif miNif;
        miNif = new Nif(16637938);
     
        miNif.mostrarNif();

        miNif.setNumero(16637938);
        miNif.mostrarNif();

        
        miNif.leer();
        miNif.mostrarNif();
    }
}
