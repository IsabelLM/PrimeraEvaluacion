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
        int suma = 0;

        for (int i = 1; i < numero; i++) {
            if (numero % i == 0) {
                suma = suma + i;
            }
        }
        if (suma == numero) {
            return true;
        } else {
            return false;
        }
    }

    public boolean esPrimo() {
        int contador = 0;
        for (int i = 2; i <= numero; i++) {//empiezo a dos para decir que solo sean divisibles por si mismo
            if (numero % i == 0) {
                contador++;
            }
        }
        if (contador == 1) {
            return true;
        } else {
            return false;
        }
    }

    //    public boolean esPrimo() {
    //        boolean primo;
    //        primo = false;
    //        if (numero / 2 == 0) {
    //            primo = false;
    //        } else if (numero / numero == 0 && numero / 1 == 0) {
    //            primo = true;
    //        }
    //        return primo;
    //    }
    public void listaPerfectos() {
        int suma;
        System.out.println("Lista de numeros perfectos hasta N");
        for (int a = 1; a < numero; a++) {
            suma = 0;
            for (int b = 1; b < a; b++) {
                if (a % b == 0) {
                    suma = suma + b;
                }
            }
            if (suma == a) {
                System.out.println(suma);
            }
        }
    }

    public void listaNumeros() {
        for (int a = 1; a <= numero; a++) {
            System.out.println(a);
        }
    }

    public int sumaCifras() {
        int suma = 0;
        while (numero != 0) {
            suma = suma + (numero % 10);
            numero = numero / 10;
        }
        return suma;
    }

    public int numDivisores() {
        int contador = 0;
        for (int i = 1; i <= numero; i++) {
            if (numero % i == 0) {
                contador++;
            }
        }
        return contador;
    }

    public String base2() {
        //return Integer.toBinaryString(numero);
        String binario = "";
        while (numero != 0) { //se pone hasta 0 para quedarte con el resultado de la ultima división
            if (numero % 2 == 0) {
                binario = "0" + binario;
            } else {
                binario = "1" + binario;
            }
            numero = numero / 2;
        }
        return binario;
    }
}
