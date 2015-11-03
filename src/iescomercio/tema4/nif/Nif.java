/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iescomercio.tema4.nif;

import java.util.Scanner;

/**
 *
 * @author VESPERTINO
 */
public class Nif {

    private int numero;
    private char letra;

    public Nif() {
        numero = 0;
        letra = ' ';
    }

    public Nif(int pNumero) {
        numero = pNumero;
        //estrablecer la letra
        letra = calcularLetra();
    }

    public void setNumero(int pNumero) {
        numero = pNumero;
        letra = calcularLetra();
    }

    public long getNumero() {
        return numero;
    }

    public void leer() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Dime tu dni: ");
        numero = sc.nextInt();
        letra = calcularLetra();
    }

    public void mostrarNif() {
        System.out.println(+numero + "-" + letra);
    }

    public char calcularLetra() {
        int resto = numero % 23;
        switch (resto) {
            case 0:
                return 'T';
            case 1:
                return 'R';
            case 2:
                return 'W';
            case 3:
                return 'A';
            case 4:
                return 'G';
            case 5:
                return 'M';
            case 6:
                return 'Y';
            case 7:
                return 'F';
            case 8:
                return 'P';
            case 9:
                return 'D';
            case 10:
                return 'X';
            case 11:
                return 'B';
            case 12:
                return 'N';
            case 13:
                return 'J';
            case 14:
                return 'Z';
            case 15:
                return 'S';
            case 16:
                return 'Q';
            case 17:
                return 'V';
            case 18:
                return 'H';
            case 19:
                return 'L';
            case 20:
                return 'C';
            case 21:
                return 'K';
            case 22:
                return 'E';
        }
        return letra;
    }
}
