/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iescomercio.tema5.punto;

/**
 *
 * @author VESPERTINO
 */
public class Punto {

    int x, y;

//    public Punto(int pX, int pY) {
//        x = pX;
//        y = pY;
//    }
    public Punto(int pX) {
        x = pX;
        y = 1;
    }

    @Override
    public String toString() {
        return "(" + x + "." + y + ")";
    }

    //Sobrecarga 
    public int equals(Punto o) {

        Punto p = o;

        if (p.x > p.y) {
            return x;
        } else {
            return y;
        }

    }

    //sobreescritura
    @Override
    public boolean equals(Object o) {

        Punto p = (Punto) o;

        if (x == p.x && y == p.y) {
            return true;
        } else {
            return false;
        }

    }

}
