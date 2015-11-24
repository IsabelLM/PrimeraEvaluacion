/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iescomercio.tema5.amarres;

import java.util.Objects;

/**
 *
 * @author VESPERTINO
 */
public class Cliente {

    private String nombre;
    private int dni;

    public Cliente(String nombre, int dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    @Override
    public boolean equals(Object obj) {
        Cliente aux = (Cliente) obj;
        if (aux.getDni() == this.getDni()) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return getDni() + " " + getNombre();
    }
    
    
}
