/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iescomercio.tema4.garaje;

/**
 *
 * @author VESPERTINO
 */
public class Motor {

    private int litrosAceite, cv;

    public Motor() {
    }

    public Motor(int pCv) {
        cv = pCv;
        litrosAceite = 0;
    }

    public int getLitros() {
        return litrosAceite;
    }

    public int getCV() {
        return cv;
    }

    public void setLitros(int pLitrosAceite) {
        litrosAceite = pLitrosAceite;
    }
}
