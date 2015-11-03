/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iescomercio.tema4.aleatorio;

/**
 *
 * @author VESPERTINO
 */
public class Aleatorio {

    private int inicial, afinal;

    public Aleatorio(int pInicial, int pFinal) {
        inicial = pInicial;
        afinal = pFinal;
    }

    public double muestraAleatorios(int pNumero) {
        //double valorAleatorio = Math.random() * (inicial - afinal) + ;
        double valorAleatorio = 0;
        while (pNumero != 0) {

            valorAleatorio = Math.random() * (inicial - afinal) + afinal;
            System.out.println(valorAleatorio);
            pNumero--;
        }
        return valorAleatorio;

    }
}
