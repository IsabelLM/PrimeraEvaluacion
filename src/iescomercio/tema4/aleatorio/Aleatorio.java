/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iescomercio.tema4.aleatorio;

import java.util.Scanner;

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

    public void setInicial(int pInicial) {
        inicial = pInicial;
    }

    public void setFinal(int pFinal) {
        afinal = pFinal;
    }

    public void indicaInicialFinal() {
        Scanner sc = new Scanner(System.in);
        int i, f;
        
    }

    public void muestraAleatorios(int pNumero) {

        double valorAleatorio;

        for (; pNumero != 0; pNumero--) {

            //Para sacar enteros:
            // valorAleatorio = (int) Math.floor(Math.random() * (inicial - afinal + 1) + afinal);
            //Para sacar decimales:
            valorAleatorio = Math.random() * (inicial - afinal) + afinal;
            System.out.println(valorAleatorio);
        }
    }

}
