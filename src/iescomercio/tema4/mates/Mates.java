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
public class Mates {

    private int numero;

    public Mates(int numero) {
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public boolean esPerfecto() {
        int suma, i;
        boolean perfecto;
        suma = 0;
        perfecto = false;

        for (i = 1; i < numero; i++) {
            if (numero % i == 0) {
                suma = suma + i;
            }
        }
        if (suma == numero) {
            perfecto = true;
        } else {
            perfecto = false;
        }
        return perfecto;
    }

    public boolean esPrimo() {
        boolean primo;
        primo = false;
        if (numero / 2 == 0) {
            primo = false;
        } else if (numero / numero == 0 && numero / 1 == 0) {
            primo = true;
        }
        return primo;
    }

    public void listaPerfectos() {
        String contador = "";

        for (int i = 0; i < numero; i++) {
            contador += i;
        }
        System.out.println(contador);
    }

    public void listaNumeros() {
        String contador = "";

        for (int i = 0; i < numero + 1; i++) {

            contador += i;
        }
        System.out.println(contador);
    }

    public void sumaCifras() {
    }

    public void numDivisores() {
    }

    public void base2() {
    }

}
